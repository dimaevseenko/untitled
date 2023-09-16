public class Car implements CarListener {
    private String model;
    Car(String model){
        this.model = model;
    }

    public void drive(CarListener listener){
        listener.onCarDrived();
        listener.onCarStopped();
    }
    public void drive(){
        System.out.println(model+" is driving!");
    }

    @Override
    public void onCarDrived() {
        System.out.println("sss");
    }

    @Override
    public void onCarStopped() {
    }
}
