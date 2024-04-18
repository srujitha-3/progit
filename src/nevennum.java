import java.util.Scanner;

public class nevennum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number:");
        int n = scanner.nextInt();
        System.out.println("even numbers are:");
        for(int i=0;i<=n;i++) {
            if (i % 2 == 0) {
                System.out.println( i);
            }
        }
        System.out.println("odd numbers are:");
            for(int j=0;j<=n;j++){
                if (j%2!=0){
                    System.out.println(j);
                }
            }
        }
    }

