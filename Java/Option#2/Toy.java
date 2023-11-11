public class Toy
{
    private int id; 
    private String name;
    private int quantity;
    private double dropChance;

    public Toy(int id, String name, int quantity, double dropChance) 
    {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.dropChance = dropChance;
    }

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

    public double getDropChance() 
    {
        return dropChance;

    }

    public void setId(int id) 
    {
        this.id = id;

    }

    public void setName(String name) 
    {
        this.name = name;

    }

    public void setQuantity(int quantity)
    {
        this.quantity = quantity;

    }

    public void setDropChance(double dropChance) 
    {
        this.dropChance = dropChance;
        
    }

    public void add(Toy toy) {
    } 
    
}
