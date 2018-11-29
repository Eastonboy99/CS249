public class CH13_Project_8_Add_90Triangle {
    public static void main(String[] args) {
        Circle circle = new Circle(7);

        System.out.println("Circle Radius: " + circle.area());

        Rectangle rectangle = new Rectangle(7, 8);

        System.out.println("Rectangle Radius: " + rectangle.area());
        RightTriangle rightTriangle = new RightTriangle(7, 8);

        System.out.println("Right Triangle Radius: " + rightTriangle.area());
    }
}