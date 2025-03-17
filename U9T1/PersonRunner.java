public class PersonRunner {
    public static void main(String[] args) {
        Person person = new Person("Amy", 60); 
        System.out.println(person.getName()); 
        System.out.println(person.getHeight());
        person.introduce();

        Student student = new Student("Jay", 70, 4.0); 
        System.out.println(student.getName()); 
        System.out.println(student.getHeight());
        student.introduce();
        student.doHW();

        Teacher teacher = new Teacher ("Ms.G", 65, 200); 
        System.out.println(teacher.getName()); 
        System.out.println(teacher.getHeight());
        System.out.println(teacher.getNumStudents());
        teacher.introduce();
        teacher.classOver();
    }
}
