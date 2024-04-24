// Develop a class named GeometryUtils with overloaded methods to calculate properties of
// geometric shapes, such as area, perimeter, and volume. Implement methods like calculateArea,
// calculatePerimeter, and calculateVolume that accept different parameters for different shapes
// like (e.g., circle, rectangle, cube)
// Supported Geometric Shapes:
// 1. Circle:
//  Parameters for area calculation: radius (double)
//  Parameters for perimeter calculation: radius (double)
// 2. Rectangle:
//  Parameters for area calculation: length (double), width (double)
//  Parameters for perimeter calculation: length (double), width (double)
// 3. Cube:
//  Parameters for volume calculation: side length (double)
public class GeometryUtil {
    public double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }
    public double calculatePerimeter(double radius) {
        return 2 * Math.PI * radius;
    }
    public double calculateArea(double length, double width) {
        return length * width;
    }
    public double calculatePerimeter(double length, double width) {
        return 2 * (length + width);
    }
    public double calculateVolume(double side) {
        return side * side * side;
    }
    public static void main(String[] args) {
        GeometryUtil geometryUtil = new GeometryUtil();
        System.out.println("Area of circle: " + geometryUtil.calculateArea(5));
        System.out.println("Perimeter of circle: " + geometryUtil.calculatePerimeter(5));
        System.out.println("Area of rectangle: " + geometryUtil.calculateArea(5, 10));
        System.out.println("Perimeter of rectangle: " + geometryUtil.calculatePerimeter(5, 10));
        System.out.println("Volume of cube: " + geometryUtil.calculateVolume(5));
    }
    
}
