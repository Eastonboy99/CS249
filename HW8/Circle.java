public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.setRadius(radius);
    }

    /**
     * @return the radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * @param radius the radius to set
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(this.getRadius(), 2);
    }

    @Override
    public String getType() {
        return "Circle";
    }
}