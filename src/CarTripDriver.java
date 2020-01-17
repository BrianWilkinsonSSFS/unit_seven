public class CarTripDriver {

    public static void main(String[] args) {

        CarTrip t3 = new CarTrip();
        CarTrip t4 = new CarTrip(250, 1000, 36.5, 475);

        System.out.println("Starting: " + t3.getMyStartOdometer());
        System.out.println("Ending:  " + t3.getMyEndOdometer());
        System.out.println("My time: " + t3.getMyTime());
        System.out.println("Gallons Used: " + t3.getMyGallonsUsed());

        System.out.println("Distance: "+t3.getTripDistance());
        System.out.println("Speed: "+t3.getAverageSpeed());
        System.out.println("Milage"+t3.getGasMileage());
        System.out.println("Gas Price: "+t3.getTotalGasPrice(2.75));
        System.out.println(t3);

        System.out.println("Starting: " + t4.getMyStartOdometer());
        System.out.println("Ending:  " + t4.getMyEndOdometer());
        System.out.println("My time: " + t4.getMyTime());
        System.out.println("Gallons Used: "+ t4.getMyGallonsUsed());

        System.out.println("Distance: "+t4.getTripDistance());
        System.out.println("Speed: "+t4.getAverageSpeed());
        System.out.println("Milage"+t4.getGasMileage());
        System.out.println("Gas Price: "+t4.getTotalGasPrice(2.55));
        System.out.println(t4);
    }
}
