package U9T5;

import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {
        // Animal animal = new Animal("Thing");
        // Puppy puppy = new Puppy("Spot");
        // Cow cow = new Cow("Marge");
        // Dog dog = new Dog("Penny");

        // ArrayList<String> animals = new ArrayList<>(); 
        // animals.add("Thing"); 
        // animals.add("Spot");
        // animals.add("Marge");
        // animals.add("Penny"); 

        // for (String i : animals){
        //     System.out.println(i);
        // }

        // String[] a = new String[4]; 
        // for (int i = 0; i < a.length; i++){
        //     if (a.equals("Marge")){
                 
        //     }
        // }

        

        Animal animal = new Animal("Thing");
        Puppy puppy = new Puppy("Spot");
        Cow cow = new Cow("Marge");
        Dog dog = new Dog("Penny");
     

        
        Vet vet = new Vet("Turin");
        System.out.println("----> Adding each client (successful):");
        System.out.println(vet.addClient(animal));
        System.out.println(vet.addClient(puppy));
        System.out.println(vet.addClient(cow));
        System.out.println(vet.addClient(dog));
        System.out.println("----> Adding each client again (unsuccessful):");
        System.out.println(vet.addClient(animal));
        System.out.println(vet.addClient(puppy));
        System.out.println(vet.addClient(cow));
        System.out.println(vet.addClient(dog));
        System.out.println("----------> PRINTING CLIENT LIST <----------");
        vet.printClientList();
        
    }
}
