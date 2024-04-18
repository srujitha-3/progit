import java.util.Scanner;

public class squareofnNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number:");
        int n = scanner.nextInt();
        System.out.println("square of even numbers are:");
        for(int i=0;i<=n;i++) {
            if (i % 2 == 0) {
                int a=i*i;
                System.out.println( a);
            }
        }
        System.out.println("square of odd numbers are:");
        for(int j=0;j<=n;j++){
            if (j%2!=0){
                int b=j*j;
                System.out.println(b);
            }
        }
    }
}
