import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;

public class No_824_山羊拉丁文 {
    public String toGoatLatin(String sentence) {
        List<Character> characters = List.of(new Character[]{'a', 'e', 'i', 'o', 'u'});
        String[] s = sentence.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length; i++) {
            String word = s[i];
            String lowWord = word.toLowerCase();
            if (characters.contains(lowWord.charAt(0))) {
                stringBuilder.append(word).append("ma");
            } else {
                stringBuilder.append(word.substring(1)).append(word.charAt(0)).append("ma");
            }
            stringBuilder.append("a".repeat(i + 1));
            if (i != s.length - 1) {
                stringBuilder.append(" ");
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        String t = "I speak Goat Latin";
        System.out.println(new No_824_山羊拉丁文().toGoatLatin(t));
    }
}
