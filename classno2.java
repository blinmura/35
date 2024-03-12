public class classno2 {
    String title;
    String author;

    public classno2(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void displayInfo() {
        System.out.println("Title: " + title + ", Author: " + author);
    }

    public static void main(String[] args) {
        classno2 myBook = new classno2("The Great Gatsby", "F. Scott Fitzgerald");
        myBook.displayInfo();
    }
}
