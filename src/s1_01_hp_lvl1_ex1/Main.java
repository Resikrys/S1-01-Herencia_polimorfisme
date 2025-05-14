package s1_01_hp_lvl1_ex1;

public class Main {
    public static void main(String[] args) {
        StringInstrument guitar = new StringInstrument("guitar", 213.99f);
        WindInstrument flute = new WindInstrument("flute", 19.75f);
        PercussionInstrument drums = new PercussionInstrument("drums", 102.13f);
        int num = 1;

        guitar.play();
        flute.play();
        drums.play();
        PercussionInstrument.playHard();
        System.out.println(StringInstrument.countStringInstruments());

        StringInstrument bass = new StringInstrument("bass", 123.75f);
        StringInstrument violin = new StringInstrument("violin", 312.50f);
        System.out.println(StringInstrument.countStringInstruments());
        }


}
