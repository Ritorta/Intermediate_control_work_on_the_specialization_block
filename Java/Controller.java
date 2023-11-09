import java.util.PriorityQueue;

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
    
    
    
    
    
    
    
    
    
   
}
