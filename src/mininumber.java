import java.util.Scanner;

public class mininumber {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the numbers:");
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        char min,max;
        if(a>b){
            max='a';
            System.out.println("max number is:"+max);
        }if(a<b){
            min='b';
            System.out.println("min number is:"+min);
        }
    }
}
