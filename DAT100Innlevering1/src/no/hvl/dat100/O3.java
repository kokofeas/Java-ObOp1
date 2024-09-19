package no.hvl.dat100;

import java.util.Scanner;

public class O3 {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Skriv inn et heltall:");
        int n = scanner.nextInt();

        if (n > 0) {
            int factorial = 1;
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }
            System.out.println("Verdien av " + n + "! er: " + factorial);
        } else {
            System.out.println("Skriv inn et heltall større enn 0.");
        }
        scanner.close();
    }
}
