import java.util.Scanner;
public class hinhChuNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a<=0 || b<=0){
            System.out.println(0);
        }
        else{
        int x1 = 2 *(a +b);
        int x2 = a*b;
        System.out.printf("%d %d",x1, x2);
        }
        sc.close();
    }
    
}
