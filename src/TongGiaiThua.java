import java.util.Scanner;
public class TongGiaiThua {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sum = 0;
             long fact = 1;
             for(int i = 1; i<=n;i++){
                 fact*=i;
                 sum += fact;
             }
             System.out.println(sum);
             sc.close();
    }
    
}
