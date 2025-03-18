public class Animal {
    private String name; 
    private int age; 
    private boolean vaccinated; 
    private String eyeColor; 

    public Animal (String name, int age, boolean vaccinated, String eyeColor){
        this.name = name; 
        this.age = age; 
        this.vaccinated = vaccinated; 
        this.eyeColor = eyeColor; 
    }

    public String getName(){
        return name; 
    }

    public int getAge(){
        return age; 
    }
    
    public boolean getVaccinated(){
        return vaccinated; 
    }

    public String getEyeColor(){
        return eyeColor; 
    }

    public void adopt(){
        System.out.println("I have a new home");
    }

    public void feed(){
        System.out.println("fed");
    }

    public void sleep(){
        System.out.println("fully rested");
    }
}