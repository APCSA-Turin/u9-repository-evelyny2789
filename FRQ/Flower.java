public class Flower extends Plant{
	private int petals; 
	public Flower(String name, int petals){
		super(name); 
		this.petals = petals; 
	} 
	public int getPetals(){
		return petals; 
	}
	public String info(){
		return super.info() + "\nPetals: " + petals;
	}
	public void losePetals(int num){
        petals-=num; 
    }
}
