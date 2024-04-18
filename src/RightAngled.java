import java.util.Scanner;

public class RightAngled {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the angles of the triangle:");
        System.out.println("enter side 1:");
        System.out.println("enter side 2:");
        System.out.println("enter side 3:");
        int side1 = scanner.nextInt();
        int side2 = scanner.nextInt();
        int side3 = scanner.nextInt();
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            System.out.println("invalid triangle");
        } else if ((side1 * side1) + (side2 * side2) == (side3 * side3)){
            System.out.println("right angled triangle");
    }else if((side2 * side2) + (side3 * side3) == (side1 * side1)) {
            System.out.println("right angled triangle");
        } else if ((side1 * side1) + (side3 * side3) == (side2 * side2)){
            System.out.println("right angled triangle");

        }else{
            System.out.println("not a right angled triangle");
        }


    }
}
