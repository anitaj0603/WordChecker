import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<String>();
        words.add("an");
        words.add("band");
        words.add("band");
        words.add("abandon");
        WordChecker w =  new WordChecker (words);
        System.out.println(words);
        System.out.println(w.isWordChain());
        ArrayList<String> words1 = new ArrayList<String>();
        words1.add("to");
        words1.add("too");
        words1.add("stool");
        words1.add("tools");
        WordChecker x = new WordChecker(words1);
        System.out.println(words1);
        System.out.println(x.isWordChain());
    }
}