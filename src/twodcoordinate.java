import java.util.Scanner;

public class twodcoordinate {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the x coordinate:");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("enter the y coordinate:");
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("enter the dx coordinate:");
        int dx1 = scanner.nextInt();
        int dy1 = scanner.nextInt();
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("enter the dy coordinate:");
        int dx2 = scanner.nextInt();
        int dy2 = scanner.nextInt();
//move
        int cx1=x1+dx1;
        int cy1=y1+dy1;
        System.out.println("new x coordinates are:"+cx1);
        System.out.println(cy1);
        int cx2=x2+dx2;
        int cy2=y2+dy2;
        System.out.println("new y coordinates are:"+cx2);
        System.out.println(cy2);
        //distance
        int newx=cx2-cx1;
        int newy=cy2-cy1;
        double distance;
               distance =  Math.sqrt ((newx*newx)+(newy*newy));
        System.out.println("distances btwn points:"+distance);



        }


    }

