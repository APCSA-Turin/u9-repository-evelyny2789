package U9T5;

public class Cow extends Animal{
    public Cow (String name){
        super(name); 
    }

    @Override
    public void talk(){
        System.out.println("Moooove over buter");
    }

    public void milk(){
        System.out.println("My milk is rich in calcium");
    }
}
