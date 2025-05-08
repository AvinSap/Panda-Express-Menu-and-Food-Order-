public class Crafted extends DishesBeverages {
    //ADDING SWEETNESS: FEATURE
    int sweetness;
    public Crafted(String food,String ingredient,double price, int sweetness ){
        super(food, ingredient, price);
        this.sweetness = 0;
    }
    public void craftedStatus(){
        System.out.println("You Order Of: " + food + " Will Be: $"+ price);

    }
}
