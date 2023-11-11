import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.LineNumberReader;

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
    // Logic random toys and transformation to String for save results
    public String getToy(int count)
    {
        Random random = new Random();
        StringBuilder transfStr = new StringBuilder();
        Queue<Toy> queue = new LinkedList<>(toyQueue);
        
        for (int i = 0; i < count; i++) 
        {
            Toy toy = queue.poll();
            if (toy == null) 
            {
                transfStr.append("No more toys!").append("\n");
                break;
            }

            if (toy.getDropChance() >= 100 && toy.getDropChance() > random.nextInt(100)) 
            {
                transfStr.append("Got toy with ").append(toy.getName()).append(" ID ").append(toy.getId()).append("\n");
            } 
            else if(toy.getDropChance() >= 1 && toy.getDropChance() <= 99 && toy.getDropChance() > random.nextInt(100))
            {
                transfStr.append("Got toy with ").append(toy.getName()).append(" ID ").append(toy.getId()).append("\n");
            }
            else
            {
                transfStr.append("Toy with ID ").append(toy.getId()).append(" did not drop.").append("\n");
            }
        }
        return transfStr.toString();
    }
    // Save file Toy
    public void saveToysToFile(String filename) 
    {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) 
        {
            for (Toy toy : toyQueue) 
            {
                writer.write("Toy: ID " + toy.getId() + ", " + "Name " + toy.getName() + ", " + "Quantity " + toy.getQuantity() + 
                ", " + "Weight " + toy.getWeight() + ", " + "DropChance " + toy.getDropChance() + "\n");
            }
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }
    }
    // Save file Raffle Toy 
    // public void addResultToFile(String result, String filename) 
    // {
    //     try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true))) 
    //     {
    //         writer.write(result + "\n");
    //     } 
    //     catch (IOException e) 
    //     {
    //         e.printStackTrace();
    //     }
    // }
    // Save file Raffle Toy and count number raffle
    public void addResultToFile(String result, String filename)
    {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true)))
        {
            int count = 0;
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            while (reader.readLine() != null)
                {
                    count++;
                }
            reader.close();

            writer.write("Count raffle #" + (count + 1) + " - Result:" + "\n");
            writer.write(result + "\n");
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }
    }
}


    

