package U9T3;

public class Runner {
    public static void main(String[] args) {
        // Agent amy = new Agent("Amy Higgins", "646-555-5555");
        // Comedian morgan = new Comedian("Morgan Smith", 31, amy);
        // morgan.randomMethod();

        // Agent amy = new Agent("Amy Higgins", "646-555-5555");
        // Comedian morgan = new Comedian("Morgan Smith", 31, amy);
        // morgan.callAgent("Knock knock? Who's there? Boo? Boo who? Now don't start crying, it was only a joke!");

        // Agent maria = new Agent("Maria Hilliard", "917-221-3451");
        // Dancer tony = new Dancer("Tony Danza", 32, maria, 11);
        // tony.rehearse();

        // Agent maria = new Agent("Maria Hilliard", "917-221-3451");
        // Dancer tony = new Dancer("Tony Danza", 32, maria, 11);
        // tony.perform(); // call inherited method
        // System.out.println();
        // tony.perform(true); // call overloaded method
        // System.out.println();
        // tony.perform(false); // call overloaded method

        // Agent maria = new Agent("Maria Hilliard", "917-221-3451");
        // Dancer tony = new Dancer("Tony Danza", 32, maria, 11);
        // tony.callAgent(); // call overridden method

        // Agent maria = new Agent("Maria Hilliard", "917-221-3451");
        // Dancer tony = new Dancer("Tony Danza", 32, maria, 11);
        // tony.callAgent(12); // call overloaded method

        Agent maria = new Agent("Maria Hilliard", "917-221-3451");
        Dancer tony = new Dancer("Tony Danza", 32, maria, 11);
        System.out.println(tony.getName()); // call overridden method
    }
}   