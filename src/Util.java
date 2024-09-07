import java.util.*;

public class Util {

    final static String PROBLEM_1_1 = 
            """
            lrvmnir bpr sumvbwvr jx bpr lmiwv yjeryrkbi jx qmbm wi
            bpr xjvni mkd ymibrut jx irhx wi bpr riirkvr jx
            ymbinlmtmipw utn qmumbr dj w ipmhh but bj rhnvwdmbr bpr
            yjeryrkbi jx bpr qmbm mvvjudwko bj yt wkbrusurbmbwjk
            lmird jk xjubt trmui jx ibndt

            wb wi kjb mk rmit bmiq bj rashmwk rmvp yjeryrkb mkd wbi
            iwokwxwvmkvr mkd ijyr ynib urymwk nkrashmwkrd bj ower m
            vjyshrbr rashmkmbwjk jkr cjnhd pmer bj lr fnmhwxwrd mkd
            wkiswurd bj invp mk rabrkb bpmb pr vjnhd urmvp bpr ibmbr
            jx rkhwopbrkrd ywkd vmsmlhr jx urvjokwgwko ijnkdhrii
            ijnkd mkd ipmsrhrii ipmsr w dj kjb drry ytirhx bpr xwkmh
            mnbpjuwbt lnb yt rasruwrkvr cwbp qmbm pmi hrxb kj djnlb
            bpmb bpr xjhhjcwko wi bpr sujsru msshwvmbwjk mkd
            wkbrusurbmbwjk w jxxru yt bprjuwri wk bpr pjsr bpmb bpr
            riirkvr jx jqwkmcmk qmumbr cwhh urymwk wkbmvb
            """;

    // To test stuff on the fly
    public static void main(String[] args) {
        System.out.println(frequencyAnalysis(PROBLEM_1_1).toString()); 
        System.out.println(desubstitutifier(PROBLEM_1_1, "mlvdrxopwXqhyvjsXuibnecatX"));
        //                                                      "abcdefghijklmnopqrstuvwxyz"
    }

    /**
     * Decodes text encoded with a substitution cipher,
     * given a "keymap" string of length 26 where each letter corresponds to 
     * the encrypted version of the English letter that corresponds to its index in the string.
     * (i.e. for Caesar shift 1: "bcdefghijklmnopqrstuvwxyza")
     */
    public static String desubstitutifier(String text, String keymap) {
        StringBuilder builder = new StringBuilder("");
        for(Character c: text.toLowerCase().toCharArray()) {
            if(Character.isAlphabetic(c)) {
                // actual general decoding
                if(keymap.indexOf(c) >= 0)
                    builder.append((char)(keymap.indexOf(c) + 'a'));
                else
                    builder.append('?');
            } else
                builder.append(c);
        }
        return builder.toString();
    }

    /**
     * Counts the occurrences of all alphabetic characters c in a string. (lowercase only)
     * Very questionable organization but it works.
     * 
     * @param text The string to analyze.
     * @return A list, in sorted order, of character-count pairs.
     */
    public static ArrayList<Map.Entry<Character, String>> frequencyAnalysis(String text) {
        ArrayList<Map.Entry<Character, String>> result = new ArrayList<>();
        HashMap<Character, Integer> count = new HashMap<>();

        for(Character c: text.toLowerCase().toCharArray()) {
            if(Character.isAlphabetic(c)) {
                if(!count.containsKey(c)) {
                    count.put(c, 1);
                } else {
                    count.put(c, count.get(c) + 1);
                }
            }
        }
        final int LETTER_COUNT = text.replaceAll("[^a-z]", "").length();
        HashMap<Character, String> countPercents = new HashMap<>();
        for(Map.Entry<Character, Integer> entry: count.entrySet()) {
            countPercents.put(entry.getKey(),
                String.format("%.2f%%", ((double) entry.getValue() / LETTER_COUNT) * 100));
        }
        for(Map.Entry<Character, String> entry: countPercents.entrySet()) {
            result.add(entry);
        }
        result.sort((entry1, entry2) -> {
            Double first_double = Double.parseDouble(
                entry1.getValue().substring(0, entry1.getValue().length() - 1));
            Double second_double = Double.parseDouble(
                entry2.getValue().substring(0, entry2.getValue().length() - 1));
            return (- first_double.compareTo(second_double));
        });
        return result;
    }
}