package s1_01_hp_lvl1_ex1;

public class Main {
    public static void main(String[] args) {

        PercussionInstrument.playHard(); //Works because it's a class method (static)

        StringInstrument guitar = new StringInstrument("guitar", 213.99f);
        WindInstrument flute = new WindInstrument("flute", 19.75f);
        //PercussionInstrument drums = new PercussionInstrument("drums", 102.13f);

        guitar.play();
        flute.play();
        //drums.play();

        PercussionInstrument.playHard(); //Works because it's a class method (static)
        //drums.playHard(); //Not working because it's a class method not instance method (static)

        //Static class method: counter +1 (1 obj created)
        System.out.println(StringInstrument.countStringInstruments());

        StringInstrument bass = new StringInstrument("bass", 123.75f);
        StringInstrument violin = new StringInstrument("violin", 312.50f);
        //Static class method: counter +3 (3 obj created)
        System.out.println(StringInstrument.countStringInstruments());
        }


}
