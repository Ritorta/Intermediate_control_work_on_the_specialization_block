import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Controller 
{
    private List<Toy> toy;
    private List<Toy> prizeToys;

    public Controller()
    {
        toy = new ArrayList<>();
        prizeToys = new ArrayList<>();
    }

    public void addToy(Toy toy)
    {
        toy.add(toy);

    }

    public void setToyDropChance(int id, double DropChance) 
    {
        for (Toy toy : toy) 
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
        for (Toy toy : toy) 
        {
            DropChance += toy.getDropChance();
        }
        return DropChance;
    } 

    public void RollPrizeToy()
    {
        double DropChance = RollDropChance();
        // Random Generator
        Random rand = new Random();
        double randomNumber = rand.nextDouble() * DropChance;
        // Search the prize toy
        if (toy.isEmpty()) 
        {
            System.out.println("Toys are over");
        }

        if (DropChance <= 0) 
        {
            System.out.println("Error DropChance = 0 or -1");
        }
        
        Toy prizeToy = null;
        for (Toy toy : toy) {
            if (randomNumber < toy.getDropChance()) 
            {
                prizeToy = toy;
                break;
            }
            randomNumber -= toy.getDropChance();
        }
    
        // add the prize toy to List
        if (prizeToy != null && prizeToy.getQuantity() > 0) 
        {
            prizeToys.add(prizeToy);

        // decrement the quantity of the prize toy
            prizeToy.setQuantity(prizeToy.getQuantity() - 1);
        }
        
    }

    
    
        



}
