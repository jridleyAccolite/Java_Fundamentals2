import java.text.CharacterIterator;
import java.text.StringCharacterIterator;
import java.util.Map;
import java.util.TreeMap;

public class Task1 {
    public static void main(String[] args){
        // args == input Strings to count

        // make HashMap with (char : freqCount) pair
        Map<Character, Integer> frequencies = new TreeMap<>();

        for (String s : args){
            CharacterIterator it = new StringCharacterIterator(s);
            while (it.current() != CharacterIterator.DONE) {

                Character c = Character.toUpperCase(it.current());

                if (c >= 'A' && c <= 'Z'){
                    // tally each occurrence of each char
                    frequencies.putIfAbsent(c, 0);
                    frequencies.replace(c, (frequencies.get(c) + 1));
                }

                it.next();
            }

        }

        for (Map.Entry<Character, Integer> entry : frequencies.entrySet()){
            System.out.print(entry.getKey() + ": ");
            for (int i = 0; i < entry.getValue(); i++){
                System.out.print('#');
            }
            System.out.println("");
        }
    }
}
