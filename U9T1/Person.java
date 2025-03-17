public class Person {
    private String name; 
    private int height; 

    public Person(String name, int height){
        this.name = name; 
        this.height = height; 
    }

    public String getName(){
        return name; 
    }

    public int getHeight(){
        return height; 
    }

    public void introduce(){
        System.out.println("Hi my name is " + name);
    }
}
