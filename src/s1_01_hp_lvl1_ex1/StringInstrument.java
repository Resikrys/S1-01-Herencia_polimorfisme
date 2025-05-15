package s1_01_hp_lvl1_ex1;

public class StringInstrument extends Instrument {
    private static int num;

    public StringInstrument(String name, float price) {
        super(name, price);
        num++;
    }

    @Override
    public void play() {
        System.out.println("A string instrument is playing.");
    }

    //Static block method
    public static int countStringInstruments() {
        return num;
    }

    @Override
    public String toString() {
        return "The string instrument called " + this.getName() + " costs " + this.getPrice() + "€.\n";
    }
}
