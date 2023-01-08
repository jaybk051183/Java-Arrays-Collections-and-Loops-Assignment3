import java.util.HashMap;
public class Translator {
    HashMap<Integer, String> numericAlpha;
    public Translator(String[] alphabetic, int[] numeric){
        for (int i = 0; i < numeric.length; i++){
            if(numericAlpha == null){
                numericAlpha = new HashMap<>();
            }
            numericAlpha.put(numeric[i], alphabetic[i]);
        }
    }

    public String translate (Integer number){
        return numericAlpha.get(number);
    }

}
