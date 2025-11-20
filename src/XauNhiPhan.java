import java.util.Scanner;

public class XauNhiPhan {

    static long[] F = new long[93];

    static {
        F[1] = 1;
        F[2] = 1;
        for (int i = 3; i < 93; i++) {
            F[i] = F[i - 1] + F[i - 2];
        }
    }
    public static char findChar(int n, long k) {
        if (n == 1) return '0';
        if (n == 2) return '1';
        if (k <= F[n - 2]) {
            return findChar(n - 2, k);
        }
        return findChar(n - 1, k - F[n - 2]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long k = sc.nextLong();
            System.out.println(findChar(n, k));
        }
        sc.close();
    }
}