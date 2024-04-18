import java.util.Scanner;

public class numtriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number:");
        int n = scanner.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println("\n");
        }
        for(int k=1;k<=n;k++){
            for(int l=(n-k);l>=1;l--){
                System.out.print(l+" ");
            }
            System.out.println("\n");
        }
    }
}
