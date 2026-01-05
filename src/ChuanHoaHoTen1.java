
import java.util.Scanner;

public class ChuanHoaHoTen1 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            sc.nextLine();
            while (t-- > 0) {
                String name = sc.nextLine();
                
                String[] words = name.trim().toLowerCase().split("\\s+");
                
                StringBuilder result = new StringBuilder();
                
                for (String word : words) {
                    
                    String capitalizedWord = word.substring(0, 1).toUpperCase() + word.substring(1);
                    result.append(capitalizedWord).append(" ");
                }
                
                System.out.println(result.toString().trim());
            }
        }
    }
}
