class TestProgram {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        Desktop computer1 = new Desktop("Dell", "Optiplex");
        Laptop computer2 = new Laptop("Dell", "XPS 13", 1920, 1080, 13.3);
        Phone computer3 = new Phone("Samsung", "Galaxy S8", 1920, 1080, 6, 16);
        inventory.AddComputer(computer1);
        inventory.AddComputer(computer2);
        inventory.AddComputer(computer3);
        inventory.ListInventory();

        System.out.println("--------------------");
        inventory.removeComputer(1);
        inventory.ListInventory();

        System.out.println("--------------------");
        Storage storage1 = new Storage("Samsung", "Evo", 350, "SSD");
        Storage storage2 = new Storage("Seagate", "Ironwolf", 7200, "HDD");

        inventory.AddStorage(storage1);
        inventory.AddStorage(storage2);
        inventory.ListInventory();
        System.out.println("Search for 5: " + inventory.search(5));     

    }
}