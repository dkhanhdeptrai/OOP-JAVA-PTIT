import java.util.Scanner;

public class soDep2{

    public static boolean isBeautiful(String s) {
        if (s.charAt(0) != '8' || s.charAt(s.length() - 1) != '8') {
            return false;
        }

        int len = s.length();
        for (int i = 0; i < len / 2; i++) {
            if (s.charAt(i) != s.charAt(len - 1 - i)) {
                return false;
            }
        }

        int sumOfDigits = 0;
        for (int i = 0; i < len; i++) {
            sumOfDigits += s.charAt(i) - '0';
        }

        if (sumOfDigits % 10 != 0) {
            return false;
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