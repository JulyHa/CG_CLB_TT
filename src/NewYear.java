import java.math.*;
import java.util.Scanner;

public class NewYear {
    public static void main(String[] args) {
        long n, m, a;
        Scanner sc = new Scanner(System.in);
        n = sc.nextLong();
        m = sc.nextLong();
        a = sc.nextLong();
        sc.close();

        long flagstones = (long) Math.ceil((double) n / a) * (long) Math.ceil((double) m / a);
        System.out.println(flagstones);
    }
}
