
import java.util.Scanner;

public class BoiVaUocSoChung {

    public static  long gcd(long a, long b) { // eculid 
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long g = gcd(a, b);
            long l = (a / g) * b;
            System.out.println(l + " " + g);

        }
        sc.close();

    }
}
