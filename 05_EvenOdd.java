class EvenOdd {
    int number;

    void check() {
        if (number % 2 == 0)
            System.out.println(number + " is Even");
        else
            System.out.println(number + " is Odd");
    }

    public static void main(String[] args) {
        EvenOdd obj = new EvenOdd();
        obj.number = 7;
        obj.check();
    }
}
