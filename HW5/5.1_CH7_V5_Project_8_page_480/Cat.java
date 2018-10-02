public class Cat extends Pet {

    public Cat(String initialName, int initialAge, double initialWeight) {
        super(initialName, initialAge, initialWeight);
    }

    public Cat(String initialName) {
        super(initialName);
    }

    public Cat(int initialAge) {
        super(initialAge);
    }

    public Cat(double initialWeight) {
        super(initialWeight);
    }

    public Cat() {
        super();
    }

    public double acepromazine() {
        double dosage;
        dosage = (this.getWeight() / 2.2) * (.002 / 10);
        return dosage;
    }

    public double carprofen() {
        double dosage;
        dosage = (this.getWeight() / 2.2) * (.25 / 12);
        return dosage;
    }
}