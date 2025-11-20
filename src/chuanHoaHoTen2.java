
import java.util.Scanner;

public class chuanHoaHoTen2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String fullName = sc.nextLine();

            // Bước 1: Chuẩn hóa tên gốc và tách thành các từ
            // .trim() -> xóa khoảng trắng đầu/cuối
            // .toLowerCase() -> chuyển hết về chữ thường
            // .split("\\s+") -> tách chuỗi theo một hoặc nhiều khoảng trắng
            String[] words = fullName.trim().toLowerCase().split("\\s+");

            // Xử lý trường hợp chuỗi đầu vào trống hoặc chỉ có khoảng trắng
            if (words.length == 0 || words[0].isEmpty()) {
                System.out.println("");
                continue; // Bỏ qua và đi đến lần lặp tiếp theo
            }

            // Chuẩn hóa viết hoa chữ cái đầu cho tất cả các từ
            for (int i = 0; i < words.length; i++) {
                words[i] = words[i].substring(0, 1).toUpperCase() + words[i].substring(1);
            }

            // Bước 2: Tách họ và phần tên + tên đệm
            String lastName = words[0]; // Từ đầu tiên là họ
            StringBuilder firstNameBuilder = new StringBuilder();
            for (int i = 1; i < words.length; i++) {
                firstNameBuilder.append(words[i]).append(" ");
            }
            String firstAndMiddleName = firstNameBuilder.toString().trim();

            // Bước 3: Chuyển đổi họ sang chữ hoa
            String formattedLastName = lastName.toUpperCase();

            // In ra kết quả cuối cùng theo định dạng
            System.out.println(firstAndMiddleName + ", " + formattedLastName);
        }

        sc.close();
    }
}
