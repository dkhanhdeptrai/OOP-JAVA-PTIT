import java.util.Scanner;

public class NoiDSA {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int[] a = new int[N];
    for (int i = 0; i < N; i++) a[i] = sc.nextInt();

    for (int i = 1; i < N - 1; i++) {
      for (int j = 0; j < N - 1 - i; j++) {
        if (a[j] > a[j + 1]) {
          int temp = a[j];
          a[j] = a[j + 1];
          a[j + 1] = temp;
        }
      }

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
