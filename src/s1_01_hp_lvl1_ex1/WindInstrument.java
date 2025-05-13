package s1_01_hp_lvl1_ex1;

public class WindInstrument extends Instrument {
    private String name;
    private float price;

    public WindInstrument(String name, float price) {
        super(name, price);
    }
    public void play() {
        System.out.println("A wind instrument is playing.");
    }

    @Override
    public String toString() {
        return "The wind instrument called " + this.getName() + " costs " + this.getPrice() + "€.";
    }
}
