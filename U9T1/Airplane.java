public class Airplane extends Vehicle{
    private int elevation; 

    public Airplane(String name, int wheels, int elevation){
        super(name, wheels); 
        this.elevation = elevation; 
    }

    public int getElevation(){
        return elevation; 
    }

    public void pilot(){
        System.out.println("Captain");
    }
}
