import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int a[] = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int count = 1;
            boolean visited = false;

            for (int k = 0; k < i; k++) {
                if (a[i] == a[k]) {
                    visited = true;
                    break;
                }
            }

            if (visited) continue;

            for (int j = i + 1; j < n; j++) {
                if (a[i] == a[j])
                    count++;
            }

            System.out.println(a[i] + " occurs " + count + " times");
        }
    }
}
