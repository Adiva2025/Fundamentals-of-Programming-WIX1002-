package lab;

class Shape{
   public String name;
   public double perimeter;
   public double area;

   public double getPerimeter() { 
    return perimeter; }

   public void setPerimeter(double perimeter) { 
    this.perimeter = perimeter; }

   public double getArea() { 
    return area; }

   public void setArea(double area) { 
    this.area = area; }


   public void display(){
    System.out.println("Name of the shape: " + name);
    System.out.printf("Perimeter: %.2f\n", perimeter);
    System.out.printf("Area: %.2f\n", area);
   }
}
class Rectangle extends Shape{
    private double length;
    private double width;

    public void setDimensions(double length, double width){
        this.length = length;
        this.width = width;
    }
    public void calculate(){
        name = "Rectangle";
        perimeter = 2 * (length + width);
        area = length * width;
    }
}

class Square extends Shape{
    private double side;
    public void setDimensions(double side){
        this.side = side;
    }
    public void calculate(){
        name = "Square";
        perimeter = 4 * side;
        area = side * side;
    }
} 

class Circle extends Shape{
    private double diameter;
    private static final double PI = 3.14159;
    public void setDimensions(double diameter){
        this.diameter = diameter;
    }
    public void calculate(){
        name = "Circle";
        perimeter = PI * diameter;
        area = PI * (diameter/2) * (diameter/2);
    }
}
public class L9Q1 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setDimensions(5.0, 3.0);
        rectangle.calculate();
        rectangle.display();

        System.out.println();

        Square square = new Square();
        square.setDimensions(4.0);
        square.calculate();
        square.display();

        System.out.println();

        Circle circle = new Circle();
        circle.setDimensions(6.0);
        circle.calculate();
        circle.display();
    }
}
