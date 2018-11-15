class Phone extends Computer {
    private double screenSize;
    private int screenResolution[] = new int[2];
    private double cameraMegapixels;

    Phone() {
        super();
        this.setType("phone");
    }

    Phone(String make, String model) {
        super(make, model);
        this.setType("phone");
    }

    Phone(String make, String model, int screenResolutionX, int screenResolutionY, double screenSize) {
        super(make, model);
        this.setType("phone");
        this.setScreenResolution(screenResolutionX, screenResolutionY);
    }

    Phone(String make, String model, int screenResolutionX, int screenResolutionY, double screenSize,
            double cameraMegapixels) {
        super(make, model);
        this.setType("phone");
        this.setScreenResolution(screenResolutionX, screenResolutionY);
        this.setCameraMegapixels(cameraMegapixels);
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
    /**
     * @param cameraMegapixels the cameraMegapixels to set
     */
    public void setCameraMegapixels(double cameraMegapixels) {
        this.cameraMegapixels = cameraMegapixels;
    }

    public String report() {
        return "ID: " + this.getId() + "Make: " + this.getMake() + " Model: " + this.getModel() + " Type: " + this.getType()
                + " Screen Resolution: " + this.screenResolution[0] + " by " + this.screenResolution[1]
                + " Screen Size(in): " + this.screenSize + " Camera Megapixels: " + this.cameraMegapixels;
    }
}