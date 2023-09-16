public class Main {
    public static void main(String[] args) {
        Mercedez m = new Mercedez();
        m.drive();
        m.drive(() -> System.out.println("dick"));
    }

}
