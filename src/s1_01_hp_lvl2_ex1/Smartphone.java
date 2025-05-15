package s1_01_hp_lvl2_ex1;

public class Smartphone extends Telephone implements Camera, Clock {

    public Smartphone(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void takePicture() {
        System.out.println("Taking a picture...");
    }

    @Override
    public void alarm() {
        System.out.println("Alarm ringing...");
    }
}
