import java.util.Scanner;

public class nevenodd {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("enter the number:");
    int n = scanner.nextInt();
    System.out.println("even numbers are:");
    for(int i=n;i>=0;i--) {
        if (i % 2 == 0) {
            System.out.println( i);
        }
    }
    System.out.println("odd numbers are:");
    for(int j=n;j>=0;j--){
        if (j%2!=0){
            System.out.println(j);
        }
    }
}

}
