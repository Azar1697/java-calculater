import java.util.Scanner;

public class Calculators {
    public static void main(String[] args) {
        int x = 1;
        int y = -1;
        int z = 1;
        if (x > 0)
            if (y > 0)
                System.out.println("x > 0 и y > 0");
            else if (z > 0)
                System.out.println("x < 0 и z > 0");
    }
}
