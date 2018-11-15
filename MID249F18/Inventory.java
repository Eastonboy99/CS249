class Inventory {
    private int numItems;
    private int numComputers;
    private int numStorage;
    private Computer computerItems[];
    private Storage storageItems[];

    Inventory() {
        numItems = 0;
        numComputers = 0;
        numStorage = 0;
    }

    public int generateId() {
        this.numItems++;
        return this.numItems;
    }

    public void AddComputer(Computer newComputer) {
        this.increaseNumComputers();
        newComputer.setId(this.numItems);
        Computer oldComputers[] = this.computerItems;

        this.computerItems = new Computer[this.numComputers];
        for (int i = 0; i < this.numComputers - 1; i++) {
            this.computerItems[i] = oldComputers[i];
        }

        this.computerItems[this.numComputers - 1] = newComputer;
    }

    public void removeComputer(int index) {
        this.decreaseNumComputers();
        Computer oldComputers[] = this.computerItems;
        this.computerItems = new Computer[this.numComputers];
        int j = 0;
        for (int i = 0; i < this.numComputers; i++) {
            if (i == index) {
                j++;
            }
            this.computerItems[i] = oldComputers[j];
            j++;
        }
    }

    private void increaseNumComputers() {
        this.numComputers++;
        this.numItems++;
    }

    private void decreaseNumComputers() {
        this.numComputers--;

    }

    public void AddStorage(Storage newStorage) {
        this.increaseNumStorage();
        newStorage.setId(this.numItems);
        Storage oldStorages[] = this.storageItems;

        this.storageItems = new Storage[this.numStorage];
        for (int i = 0; i < this.numStorage - 1; i++) {
            this.storageItems[i] = oldStorages[i];
        }

        this.storageItems[this.numStorage - 1] = newStorage;
    }

    public void removeStorage(int index) {
        this.decreaseNumStorage();
        Storage oldStorage[] = this.storageItems;
        this.storageItems = new Storage[this.numStorage];
        int j = 0;
        for (int i = 0; i < this.numStorage; i++) {
            if (i == index) {
                j++;
            }
            this.storageItems[i] = oldStorage[j];
            j++;
        }
    }

    private void increaseNumStorage() {
        this.numStorage++;
        this.numItems++;
    }

    private void decreaseNumStorage() {
        this.numStorage--;

    }

    public String search(int index) {
        for (int i = 0; i < this.numComputers; i++) {
            if (this.computerItems[i].getId() == index)
                return this.computerItems[i].report();
        }
        for (int i = 0; i < this.numStorage; i++) {
            if (this.storageItems[i].getId() == index)
                return this.storageItems[i].report();
        }
        return null;
    }

    public void ListInventory() {
        for (int i = 0; i < this.numComputers; i++) {
            System.out.println(this.computerItems[i].report());
        }
        for (int i = 0; i < this.numStorage; i++) {
            System.out.println(this.storageItems[i].report());
        }
    }

}