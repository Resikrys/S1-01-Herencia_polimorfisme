package s1_01_hp_lvl1_ex1;

public class WindInstrument extends Instrument {

    public WindInstrument(String name, float price) {
        super(name, price);
    }

    @Override
    public void play() {
        System.out.println("A wind instrument is playing.");
    }

    @Override
    public String toString() {
        return "The wind instrument called " + this.getName() + " costs " + this.getPrice() + "€.";
    }
}
