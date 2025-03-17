public class VehicleRunner {
    public static void main(String[] args) {
        // testing all available methods on a Vehicle object
        Vehicle myVehicle = new Vehicle("Generic Vehicle", 6);
        System.out.println(myVehicle.getName());
        System.out.println(myVehicle.getWheels());
        myVehicle.move(10);
        myVehicle.turn();
        myVehicle.brake();

        // testing all available methods on a Car object
        Car myCar = new Car("Honda Civic", 4, "leather");
        System.out.println(myCar.getName()); // inherited method
        System.out.println(myCar.getWheels()); // inherited method
        System.out.println(myCar.getFabric()); // method ONLY available on Car objects
        myCar.move(30); // inherited method
        myCar.turn(); // inherited method
        myCar.brake(); // inherited method
        myCar.honk(); // method ONLY available on Car objects
        myCar.lockDoors(); // method ONLY available on Car objects

        // ---- WRITE YOUR BICYCLE TEST CODE BELOW ----
        Bicycle bicycle = new Bicycle("bike", 2, 8); 
        System.out.println(bicycle.getName());
        System.out.println(bicycle.getWheels());
        System.out.println(bicycle.getGearCount());
        bicycle.move(10); 
        bicycle.turn(); 
        bicycle.brake();
        bicycle.ringBell(); 

        Airplane airplane = new Airplane("air", 4, 2500); 
        System.out.println(airplane.getName());
        System.out.println(airplane.getWheels());
        System.out.println(airplane.getElevation());
        airplane.move(100); 
        airplane.getWheels(); 
        airplane.turn(); 
        airplane.brake();
        airplane.pilot();
    }
}