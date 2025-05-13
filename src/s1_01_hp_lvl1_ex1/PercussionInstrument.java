package s1_01_hp_lvl1_ex1;

public class PercussionInstrument extends Instrument {
    private String name;
    private float price;

    public PercussionInstrument(String name, float price) {
        super(name, price);
    }
    public void play() {
        System.out.println("A percussion instrument is playing.");
    }

    @Override
    public String toString() {
        return "The percussion instrument called " + this.getName() + " costs " + this.getPrice() + "€.";
    }
}
