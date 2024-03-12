public class arrayno62 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
int sum = 0;
for (int i : array) {
    sum += i;
}
double average = (double) sum / array.length;
System.out.println("The average is " + average);

    }
}
