import java.awt.*;

public class point {
    private int x;
    private int y;

    public point(int x, int y) {
        this.x = x;
        this.y = y;
    }


    public int getX() {
        return x;
    }

    public int getY() {
        return y;

    }

    public static int move(int dx, int dy) {
        this.x = this.x + dx;
        this.y = this.y + dy;

        return dx;
    }

    //    public  double distanceto(int i, int i1) {
//       this.i=i;
//       this.i1=i1;
//        int x1=this.x- i;
//        int y1=this.y-i1;
//        return Math.sqrt(x1*x1 + y1*y1);
//    }
    public static double distanceto;


        int x1;
        int y1;
        {
            Point other;
            x1 = this.x - other.x;
            y1 = this.y - other.y;
            return Math.sqrt(x1 * x1 + y1 * y1);

        }
    }



