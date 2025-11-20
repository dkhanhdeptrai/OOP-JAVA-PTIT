
import java.util.Scanner;

public class soDep1 {

    public static boolean isBeautiful(String s) {
        int len = s.length();
        for (int i = 0; i < len / 2; i++) {
            if (s.charAt(i) != s.charAt(len - 1 - i)) {
                return false;
            }
        }

        for (int i = 0; i < len; i++) {
            int digit = s.charAt(i) - '0';
            if (digit % 2 != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        while (t-- > 0) {
            String n = sc.nextLine();
            if (isBeautiful(n)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
