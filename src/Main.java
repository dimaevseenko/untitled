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

    public String d(){
        return "1";
    }

    public void c(){
        Math.sin(1);
    }

    public double sin(double a){
        return Math.sin(a);
    }

    public double avg(double a, double b){
        return (a+b)/2;
    }
}
