public class ThisKeywordDemo {

    private int number;
	
    public ThisKeywordDemo(int number) {
        this.number = number;
    }
    public void display() {
        System.out.println("The value of number is: " + this.number);
    }
    public void show() {
        System.out.println("Calling display() method using 'this':");
        this.display(); 
    }	
    public static void main(String[] args) {

        ThisKeywordDemo obj = new ThisKeywordDemo(42);
        obj.display();
        obj.show();
    }
}
