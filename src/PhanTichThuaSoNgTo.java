
import java.util.Scanner;

public class PhanTichThuaSoNgTo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
       
            for (int tc = 1; tc <= t; tc++) {
                long n = sc.nextLong();
                System.out.print("Test " + tc + ": ");
                for (int i = 2; i * i <= n; i++) {
                    int count = 0;
                    while (n % i == 0) {
                        count++;
                        n /= i;
                    }
                    if (count > 0) {
                        System.out.print(i + "(" + count + ") ");
                    }
                }
                if (n > 1) {
                    System.out.print(n + "(1)");
                }
                System.out.println();
            }
            sc.close();

        }
  
    }


