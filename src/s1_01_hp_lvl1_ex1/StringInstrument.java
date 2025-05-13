package s1_01_hp_lvl1_ex1;

public class StringInstrument extends Instrument {
    private String name;
    private float price;

    public StringInstrument(String name, float price) {
        super(name, price);
    }
    public void play() {
        System.out.println("A string instrument is playing.");
    }

    @Override
    public String toString() {
        return "The string instrument called " + this.getName() + " costs " + this.getPrice() + "€.\n";
    }
}
