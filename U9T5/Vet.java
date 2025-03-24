package U9T5;
import java.util.ArrayList;

import Animal;
public class Vet {
    private String vetName; 
    private ArrayList<Animal> clients; 

    public Vet(String vetName){
        this.vetName = vetName; 
        clients = new ArrayList<Animal>(); 
    }

    public boolean addClient(Animal client){
        if (clients.indexOf(client) == -1){
            clients.add(client);
            System.out.println("Welcome to " + vetName + ";s office, " + client.getName());
            return true; 
        } else {
            System.out.println(client + " is already a client of " + vetName);
            return false; 
        }
    }

    public void printClientList(){
        for (Animal animal : clients){
            System.out.println(animal.getName() + ": " + animal.getClass());
        }
    }
}
