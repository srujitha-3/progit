import java.util.Scanner;

public class sumofsquares {
    public static void main(String []args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the numbers:");
        int n=scanner.nextInt();
        if(n<=0){
            System.out.println("invalid");
        }
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i*i;
            System.out.println(sum);
        }

    }
}
