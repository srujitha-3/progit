import java.util.Scanner;

public class vowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the alphabet:");
        char ch = scanner.next().charAt(0);
        if((ch =='e') || (ch == 'a') || (ch == 'i') || (ch == 'o') || (ch =='u')){
            System.out.println("vowel");
        }else{
            System.out.println("not vowel");
        }
    }
}
