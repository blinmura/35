import java.util.Arrays;

public class arrayno82 {
    public static void main(String[] args) {
  
    String[] array = {"OOP", "SQL"};
    for (int i = 0; i < array.length; i++) {
        if ("SQL".equals(array[i])) {
        array[i] = "DATABASE";
        
    }
}
System.out.println(Arrays.toString(array));
    }
}
