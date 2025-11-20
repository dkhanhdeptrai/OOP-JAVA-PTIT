import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DocFile {
    public static void main(String[] args) {
        try {
            File file = new File("Hello.txt");   // file Hello.txt phải nằm cùng thư mục với chương trình
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()) {          // đọc từng dòng
                String line = sc.nextLine();
                System.out.println(line);       // in ra màn hình
            }

            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("Không tìm thấy file!");
        }
    }
}
