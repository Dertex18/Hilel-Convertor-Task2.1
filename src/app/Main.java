package app;

public class Main {
    private static final double km = 1.609344;
    public static void main(String[] args) {

            System.out.println("App for distant convertion");
            System.out.println("Version 1.0");

            double miles = 12;

            double resultInKm = convertMilesToKilometers(miles);
            System.out.println("Result is " + resultInKm + " kilometers");

    }

    private static double convertMilesToKilometers(double miles) {
        return miles*km;
    }

}