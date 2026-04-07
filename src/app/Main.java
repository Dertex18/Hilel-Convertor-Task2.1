package app;

public class Main {
    private static final double km = 1.609344;

    public static void main(String[] args) {

        System.out.println("App for distant convertion");
        System.out.println("Version 1.0");

        double miles = 12;
        double kilometers = 34;
        double resultInKm = convertMilesToKilometers(miles);
        double resultInMiles = convertKilometersToMiles(kilometers);
        System.out.println("Result is " + resultInKm + " kilometers and " + resultInMiles + " miles");
    }

    private static double convertMilesToKilometers(double miles) {
        return miles * km;
    }

    private static double convertKilometersToMiles(double kilometers) {
        return kilometers / km;
    }
}