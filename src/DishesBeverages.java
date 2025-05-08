public class DishesBeverages {
    //ATTRIBUTES:
    String food;
    String ingredient;
    double price;

    //CONSTRUCTOR:
    public DishesBeverages(String food, String ingredient, double price ){
        this.food = food;
        this.ingredient = ingredient;
        this.price = price;
    }
    public void inProgress(){
        System.out.println("Your Order is in Progress....");
        System.out.println();
    } public void ready(){
        System.out.println("Your Order is Ready....");
        System.out.println();
    }

}
