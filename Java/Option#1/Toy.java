public class Toy 
{
    private int id;
    private String name;
    private int quantity;
    private int weight;
    private int dropChance;
    // Constructuons
    public Toy(int id, String name, int quantity, int weight, int dropChance) 
    {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.weight = weight;
        this.dropChance = dropChance;

    }
    // Gets metods
    public int getId() 
    {
        return id;

    }

    public String getName() 
    {
        return name;

    }

    public int getQuantity() 
    {
        return quantity;

    }

    public int getWeight() 
    {
        return weight;

    }

    public int getDropChance() 
    {
        return dropChance;

    }
}
