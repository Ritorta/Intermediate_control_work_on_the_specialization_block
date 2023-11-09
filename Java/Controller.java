import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

public class Controller 
{
    private PriorityQueue<Toy> toyQueue;

    public void addToy(Toy toy) 
    {
        if (toy.getQuantity() != 0)
        {
            for (int i = 0; i < toy.getQuantity(); i++) 
            {
                toyQueue.offer(toy);
            }
        }
        else
        {
            System.out.println("Toys " + toy.getName() + " ID " + toy.getId() + " are over!");
        }
    }
    
    public Controller() 
    {
        toyQueue = new PriorityQueue<>((toy1, toy2) -> {
            if (toy1.getDropChance() == toy2.getDropChance())
            {
                return toy2.getWeight() - toy1.getWeight();
            }
            return toy1.getDropChance() - toy2.getDropChance();
        });
    }

    public void getToy(int count)
    {
        Random random = new Random();
        
        Queue<Toy> queue = new LinkedList<>(toyQueue);
        for (int i = 0; i < count; i++) 
        {
            Toy toy = queue.poll();
            if (toy == null) 
            {
                System.out.println("No more toys!");
                break;
            }

            if (toy.getDropChance() >= 100 || toy.getDropChance() > random.nextInt(100)) 
            {
                System.out.println("Got toy with " + toy.getName() + " ID " + toy.getId());
            } 
            else if(toy.getDropChance() >= 1 && toy.getDropChance() <= 99 && toy.getDropChance() > random.nextInt(100))
            {
                System.out.println("Got toy with " + toy.getName() + " ID " + toy.getId());
            }
            else
            {
                System.out.println("Toy with ID " + toy.getId() + " did not drop.");
            }
        }
    }
    
    
    
    
    
    
   
}
