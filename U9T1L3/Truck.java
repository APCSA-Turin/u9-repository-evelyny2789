public class Truck extends Vehicle {
    private int axles;
    private boolean hasTrailer;
    
    public Truck(String licensePlate, double tollFee, int passengers, int axles, boolean hasTrailer) {
      super(licensePlate, tollFee, passengers);
      this.axles = axles;
      this.hasTrailer = hasTrailer;
    }
  
    public int getAxles() {
      return axles;
    }
  
    public boolean hasTrailer() {
      return hasTrailer;
    }

    public boolean validateLicensePlate(){
        if (hasTrailer){
            boolean valid = ((getLicensePlate().substring(getLicensePlate().length() - 2).equals("MX") && axles > 4)) ||
            ((getLicensePlate().substring(getLicensePlate().length() - 2).equals("LX") && axles <= 4));
            return valid; 
        } else {
            return true; 
        }
    }

    @Override
    public double calculateTollPrice(){
        double price = getTollFee() * axles; 
        if (hasTrailer){
           return price * 2; 
        } else {
            return price; 
        }
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Num axles: " + axles);
        System.out.println("Trailer: " + hasTrailer);
    }
  }