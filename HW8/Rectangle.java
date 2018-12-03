public class Rectangle implements Shape {
    private double length, height;

    public Rectangle(double length, double height) {
        this.setHeight(height);
        this.setLength(length);
    }

    /**
     * @return the height
     */
    public double getHeight() {
        return height;
    }

    /**
     * @return the length
     */
    public double getLength() {
        return length;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * @param length the length to set
     */
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double area() {
        return this.getHeight() * this.getLength();
    }

    @Override
    public String getType() {
        return "Rectangle";
    }
}