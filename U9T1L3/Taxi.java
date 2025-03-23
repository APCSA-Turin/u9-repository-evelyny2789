public class Taxi extends Car{
    private double fareCollected; 

    public Taxi(String licensePlate, double tollFee, int passengers, boolean isElectric, double fareCollected){
        super (licensePlate, tollFee, passengers, isElectric); 
        this.fareCollected = fareCollected; 
    }

    public double getFareCollected(){
        return fareCollected; 
    }

    public void pickupRiders(int numRiders, double farePerRider){
        setPassengers(getPassengers() + numRiders);
        fareCollected += numRiders * farePerRider; 
        if (getPassengers() >= 4 && !isDiscountApplied()){
            setTollFee(getTollFee() * 0.5); 
            setDiscountApplied(true); 
        }
    }

    public boolean chargeAndDropOffRiders(double farePerRider){
        int numRiders = getPassengers() - 1; 
        double fare = numRiders * farePerRider; 
        fareCollected+=fare; 
        return dropOffPassengers(numRiders);
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Total fare collected: " + fareCollected);
    }

    @Override
    public void getGas(){
        System.out.println("charged");
    }
}
