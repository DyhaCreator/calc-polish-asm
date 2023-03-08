import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int a,b;
        a = str.charAt(0) - '0';
        b = str.charAt(1) - '0';
        if(str.charAt(2)=='+') {
            System.out.println(a+b);
        }
        else if(str.charAt(2)=='-') {
            System.out.println(a-b);
        }
    }
}