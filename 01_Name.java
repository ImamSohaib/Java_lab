class Name {
    String name;

    void display() {
        System.out.println("My Name is: " + name);
    }

    public static void main(String[] args) {
        Name obj = new Name();
        obj.name = "Sohaib Imam";
        obj.display();
    }
}
