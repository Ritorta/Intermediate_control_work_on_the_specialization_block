import java.util.ArrayList;
import java.util.List;

public class Controller 
{
    private List<Toy> toy;

    public Controller()
    {
        toy = new ArrayList<>();

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



}
