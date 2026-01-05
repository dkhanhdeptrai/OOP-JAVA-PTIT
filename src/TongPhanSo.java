import java.util.Scanner;

class Fraction {
  private long num; // tử số
  private long den; // mẫu số

  public Fraction(long num, long den) {
    this.num = num;
    this.den = den;
    simplify();
  }

  private long gcd(long a, long b) {
    while (b != 0) {
      long t = a % b;
      a = b;
      b = t;
    }
    return a;
  }

  private void simplify() {
    long g = gcd(num, den);
    num /= g;
    den /= g;
  }

  public Fraction add(Fraction o) {
    long newNum = this.num * o.den + o.num * this.den;
    long newDen = this.den * o.den;
    return new Fraction(newNum, newDen);
  }

  @Override
  public String toString() {
    if (den == 1) return num + " ";
    return num + "/" + den;
  }
}

public class TongPhanSo {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    long a = sc.nextLong();
    long b = sc.nextLong();
    long c = sc.nextLong();
    long d = sc.nextLong();

    Fraction p = new Fraction(a, b);
    Fraction q = new Fraction(c, d);

    Fraction sum = p.add(q);
    System.out.println(sum);
  }
}
