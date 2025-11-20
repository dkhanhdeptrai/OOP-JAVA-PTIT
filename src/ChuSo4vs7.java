import java.util.Scanner;

public class ChuSo4vs7 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String ss = sc.next();
        int dem = 0;
        for (int i = 0; i < ss.length(); i++) {
            if (ss.charAt(i) == '4' || ss.charAt(i) == '7') { // duyet tung ki tu neu co 4 haoc 7 thi cong 
                dem++;

            }
        }
        if (dem == 4 || dem == 7) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
        }
    }
