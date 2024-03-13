public class WordGuessingGame {
    private String hiddenWord;
    private String guessedWord;
    private int numberOfTries;

    public WordGuessingGame() {
        this.hiddenWord = "abc";
        this.guessedWord = "___";
        this.numberOfTries = 0;
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
    public void ShowGuessedWord(){
        System.out.println("A palavra que se vai adivinhando é" +guessedWord);
    }
}
