
import java.util.Scanner;

public class SoKhongLienKe {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while (t-- > 0) {
            boolean ok = true;
            int sumMod = 0;
            String s = sc.next();
            for (int i = 0; i < s.length(); i++) {
                int digit = s.charAt(i) - '0';
                sumMod = (sumMod + digit) % 10;

                if (i > 0) {
                    int prev = s.charAt(i - 1) - '0';
                    if (Math.abs(digit - prev) != 2) {
                        ok = false;
                        break;
                    }
                }
            }
            if (ok && sumMod == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }

}
