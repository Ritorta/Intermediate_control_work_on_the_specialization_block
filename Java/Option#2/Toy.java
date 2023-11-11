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

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getDropChance() {
        return dropChance;
    }

    
    
    
}
