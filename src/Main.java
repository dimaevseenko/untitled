public class Main implements CarListener {
    public static void main(String[] args) {
        new Main().start();
    }

    public void start(){
        Mercedez m = new Mercedez();
        m.drive();
        m.drive(this);
    }

    @Override
    public void onCarDrived(){
        System.out.println("sdsd");
    }

    @Override
    public void onCarStopped() {
        System.out.println("stopped");
    }
}
