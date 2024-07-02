

import java.util.Scanner;

public class TakeStringAndFindFirstWordLength {
    String word;
    int length;
    public static void main(String[] args) {
        TakeStringAndFindFirstWordLength takeStringAndFindFirstWordLength = new TakeStringAndFindFirstWordLength();
        takeStringAndFindFirstWordLength.takeStringAsInput();
        takeStringAndFindFirstWordLength.calculatingLength();
        takeStringAndFindFirstWordLength.printingLength();
    }
    void takeStringAsInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter A Word: ");
        word = scanner.next();
    }
    void calculatingLength(){
        length = word.length();
    }
    void printingLength(){
        System.out.println("The Length Of the Word Is: "+ length);
    }
}
