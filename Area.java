//Write a program to print the area of a rectangle by creating a class named 'Area' 
//having two methods. First method named as 'setDim' takes length and breadth of 
//rectangle as parameters and the second method named as 'getArea' returns the area
// of the rectangle. Length and breadth of rectangle are entered through keyboard.

class getArea {
     private double length;
     private double breadth ;
    // Method to set the dimensions of the rectangle
    private void setDim(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    // Method to calculate and return the area of the rectangle
    public double calculateArea() {
        return length * breadth;
			
    }
}
public class Area {
    public static void main(String[] args) {
        getArea rectangle = new getArea();
        rectangle.setDim(10, 20.8);
        // Calculate and display the area of the rectangle
        System.out.println("The area of the rectangle is: " +
		rectangle.calculateArea());
    }
}
