package s1_01_hp_lvl1;

public class Main {
    public static void main(String[] args) {
        StringInstrument guitar = new StringInstrument("guitar", 213.99f);
        WindInstrument flute = new WindInstrument("flute", 19.75f);
        PercussionInstrument drums = new PercussionInstrument("drums", 102.13f);

        guitar.play();
        flute.play();
        drums.play();


        }
}
