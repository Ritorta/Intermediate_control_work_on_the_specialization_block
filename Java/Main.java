public class Main 
{
    public static void main(String[] args) 
    {
        Controller toyController = new Controller();
    
        toyController.addToy(new Toy(1, "Car", 50, 10, 40));
        toyController.addToy(new Toy(2, "Doll", 50, 10, 10));
        toyController.addToy(new Toy(3, "Ball", 10, 10, 99));
        
        toyController.getToy(10);
    }
}
