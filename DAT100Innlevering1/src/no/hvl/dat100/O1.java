package no.hvl.dat100;

import java.util.Scanner;

public class O1 {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            int poengsum;
            while (true) {
                System.out.println("Skriv inn en poengsum for student " + (i + 1) + ":");
            poengsum = scanner.nextInt(); 
            if (poengsum >= 0 && poengsum <= 100) {
                break;
            } else {
                System.out.println("Ugyldig poengsum, prøv igjen");
            }
        }
            
           char karakter;

            if (poengsum >= 90 && poengsum <= 100) {
                karakter = 'A';
            } else if (poengsum >= 70 && poengsum <= 89) {
                karakter = 'B';
            } else if (poengsum >= 50 && poengsum <= 69) {
                karakter = 'C';
            } else if (poengsum >= 40 && poengsum <= 49) {
                karakter = 'D';
            } else if (poengsum >= 30 && poengsum <= 39) {
                karakter = 'E';
            } else if (poengsum >= 0 && poengsum <= 29) {
                karakter = 'F';
            } else {
                karakter = 'U'; // Ugyldig poengsum
            }

            if (poengsum <= 100 && poengsum >= 0) {
                System.out.println("Karakteren er: " + karakter);
            } else {
                System.out.println("Karakteren er ugyldig");
            }
        }

        scanner.close();
            
     }
}
