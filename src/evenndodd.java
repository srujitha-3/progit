import java.util.Scanner;

public class evenndodd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the numbers:");
        int n = scanner.nextInt();
        if(n%2==0){
            System.out.println("the number is even");
        }else{
            System.out.println("the number is odd");
        }
    }
}
