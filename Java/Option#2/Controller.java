import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Controller 
{
    private List<Toy> toys;
    private List<Toy> prizeToys;

    public Controller()
    {
        toys = new ArrayList<>();
        prizeToys = new ArrayList<>();

    }

    public void addToy(int id, String name, int quantity, double DropChance)
    {
        Toy toy = new Toy(id, name, quantity, DropChance);
        toys.add(toy);

    }

    public void setToyDropChance(int id, double DropChance) 
    {
        for (Toy toy : toys) 
        {
            if (toy.getId() == id) 
            {
                toy.setDropChance(DropChance);
                break;
            }
        }
    }

    private double RollDropChance()
    {
        double DropChance = 0;
        for (Toy toy : toys) 
        {
            DropChance += toy.getDropChance();
            
        }
        System.out.println(DropChance);
        return DropChance;
    } 

    public void RollPrizeToy()
    {

        double DropChance = RollDropChance();
        
        // Random Generator
        Random rand = new Random();

        double randomNumber = rand.nextDouble() * DropChance;
        // Search the prize toy
        if (toys.isEmpty()) 
        {
            System.out.println("Toys are over");
            return;
        }

        if (DropChance <= 0) 
        {
            System.out.println("Error DropChance = 0 or -1");
            return;
        }
        
        Toy prizeToy = null;
        for (Toy toy : toys) {
            if (randomNumber < toy.getDropChance()) 
            {
                prizeToy = toy;
                break;
            }
            randomNumber -= toy.getDropChance();
        }
    
        // Add the prize toy to List
        if (prizeToy != null && prizeToy.getQuantity() > 0) 
        {
            prizeToys.add(prizeToy);

        // Decrement the quantity of the prize toy
            prizeToy.setQuantity(prizeToy.getQuantity() - 1);
        }
        
    }

    public void removeSavePrizeToy() throws IOException 
    {
        if (prizeToys.size() > 0) 
        {
            // Remove the first prize toy in list
            Toy prizeToy = prizeToys.remove(0);
    
            // Save the prize toy to file
            try (FileWriter writer = new FileWriter("prize_toys.txt", true)) 
            {
                writer.write(prizeToy.getId() + "," + prizeToy.getName() + "\n");
                
            } catch (IOException e) 
            {
                e.printStackTrace();
            }
        }
    }
}
