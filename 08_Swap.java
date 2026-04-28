public class Swap {
    int a, b;

    Swap(int x, int y) {
        a = x;
        b = y;
    }

    void swap() {
        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swap: a = " + a + ", b = " + b);
    }

    public static void main(String[] args) {
        Swap obj = new Swap(10, 20);

        System.out.println("Before swap: a = " + obj.a + ", b = " + obj.b);
        obj.swap();
    }
}
