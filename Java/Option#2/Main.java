import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException
    {
        Controller toyController = new Controller();   
        // Add some toys
        toyController.addToy(1, "Car", 10, 20);
        toyController.addToy(2, "Doll", 5, 10);
        toyController.addToy(3, "Constructor", 20, 70);   

        // Set the DropChance Toy
        toyController.setToyDropChance(2, 30);
        // Roll the toy
        toyController.RollPrizeToy();
        // Save prize toy
        toyController.removeSavePrizeToy();
    }
}
