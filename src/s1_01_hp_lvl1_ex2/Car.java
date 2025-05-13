package s1_01_hp_lvl1_ex2;

public class Car {
    //static means "associated with the type itself, rather than an instance of the type."
    //A static variable stays in the memory for the entire lifetime of the application, and is initialised during class loading.
    // A non-static variable is being initialised each time you construct a new object.
    private static final String BRAND = "Capsule Corp"; //can't be in the constructor - global CONST (in mayus)
    private static String model; //Class variable (common)
    private final int power; //Instance variable (in minus!!)

    public Car(String model, int power) {
        Car.model = model;
        this.power = power;
    }

    //Getters
    public String getBrand() {
        return BRAND;
    }
    public String getModel() {
        return model;
    }
    public int getPower() {
        return this.power;
    }

    //Setters -> no need in final variables
    //setModel will change the value in every Car object instance

    //accelerate and brake
    public void carAccelerate() {
        System.out.println("Pushed accelerate pedal.");
    }

    public static void carBrake() {
        System.out.println("Pushed brake pedal.");
    }

    public String toString() {
        return "Car data:\n" +
                "Brand: " + BRAND + ", model: " + model + ", power: " + power;
    }

}
