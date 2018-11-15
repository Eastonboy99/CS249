class Desktop extends Computer {
    Desktop() {
        super();
        this.setType("desktop");
    }

    Desktop(String make, String model) {
        super(make, model);
        this.setType("desktop");
    }

    public String report() {
        return "ID: " + this.getId() + "Make: " + this.getMake() + " Model: " + this.getModel() + " Type: " + this.getType();
    }
}