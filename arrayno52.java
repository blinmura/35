import java.util.Scanner;

public class arrayno52 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
System.out.println("Enter a number: ");
int num = scanner.nextInt();
int sum = 0;
int i = 1;
while (i <= num) {
    sum += i;
    i++;
}
System.out.println("The sum is " + sum);

    }
    
}
