public class Dog extends Pet {

    public Dog(String initialName, int initialAge, double initialWeight) {
        super(initialName, initialAge, initialWeight);
    }

    public Dog(String initialName) {
        super(initialName);
    }

    public Dog(int initialAge) {
        super(initialAge);
    }

    public Dog(double initialWeight) {
        super(initialWeight);
    }

    public Dog() {
        super();
    }

    @Override
    public double acepromazine() {
        double dosage;
        dosage = (this.getWeight() / 2.2) * (.03 / 10);
        return dosage;
    }

    @Override
    public double carprofen() {
        double dosage;
        dosage = (this.getWeight() / 2.2) * (.5 / 12);
        return dosage;
    }
}