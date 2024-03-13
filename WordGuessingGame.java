import java.util.Locale;

public class WordGuessingGame {
    private String hiddenWord;
    private String guessedWord;
    private int numberOfTries;
    private InputReader reader;

    public WordGuessingGame() {
        this.hiddenWord = "abc";
        this.guessedWord = "___";
        this.numberOfTries = 0;
        reader = new InputReader();
    }

    public String getHiddenWord(){
        return hiddenWord;
    }

    public String getGuessedWord(){
        return guessedWord;
    }
    public int getNumberOfTries(){
        return numberOfTries;
    }
    public void showGuessedWord(){
        System.out.println("A palavra que se vai adivinhando é" +guessedWord);
    }

    public void showWelcome(){
        System.out.println("Welcome to the game!");
    }

    public void guess(char guess) {
    for(int i =0; i< hiddenWord.length(); i++){
     if(hiddenWord.toLowerCase().charAt(i) == guess) {
         StringBuilder builder = new StringBuilder(getGuessedWord());
         builder.setCharAt(i, guess);
         guessedWord = builder.toString();
            }
        }
    }
    public void showResult(){
        System.out.println("Foi realizado "+numberOfTries+" tentativas para adivinhar a palavra.");
    }
    public void play(){
    showWelcome();
    do{
        char guessedLetter = reader.getChar("Digite a letra que deseja adivinhar:");
        guess(guessedLetter);
        showGuessedWord();
        numberOfTries++;
        }
    while(!guessedWord.equals(hiddenWord));
    }
}


