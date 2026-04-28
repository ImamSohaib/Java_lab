public class DefaultConstructor {
    int x;

    DefaultConstructor() {
        x = 10;
    }

    public static void main(String[] args) {
        DefaultConstructor obj = new DefaultConstructor();
        System.out.println("Value of x: " + obj.x);
    }
}
