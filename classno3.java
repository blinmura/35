public class classno3 {
    String make;
    int year;

    public classno3(String make, int year) {
        this.make = make;
        this.year = year;
    }

    public void displayInfo() {
        System.out.println("Make: " + make + ", Year: " + year);
    }

    public static void main(String[] args) {
        classno3 myCar = new classno3("Porsche", 1996); 
        myCar.displayInfo();
    }
}
