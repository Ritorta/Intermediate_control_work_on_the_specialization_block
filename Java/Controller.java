import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

public class Controller 
{
    private PriorityQueue<Toy> toyQueue;
    // Add toys to the PriorityQueue collection
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
    // Comparison of toys by weight
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
    // Logic random toys
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

            if (toy.getDropChance() >= 100 && toy.getDropChance() > random.nextInt(100)) 
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
    // Save file
    public void saveToysToFile(String filename) 
    {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) 
        {
            for (Toy toy : toyQueue) 
            {
                writer.write(toy.getId() + "," + toy.getName() + "," + toy.getQuantity() + "," + toy.getWeight() + "," + toy.getDropChance() + "\n");
            }
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }
    }
}
