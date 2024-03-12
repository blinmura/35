import java.util.Arrays;

public class arrayno92 {
    public static void main(String[] args) {
        String[] array = {"FIT", "ASF", "UAK"};
for (int i = 0; i < array.length; i++) {
    if (array[i].equals("UAK")) {
        array[i] = "ULK";
    }
}
System.out.println(Arrays.toString(array));
    }
}
