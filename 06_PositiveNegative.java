import java.util.Scanner;

public class PositiveNegative {
    int num;

    PositiveNegative(int n) {
        num = n;
    }

    void check() {
        if (num >= 0)
            System.out.println("Positive Number");
        else
            System.out.println("Negative Number");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        PositiveNegative obj = new PositiveNegative(n);
        obj.check();

        sc.close();
    }
}
