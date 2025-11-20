
import java.util.Scanner;

public class UocSoChiaHetCho2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            int count = 0;
            if(n<1){
                System.out.println(0);
                continue;
            }
            for (long i = 1; i*i <= n; i++) {
                if (n%i ==0){
                    long j = n/i;
                    if(i%2==0) count++;
                    if(j % 2==0 && j!=i ) count++;
                }
            }
            System.out.println(count);

        }
        sc.close();
    }

}
