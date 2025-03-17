public class Student extends Person{
    private double GPA; 

    public Student (String name, int height, double GPA){
        super(name, height); 
        this.GPA = GPA; 
    }

    public double getGPA(){
        return GPA; 
    }

    public void doHW(){
        System.out.println("I finished");
    }
}
