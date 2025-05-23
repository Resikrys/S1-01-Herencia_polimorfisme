package s1_01_hp_lvl1_ex1;

public class PercussionInstrument extends Instrument {
    //Static method (charged before obj instance)
    public static void playHard() {
        System.out.println("A percussion instrument is playing very loud.");
    }

    public PercussionInstrument(String name, float price) {
        super(name, price);
    }

    @Override
    public void play() {
        System.out.println("A percussion instrument is playing.");
    }



    @Override
    public String toString() {
        return "The percussion instrument called " + this.getName() + " costs " + this.getPrice() + "€.";
    }
}
