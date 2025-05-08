public class KungPao extends DishesBeverages {
    //ADDING SPICE FEATURE
    int spiceLevel;
   public KungPao(String food,String ingredient,double price, int spiceLevel   ){
       super(food, ingredient, price);
       this.spiceLevel = 0;

   }
    public void kungStatus(){
        System.out.println("You Order Of: " + food + " Will Be: $"+ price);

    }
}
