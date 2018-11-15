
class Storage {
    private int id;
    private String model;
    private String make;
    private String type;
    private double speed;

    Storage() {
    };

    Storage(String make, String model, double Speed, String type) {
        this.make = make;
        this.model = model;
        this.setSpeed(speed);
        this.setType(type);
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getSpeed() {
        return speed;
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
        return "ID: " + this.getId() + " Make: " + this.getMake() + " Model: " + this.getModel() + " Type: "
                + this.getType();
    }

}