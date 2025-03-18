public class Cat extends Animal{
    private boolean hasPlayedWith; 
    private boolean hasGroomed; 

    public Cat (String name, int age, boolean vaccinated, String eyeColor, boolean hasPlayedWith, boolean hasGroomed){
        super(name, age, vaccinated, eyeColor);
        this.hasPlayedWith = hasPlayedWith; 
        this.hasGroomed = hasGroomed; 
    }

    public boolean getHasPlayedWith(){
        return hasPlayedWith; 
    }

    public boolean gethasGroomed(){
        return hasGroomed; 
    }

    public void play(){
        System.out.println("played");
    }

    public void meow(){
        System.out.println("meow");
    }
}
