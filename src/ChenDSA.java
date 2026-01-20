import java.util.Scanner;

public class ChenDSA {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int[] a = new int[N];
    for (int i = 0; i < N; i++) a[i] = sc.nextInt();

    for (int i = 0; i < N; i++) {
      int key = a[i];
      int j = i - 1;

      while (j >= 0 && a[j] > key) {
        a[j + 1] = a[j];
        j--;
      }
      a[j + 1] = key;

      System.out.print("Buoc " + i + ": ");
      for (int k = 0; k < N; k++) {
        System.out.print(a[k]);
        if (k < N - 1) System.out.print(" ");
      }
      System.out.println();
    }

    sc.close();
  }
}
