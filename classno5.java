public class classno5 {
    String name;
    int age;
    String gender;

    public classno5(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age + ", Gender: " + gender);
    }
    public static void main(String[] args) {
        classno5 student = new classno5("Adam", 20,"male"); 
        student.displayInfo();
}

}