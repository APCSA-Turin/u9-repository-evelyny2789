public class Main {
    public static void main(String[] args) {
        GamingDesktop myGamingDesktop = new GamingDesktop(15, 512, "NVida");
        myGamingDesktop.updateDrivers();
        System.out.println(myGamingDesktop instanceof GamingDesktop);
        System.out.println(myGamingDesktop instanceof Desktop);
        System.out.println(myGamingDesktop instanceof Computer);
        System.out.println(myGamingDesktop instanceof Object);

        Laptop laptop = new Laptop(16, 256);
        laptop.installOperatingSystem();
        laptop.printInfo();

        Car myCar = new Car("MK4567", 10.0, 3, true);
        System.out.println(myCar.calculateTollPrice());

        Car myCar2 = new Car("FJ8731", 10.0, 6, true);
        System.out.println(myCar2.calculateTollPrice());

        // the way toll price is calculated for a Vehicle
        // shouldn't have changed
        Vehicle myVehicle = new Vehicle("KX1543", 10.0, 6);
        System.out.println(myVehicle.calculateTollPrice());

        Truck myTruck = new Truck("TY45LX", 20.0, 3, 5, true);
        System.out.println(myTruck.calculateTollPrice());

        Truck myTruck2 = new Truck("LM90LX", 20.0, 3, 5, false);
        System.out.println(myTruck2.calculateTollPrice());

        // the way toll price is calculated for a Vehicle
        // shouldn't have changed
        Vehicle myVehicle2 = new Vehicle("TR987", 10.0, 6);
        System.out.println(myVehicle2.calculateTollPrice());

        Taxi taxi = new Taxi("HJKB328", 10.0, 6, true, 5.0);
        System.out.println(taxi.calculateTollPrice());

        Car myFaveCar = new Car("MK4567", 10.0, 3, true);
        Taxi myTaxiCab = new Taxi("TX1234", 10.0, 6, true, 0.0);
        myFaveCar.printCar();
        System.out.println();
        myTaxiCab.printTaxi();

    }
}
