package org.example;

public class Main {
    static final double MILE_TO_KILO = 1.609;
    public static void main(String[] args) {
        double[] testInput = {1.5, 10.25, -5.6, 25.42, 75.114};

        for (double v : testInput) {
            printConversion(v);
        }
    }

    public static long toMilesPerHour(double kilometersPerHour){
        // Convert km/h to mph
        long conversion = Math.round(kilometersPerHour / MILE_TO_KILO);

        // If input is negative, just return -1
        if(kilometersPerHour < 0)
            conversion = -1;

        return conversion;
    }

    public static void printConversion(double kilometersPerHour){
        // Convert the input
        long result = toMilesPerHour(kilometersPerHour);

        // Check if the result is valid or not
        if(result == -1)
            System.out.println("Invalid Value");
        else
            System.out.println(kilometersPerHour + " km/h = " + result + " mi/h");
    }
}