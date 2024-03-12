public class arrayno12 {
    public static void main(String[] args){
        int[] array = {1, 2, 3, 4, 5};
int num = 3; // number to check
boolean exists = false;
for (int i : array) {
    if (i == num) {
        exists = true;
        break;
    }
}
System.out.println("Number exists: " + exists);

    }
    
}
