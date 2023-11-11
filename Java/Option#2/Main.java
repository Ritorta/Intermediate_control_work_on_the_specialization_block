import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException
    {
        Controller toyController = new Controller();
            
        // add some toys
        toyController.addToy(1, "Toy 1", 10, 20);
        toyController.addToy(2, "Toy 2", 5, 10);
        toyController.addToy(3, "Toy 3", 20, 70);

        
        // set the weight of a toy
        toyController.setToyDropChance(2, 30);

        // play the game
        toyController.RollPrizeToy();

        // get the prize toy
        toyController.removeSavePrizeToy();
    }
}