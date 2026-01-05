import java.io.*;
import java.util.*;

public class TongUocSo {
    static final int MAX = 2_000_000;
    static int[] spf = new int[MAX + 1];
    static void buildSPF() {
        int[] primes = new int[150000];
        int pc = 0;
        for (int i = 2; i <= MAX; i++) {
            if (spf[i] == 0) { spf[i] = i; primes[pc++] = i; }

            for (int j = 0; j < pc; j++) {
                int p = primes[j];
                long d = (long) i * p;
                if (d > MAX) break;
                spf[(int) d] = p;
                if (p == spf[i]) break;
            }
        }
    }

    static int sumPF(int x) {
        if (x <= 1) return 0;
        int s = 0;
        while (x > 1) {
            int p = spf[x];
            s += p;
            x /= p;
        }
        return s;
    }

    static class FastScanner {
        private final InputStream in;
        private final byte[] buffer = new byte[1 << 16];
        private int ptr = 0, len = 0;
        FastScanner(InputStream is) { in = is; }
        private int read() throws IOException {
            if (ptr >= len) {
                len = in.read(buffer);
                ptr = 0;
                if (len <= 0) return -1;
            }
            return buffer[ptr++];
        }
        int nextInt() throws IOException {
            int c, sign = 1, val = 0;
            do { c = read(); } while (c <= 32);
            if (c == '-') { sign = -1; c = read(); }
            while (c > 32) {
                val = val * 10 + (c - '0');
                c = read();
            }
            return val * sign;
        }
    }

    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner(System.in);
        buildSPF();

        int N = fs.nextInt();
        long total = 0L;
        for (int i = 0; i < N; i++) {
            int x = fs.nextInt();
            if (x >= 2) total += sumPF(x);
        }
        System.out.println(total);
    }
}
