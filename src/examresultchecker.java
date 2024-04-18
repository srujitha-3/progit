import java.util.Scanner;

public class examresultchecker {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter student marks:");
        int marks=scanner.nextInt();
        if(marks>=50){
            System.out.println("student is passed");
        }else{
            System.out.println("student failed");
        }

    }
}
