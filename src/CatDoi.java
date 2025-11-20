import java.util.Scanner;
public class CatDoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            String res = "";
            boolean invalid = false;
            for(int i = 0; i < s.length(); i++){
                char c = s.charAt(i); // duyet tung ki tu trong day so
                if(c == '0') res += '0';
                else if(c == '1') res += '1';
                else if(c == '8' || c == '9')res += '0';
                else{
                    invalid = true;
                    break;
                }
                        
            }
            if(invalid){
                System.out.println("INVALID"); // neu invalid thi in ra
            }
            else{ // neu kh invalid
                int j = 0;
                while(j< res.length() && res.charAt(j)=='0') j++; // kiem tra neu ki tu = 0
                while(j< res.length() && res.charAt(j)=='0') j++; // kiem t thi bo 0
                if(j == res.length()) System.out.println("INVALID"); 
                else System.out.println(res.substring(j)); // loc 0 r in ra day so vi du 0010 = 10 
            }
        }
    }
}
