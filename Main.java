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

        ArrayList<String> words2 = new ArrayList<String>();
        words2.add("catch");
        words2.add("bobcat");
        words2.add("catchacat");
        words2.add("cat");
        words2.add("at");
        WordChecker a = new WordChecker(words2);
        System.out.println(words2);
        System.out.println(a.createList("cat"));
        System.out.println(a.createList("catch"));
        System.out.println(a.createList("dog"));

    }
}