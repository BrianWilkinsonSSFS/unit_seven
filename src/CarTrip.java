public class CarTrip {
    private double myStartOdometer;
    private double myEndOdometer;
    private double myTime;
    private double myGallonsUsed;

    public CarTrip(double start, double end, double time, double gallon){
        myStartOdometer = start;
        myEndOdometer = end;
        myTime = time;
        myGallonsUsed = gallon;
    }

    public CarTrip(){
        myStartOdometer = 0;
        myEndOdometer = 0;
        myTime = 0;
        myGallonsUsed = 0;
    }

    public double getMyStartOdometer() {
        return myStartOdometer;
    }

    public double getMyEndOdometer() {
        return myEndOdometer;
    }

    public double getMyGallonsUsed() {
        return myGallonsUsed;
    }

    public double getMyTime() {
        return myTime;
    }
    public void setMyStartOdometer(double start) {
        start = myStartOdometer;
    }

    public void setMyEndOdometer(double end) {
        end = myEndOdometer;
    }

    public void setMyGallonsUsed(double gallon) {
        gallon = myGallonsUsed;
    }

    public void setMyTime(double time) {
        time = myTime;
    }

    double getTripDistance(){
        return myEndOdometer - myStartOdometer;
    }
    double getAverageSpeed(){
        if (myTime == 0) {
            double average = (myEndOdometer - myStartOdometer) / (1 + myTime);
            return average;
        }else{
            double average = (myEndOdometer - myStartOdometer)/myTime;
            return average;
        }
    }
    double getGasMileage(){
        if(myGallonsUsed==0){
            double gasMileage = (myEndOdometer - myStartOdometer) / (1 + myGallonsUsed);
            return gasMileage;
        }else {
            double gasMileage = (myEndOdometer - myStartOdometer) / myGallonsUsed;
            return gasMileage;
        }
    }
    double getTotalGasPrice(double pricePerGallon){
        return pricePerGallon * myGallonsUsed;
    }

    public String toString(){
        double distance = myEndOdometer - myStartOdometer;
        return "Distance traveled: " + distance + " miles";
    }
    public static void main(String[] args){
    }
}