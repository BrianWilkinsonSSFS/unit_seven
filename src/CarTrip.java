public class CarTrip {

    private double myStartOdometer;
    private double myEndOdometer;
    private double myTime;
    private double myGallonsUsed;

    public CarTrip() {
        myStartOdometer = 0;
        myEndOdometer = 0;
        myTime = 0;
        myGallonsUsed = 0;
    }

    public CarTrip(double so, double eo, double t, double g) {
        myGallonsUsed = g;
        myStartOdometer = so;
        myEndOdometer = eo;
        myTime = t;
    }

    public double getMyEndOdometer() {
        return myEndOdometer;
    }

    public double getMyGallonsUsed() {
        return myGallonsUsed;
    }

    public double getMyStartOdometer() {
        return myStartOdometer;
    }

    public double getMyTime() {
        return myTime;
    }

    public double getTripDistance() {
        return myEndOdometer - myStartOdometer;
    }

    public double getAverageSpeed() {
        if (myTime > 0)
            return getTripDistance() / myTime;
        else
            return 0;
    }

    public double getGasMileage() {
        if (myGallonsUsed > 0)
            return getTripDistance() / myGallonsUsed;
        else
            return 0;
    }

    public double getTotalGasPrice(double pricePerGallon) {
        return myGallonsUsed * pricePerGallon;
    }

    public String toString() {
        return "Distance traveled: " + getTripDistance() + " miles";
    }
}
