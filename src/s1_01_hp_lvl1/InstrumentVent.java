package s1_01_hp_lvl1;

public class InstrumentVent extends Instrument {
    private String name;
    private float price;

    public InstrumentVent(String name, float price) {
        super(name, price);
    }
    public void tocar() {
        System.out.println("A wind instrument is playing.");
    }

    @Override
    public String toString() {
        return "The wind instrument called " + this.getName() + " costs " + this.getPrice() + "€.";
    }
}
