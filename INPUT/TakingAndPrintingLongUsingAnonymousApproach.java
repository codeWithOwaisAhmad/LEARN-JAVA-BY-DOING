

import java.util.Scanner;

public class TakingAndPrintingLongUsingAnonymousApproach {
    long number;

    public static void main(String[] args) {
        TakingAndPrintingLongUsingAnonymousApproach takingAndPrintingLongUsingAnonymousApproach = new TakingAndPrintingLongUsingAnonymousApproach();
        takingAndPrintingLongUsingAnonymousApproach.printingLongWithAnonymousApproach();
    }
    void printingLongWithAnonymousApproach(){
        System.out.println("Enter A Number Of Long Type: ");
        number = new Scanner(System.in).nextLong();
        System.out.println("The Long Is: " + number);
    }
}

