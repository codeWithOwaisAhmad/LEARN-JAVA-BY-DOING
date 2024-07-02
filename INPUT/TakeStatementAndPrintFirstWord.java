

import java.util.Scanner;

public class TakeStatementAndPrintFirstWord {
    String word;
    public static void main(String[] args) {
        TakeStatementAndPrintFirstWord takeStatementAndPrintFirstWord = new TakeStatementAndPrintFirstWord();
        takeStatementAndPrintFirstWord.takeStatementFromUser();
        takeStatementAndPrintFirstWord.printFirstWord();
    }
    void takeStatementFromUser(){
        System.out.println("Enter a Sentence: ");
        Scanner scanner = new Scanner(System.in);
        word = scanner.next();
    }
    void printFirstWord(){
        System.out.println("The first word is: "+ word);
    }
}
