public class Bicycle extends Vehicle {
    private int gearCount; 

    public Bicycle(String name, int wheels, int gearcount) {
        super(name, wheels, gearcount);
        this.gearCount = gearCount; 
    }

    public int getGearCount() {
        return gearCount; 
    }

    public void ringBell(){
        System.out.println("ring"); 
    }
}