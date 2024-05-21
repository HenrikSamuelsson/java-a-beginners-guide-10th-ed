/*
 * Try This 1-1
 * 
 * This program converts gallons to litres.
 */

public class GalToLit {
    public static void main(String[] args) {
        double gallons; // Holds number of gallons.
        double litres; // Holds number of litres.

        gallons = 10; // Hard coded number of gallons.

        litres = gallons * 3.7854; // Convert gallons to litres.
        System.out.println(gallons + " gallons is " + litres + " litres.");
    }
}
