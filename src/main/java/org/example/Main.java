package org.example;

public class Main {
    public static void main(String[] args) {
        double[] testInput = {1.5, 10.25, -5.6, 25.42, 75.114};

        for (double v : testInput) {
            printConversion(v);
        }

    }

    public static long toMilesPerHour(double kilometersPerHour){
        var KILO_TO_MILE = 1.609;
        long conversion = Math.round(kilometersPerHour / KILO_TO_MILE);

        if(kilometersPerHour < 0){
            conversion = -1;
        }

        return conversion;
    }

    public static void printConversion(double kilometersPerHour){
        long result = toMilesPerHour(kilometersPerHour);

        if(result == -1)
            System.out.println("Invalid Value");
        else
            System.out.println(kilometersPerHour + " km/h = " + result + " mi/h");
    }
}