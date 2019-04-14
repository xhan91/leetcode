import java.util.List;

public class Main {

    public static void main(String[] args) {
        String input1 = "abcdefga";
        String[] input2 = new String[]{"a", "ab", "abc", "bcd", "cde", "ef", "fg"};
        String[] input3 = new String[]{"a", "ab", "abc", "bcd", "cde", "ef"};
        Tokenizer tokenizer = new Tokenizer();
        try {
            List<String> result = tokenizer.tokenize(input1, input2);
            for (String s : result) {
                System.out.println(s);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            List<String> result = tokenizer.tokenize(input1, input3);
            for (String s : result) {
                System.out.println(s);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
