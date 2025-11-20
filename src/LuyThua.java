import java.util.Scanner;
public class LuyThua {
    static final long MOD = 1000000007;
    static long powMod(long base, long exp){
        long result = 1;
        base %= MOD;
        while (exp >0){
            if((exp &1)== 1){
                result = (result * base) % MOD;
            }
            base = ( base * base) % MOD;
            exp >>= 1;
            
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){
        int a = sc.nextInt();
        long b = sc.nextLong();
        if(a ==0 && b == 0) break;
        long result = powMod(a, b);
        System.out.println(result);
        
    }
    sc.close();
    }
}
