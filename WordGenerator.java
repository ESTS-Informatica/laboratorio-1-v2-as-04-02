import java.util.ArrayList;
import java.util.Random;

public class WordGenerator {
    private ArrayList<String> words;
    public WordGenerator(){
        ArrayList<String> words = new ArrayList<>();
        Random random = new Random();
    }
    public void fillArrayList(){
        words.add("boolean");
        words.add("break");
        words.add("byte");
        words.add("case");
        words.add("char");
        words.add("class");
        words.add("continue");
        words.add("do");
        words.add("double");
        words.add("else");
        words.add("enum");
        words.add("for");
        words.add("it");
        words.add("import");
        words.add("int");
    }
    public String generateWord(){
        int generateIndex = random.nextInt(words.size());
    return words.get(generateIndex);
    }
    public void addWord(String word){
        this.words.add(word);
    }
}
