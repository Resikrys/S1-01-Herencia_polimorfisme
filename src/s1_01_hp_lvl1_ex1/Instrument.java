package s1_01_hp_lvl1_ex1;

public abstract class Instrument {
    private String name;
    private float price;

    public Instrument(String name, float price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }
    public float getPrice() {
        return this.price;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(float price) {
        this.price = price;
    }

    public abstract void play();

    public String toString() {
        return "Instrument called " + this.getName() + " costs: " + this.getPrice() + "€.\n";
    }
}
