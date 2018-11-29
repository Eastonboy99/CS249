public class RightTriangle implements Shape {
    double base;
    double height;

    public RightTriangle(double base, double height) {
        this.setHeight(height);
        this.setBase(base);
    }

    /**
     * @return the height
     */
    public double getHeight() {
        return height;
    }

    /**
     * @return the base
     */
    public double getBase() {
        return base;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * @param base the base to set
     */
    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public double area() {
        return .5 * this.getHeight() * this.getBase();
    }
}