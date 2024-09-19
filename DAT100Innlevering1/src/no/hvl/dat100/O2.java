package no.hvl.dat100;

import java.util.Scanner;

public class O2 {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

       System.out.println("Skriv inn bruttoinntekt:");
       double bruttoInntekt = scanner.nextDouble();

       double trinnSkatt = calculateTrinnskatt(bruttoInntekt);
       System.out.printf("Trinnskatten er: %.2f kr\n", trinnSkatt);

       scanner.close();
    }
    public static double calculateTrinnskatt(double bruttoInntekt) {
        double skatt = 0.0;

        if (bruttoInntekt > 1350000) {
            skatt += (bruttoInntekt - 1350000) * 0.176;
        } 
        if (bruttoInntekt > 937000) {
            skatt += (bruttoInntekt - 937000) * 0.166;
        } 
        if (bruttoInntekt > 670000) {
            skatt += (bruttoInntekt - 670000) * 0.136;
        } 
        if (bruttoInntekt > 292850) {
            skatt += (bruttoInntekt - 292850) * 0.04;
        }
        if (bruttoInntekt > 208050) {
            skatt += (bruttoInntekt - 208050) * 0.017;
        }
        return skatt;
    }
}
