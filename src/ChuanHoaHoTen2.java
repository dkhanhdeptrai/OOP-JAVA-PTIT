
import java.util.Scanner;

public class ChuanHoaHoTen2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String fullName = sc.nextLine();
            String[] words = fullName.trim().toLowerCase().split("\\s+");

            if (words.length == 0 || words[0].isEmpty()) {
                System.out.println("");
                continue;
            }

            for (int i = 0; i < words.length; i++) {
                words[i] = words[i].substring(0, 1).toUpperCase() + words[i].substring(1);
            }

            String lastName = words[0];
            StringBuilder firstNameBuilder = new StringBuilder();
            for (int i = 1; i < words.length; i++) {
                firstNameBuilder.append(words[i]).append(" ");
            }
            String firstAndMiddleName = firstNameBuilder.toString().trim();
            String formattedLastName = lastName.toUpperCase();
            System.out.println(firstAndMiddleName + ", " + formattedLastName);
        }

        sc.close();
    }
}
