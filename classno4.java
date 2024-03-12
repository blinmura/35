public class classno4 {
    String name;
    int age;
    int course;

    public classno4(String name, int age, int course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age + ", Course: " + course);

    }

        public static void main(String[] args) {
            classno4 student = new classno4("Adam", 20,4); 
            student.displayInfo();
    }
}

