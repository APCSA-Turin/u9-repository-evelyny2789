public class Teacher extends Person{
    private int numStudents; 

    public Teacher(String name, int height, int numStudents){
        super(name, height); 
        this.numStudents = numStudents; 
    }

    public int getNumStudents(){
        return numStudents; 
    }
    
    public void classOver(){
        System.out.println("Class is over");
    }


}
