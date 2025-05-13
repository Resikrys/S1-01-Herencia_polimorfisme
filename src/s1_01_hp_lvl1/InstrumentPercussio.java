package s1_01_hp_lvl1;

public class InstrumentPercussio extends Instrument {
    private String name;
    private float price;

    public InstrumentPercussio(String name, float price) {
        super(name, price);
    }
    public void tocar() {
        System.out.println("A percussion instrument is playing.");
    }

    @Override
    public String toString() {
        return "The percussion instrument called " + this.getName() + " costs " + this.getPrice() + "€.";
    }
}
