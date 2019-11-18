package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class PigLatinGenerator {

//a, e, i, o, u
    public static List<Character> vowels;
    static {
        Character[] letters = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        vowels = new ArrayList<>();
        vowels.addAll(Arrays.asList(letters));
    }

    public String translate(String str) {
        String[] words = str.split(" ");
        String result = "";

        for (int i = 0; i < words.length; i++) {
            result += translateWord(words[i]);
            if(i != words.length - 1) {
                result += " ";
            }
        }
        return result;
    }

    public String translateWord(String str) {

        if (vowels.contains(str.charAt(0))) {
            return str + "way";
        } else {

            String cons = "";
            String vows = "";
            Boolean firstVow = false;
            for (Character c : str.toCharArray()) {
                if(firstVow) {
                    vows += c;
                }
                else if (vowels.contains(c)) {
                    vows += c;
                    firstVow = true;
                } else {
                    cons += c;
                }
            }
            return vows + cons + "ay";
        }

    }

}
