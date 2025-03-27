public class Rose extends Flower{
	private String color; 
	public Rose (String name, int petals, String color){
    super(name, petals); 
    this.color = color; 
    }
    public String getColor(){
        return color; 
    }
	public String info(){
		return super.info() + "\ncolor: " + color; 
	}
}
