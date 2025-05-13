package s1_01_hp_lvl1;

public class InstrumentCorda extends Instrument {
    private String name;
    private float price;

    public InstrumentCorda(String name, float price) {
        super(name, price);
    }
    public void tocar() {
        System.out.println("A string instrument is playing.");
    }

    @Override
    public String toString() {
        return "The string instrument called " + this.getName() + " costs " + this.getPrice() + "€.\n";
    }
}
