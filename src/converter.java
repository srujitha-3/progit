import java.sql.SQLOutput;
import java.util.Scanner;

public class converter {
public static  void main(String [] args){
   Scanner scanner=new Scanner(System.in);
    System.out.println("enter no of hours");
    System.out.println("enter no of days");
    int hours= scanner.nextInt();
    int days= scanner.nextInt();
if (hours>0){
    int min=hours*60;
    System.out.println("no of min in a given hour:"+min);

}else{
    System.out.println("invalid");
}
if (days>0){
    int minutes =days*24*60;
    System.out.println("no of min in a given day:"+minutes);
}else{
    System.out.println("invalid");
}


}
    }






