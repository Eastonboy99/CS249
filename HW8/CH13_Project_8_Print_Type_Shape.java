public class CH13_Project_8_Print_Type_Shape {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];

        shapes[0]=new Circle(7);
        shapes[1]=new Rectangle(7, 8);
        shapes[2]= new RightTriangle(7, 8);
        
        for(Shape shape : shapes){
            System.out.println(shape.area());
        }
        
    }
}