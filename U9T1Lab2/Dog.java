public class Dog extends Animal{
    private boolean hasBeenWalked; 
    private boolean trained; 

    public Dog(String name, int age, boolean vaccinated, String eyeColor, boolean hasBeenWalked, boolean trained){
        super(name, age, vaccinated, eyeColor); 
        this.hasBeenWalked = hasBeenWalked; 
        this.trained = trained; 
    }

    public boolean hasBeenWalked(){
        return hasBeenWalked; 
    }

    public boolean getTrained(){
        return trained; 
    }

    public void walk(){
        System.out.println("walked");
    }

    public void bark(){
        System.out.println("woof");
    }
}
