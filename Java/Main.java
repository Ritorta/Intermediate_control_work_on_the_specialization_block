public class Main 
{
    public static void main(String[] args) 
    {
        Controller toyController = new Controller();
    
        toyController.addToy(new Toy(1, "Car", 4, 10, 40));
        toyController.addToy(new Toy(2, "Doll", 4, 12, 14));
        toyController.addToy(new Toy(3, "Ball", 4, 50, 100));
        
        toyController.getToy(10);
        toyController.saveToysToFile("toys.txt");
    }
}
