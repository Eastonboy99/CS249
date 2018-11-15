
class Computer {
    private int id;
    private String model;
    private String make;
    private String type;

    Computer() {
    };

    Computer(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }
    public int getId() {
        return id;
    }
    public void setType(String type) {
        this.type = type;
    }

    public String report() {
        return "ID: " + this.getId() + "Make: " + this.getMake() + " Model: " + this.getModel() + " Type: " + this.getType();
    }

}