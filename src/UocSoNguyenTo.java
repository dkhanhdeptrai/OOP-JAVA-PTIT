import java.util.Scanner;

public class UocSoNguyenTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            long somax = -1;
            while(n%2==0){
                somax = 2;
                n/=2;
            }
            for(long i = 3; i*i<=n; i+=2){
                while(n%i==0){
                    somax = i;
                    n/=i;
                }
            }
            if(n>2){
                somax = n;
            }
            System.out.println(somax);
        }
        sc.close();
    }
    
}
