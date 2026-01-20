import java.util.Scanner;

public class ChonDSA {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int[] a = new int[N];

    for (int i = 0; i < N; i++) {
      a[i] = sc.nextInt();
    }

    for (int i = 0; i < N - 1; i++) {
      int minIndex = i;

      for (int j = i + 1; j < N; j++) {
        if (a[j] < a[minIndex]) {
          minIndex = j;
        }
      }

      // đổi chỗ
      int temp = a[i];
      a[i] = a[minIndex];
      a[minIndex] = temp;

      // in bước
      System.out.print("Buoc " + (i + 1) + ": ");
      for (int k = 0; k < N; k++) {
        System.out.print(a[k]);
        if (k < N - 1) System.out.print(" ");
      }
      System.out.println();
    }

    sc.close();
  }
}
