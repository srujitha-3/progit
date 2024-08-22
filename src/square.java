import java.util.Scanner;

public class square {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number:");
        int side = scanner.nextInt();
                if(side>0){
                    int area =side*side;
                    System.out.println("area of the square"+area);
                    int perimeter =4*side;
                    System.out.println("perimeter of the square"+perimeter);
                }else{
                    System.out.println("invalid");

                }

            }

        }




