class Temperature {
    double celsius;

    void convert() {
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("Temperature in Fahrenheit = " + fahrenheit);
    }

    public static void main(String[] args) {
        Temperature obj = new Temperature();
        obj.celsius = 37;
        obj.convert();
    }
}
