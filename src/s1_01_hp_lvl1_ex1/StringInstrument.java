package s1_01_hp_lvl1_ex1;

public class StringInstrument extends Instrument {
    private String name;
    private float price;
    private static int num;

    public StringInstrument(String name, float price) {
        super(name, price);
        num++;
    }
    public void play() {
        System.out.println("A string instrument is playing.");
    }
    public static int countStringInstruments() {
        return num;
    }

    @Override
    public String toString() {
        return "The string instrument called " + this.getName() + " costs " + this.getPrice() + "€.\n";
    }
}
