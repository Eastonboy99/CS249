class Laptop extends Computer {
    private double screenSize;
    private int screenResolution[] = new int[2];

    Laptop() {
        super();
        this.setType("laptop");
    }

    Laptop(String make, String model) {
        super(make, model);
        this.setType("laptop");
    }

    Laptop(String make, String model, int screenResolutionX, int screenResolutionY, double screenSize) {
        super(make, model);
        this.setType("laptop");
        this.setScreenResolution(screenResolutionX, screenResolutionY);
        this.setScreenSize(screenSize);
    }

    /**
     * @param screenResolution the screenResolution to set
     */
    public void setScreenResolution(int screenResolutionX, int screenResolutionY) {
        this.screenResolution[0] = screenResolutionX;
        this.screenResolution[1] = screenResolutionY;
    }

    /**
     * @param screenSize the screenSize to set
     */
    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public String report() {
        return "ID: " + this.getId() + "Make: " + this.getMake() + " Model: " + this.getModel() + " Type: " + this.getType()
                + " Screen Resolution: " + this.screenResolution[0] + " by " + this.screenResolution[1]
                + " Screen Size(in): " + this.screenSize;
    }
}