import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {
        ArrayList<Pet> petList = new ArrayList<Pet>();
        Pet pet1 = new Pet ("Floppy", "rabbit"); 
        Pet pet2 = new Pet ("Arty", "pug"); 
        petList.add(pet1);
        petList.add(pet2);


        Plant p = new Plant("Aloe");
        Flower f = new Flower("Petunia", 10);
        Rose r = new Rose("Damask", 25, "pink");
        Plant[] garden = new Plant[3];
        garden[0] = p;
        garden[1] = f;
        garden[2] = r;


        for (Plant plant : garden) {
            System.out.println(plant.info());
        }
        System.out.println("-----------");
        f.losePetals(3);
        r.losePetals(5);
        System.out.println(f.info());
        System.out.println(r.info());
        System.out.println("-----------");
        System.out.println(p.getName());
        System.out.println(f.getName());
        System.out.println(r.getName());
        System.out.println(f.getPetals());
        System.out.println(r.getPetals());
        System.out.println(r.getColor());


    }
}
