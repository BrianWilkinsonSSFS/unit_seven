public class Truck {

    private String truckID;
    private double odometer;
    private double mpg;
    private double fuel;

    private static final double CAPACITY = 20.0;
    private static double totalFuel;

    public Truck(String ID) {
        this(ID, 0.0, 0.0, 0.0);
    }

    public Truck(String ID, double odometer, double mpg, double fuel) {
        this.truckID = ID;
        this.odometer = odometer;
        this.mpg = mpg;
        this.fuel = fuel;
    }

    public String getTruckID() {
        return truckID;
    }

    public double getOdometer() {
        return odometer;
    }

    public double getMpg() {
        return mpg;
    }

    public double getFuel() {
        return fuel;
    }

    public void setMpg(double mpg) {
        this.mpg = mpg;
    }

    public boolean enoughFuel(double miles) {
        return miles < (mpg * fuel);
    }

    public String drive(double miles) {
        if (enoughFuel(miles)) {
            fuel -= miles/mpg;
            odometer += miles;
            return "Success";
        }
        return "Truck " + truckID + " does not have enough fuel to drive " + miles + " miles." ;
    }

    public void fill() {
        double additionalGallons = CAPACITY - fuel;
        totalFuel += additionalGallons;
        fuel = CAPACITY;

    }

    public String fill(double gallons) {
        if (fuel + gallons > CAPACITY) {
            return "Truck " + truckID + ": Gallons exceeds tank capacity";
        }
        fuel += gallons;
        totalFuel += gallons;
        return "Success";
    }

    public static double getTotalFuel() {
        return totalFuel;
    }

    public String toString() {
        return "Truck: " + truckID + "\nOdometer: " + odometer + "\nMiles Per Gallon: " + mpg + "\nFuel: " + fuel;
    }
}
