import java.util.Scanner;

public class TriangleValidator {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter angles of a triangle:");
        System.out.println("angle 1:");
        System.out.println("angle 2:");
        System.out.println("angle 3:");
        int angle1=scanner.nextInt();
        int angle2=scanner.nextInt();
        int angle3=scanner.nextInt();
        if (angle1<=0|| angle2<=0 || angle3<=0){
            System.out.println("it is a invalid triangle");
        } else if (angle1+angle2+angle3==180){
            System.out.println("it is a valid triangle");

        }else{
            System.out.println("it is a invalid triangle");
        }

    }
}
