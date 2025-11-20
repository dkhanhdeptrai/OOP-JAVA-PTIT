import java.util.Scanner;
public class SoLienKe {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long t = sc.nextLong();
        while(t-- > 0){
            boolean ok = true;
            String s = sc.next();
            for(int i =0; i < s.length() -1 ;i++){
            if(Math.abs(s.charAt(i)- s.charAt(i+1))!= 1){
                ok = false;
                break;
            }
            }
            if(ok){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
    }
        sc.close();
    }
    
}
