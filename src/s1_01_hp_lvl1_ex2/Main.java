package s1_01_hp_lvl1_ex2;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Pocket flying car", 100);

        System.out.println(car1.getBrand());
        System.out.println(car1.getModel());
        System.out.println(car1.getPower());

        car1.accelerate(); //No static method
        Car.brake(); //Static method

        System.out.println(car1.toString());

    }
}
