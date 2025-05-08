import java.util.Scanner;
public class PandaExpress {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        while (true) {
            System.out.println("--------------------WELCOME TO PANDA EXPRESS---------------------------");
            System.out.println("SELECT AN OPTION TO CONTINUE");
            System.out.println("1. FOOD");
            System.out.println("2. BEVERAGES");
            System.out.println("3. EXIT");
            System.out.println("Pick an option between 1-3");

            //INTEGER TO ASK USER FOR CHOICE
            int choice = key.nextInt();
            switch (choice) {
                case 1:


                    System.out.println("ASK FOR PLATE OR A BOWL...");
                    System.out.println("1.Plate");
                    System.out.println("2.BOWL");

                    //plate oe bowl:
                     int plateBowl =key.nextInt();

                     if(plateBowl == 1 ) {
                         System.out.println("Thankyou for choosing Plate ");
                     }else if(plateBowl == 2) {
                         System.out.println("Thankyou for choosing Bowl ");
                     }else {
                         System.out.println("Sorry Enter 1 or 2");
                     }

                    System.out.println();
                    System.out.println("WHAT FOOD WOULD YOU LIKE??");
                    System.out.println();
                    System.out.println("WE OFFER FRIED RICE AND CHOW-MEIN WITH THE GIVEN SIDES:");
                    System.out.println();
                    System.out.println("NOW SELECT YOUR PREFERRED SIDE: ");
                    System.out.println("1.KungPao");
                    System.out.println("2.Orange Chicken");
                    System.out.println("3.Honey Walnut Shrimp");
                    System.out.println("Pick an option between 1-3");
                    System.out.println();
                    //FOOD CHOICE
                    int foodChoice = key.nextInt();
                    switch (foodChoice){
                        case 1:
                            System.out.println("FIRST ORDER STATUS");
                            System.out.println();
                            System.out.println("Your Kung Pao is Cooking....");
                            KungPao kung = new KungPao("Kung Pao", "Chicken, KungPao Sauce, Soy and Veggies", 10.99, 8);
                            kung.inProgress();
                            kung.ready();
                            kung.kungStatus();
                            System.out.println();
                            System.out.println();
                            break;
                        case 2:
                            System.out.println("FIRST ORDER STATUS");
                            System.out.println();
                            System.out.println("Your Orange Chicken is Cooking....");
                            KungPao kung1 = new KungPao("Orange Chicken", "Chicken, Orange Sauce, Vinegar", 10.99, 6);
                            System.out.println("FIRST ORDER STATUS");
                            kung1.inProgress();
                            kung1.ready();
                            kung1.kungStatus();
                            System.out.println();
                            System.out.println();
                            break;
                        case 3:
                            System.out.println("FIRST ORDER STATUS");
                            System.out.println();
                            System.out.println("Your Honey Walnut Shrimp is Cooking....");
                            KungPao kung2 = new KungPao("Honey Walnut Shrimp", "Shrimp, Honey Sauce and Walnut", 10.99, 3);
                            System.out.println("FIRST ORDER STATUS");
                            kung2.inProgress();
                            kung2.ready();
                            kung2.kungStatus();
                            System.out.println();
                            System.out.println();
                            break;
                        default:
                            System.out.println("Sorry enter numbers between 1-3");

                    }
                    break;

                case 2:
                    System.out.println("WHAT BEVERAGE WOULD YOU PREFER??");
                    System.out.println("1.Mango Guava Tea");
                    System.out.println("2.Pomegranate PineApple");
                    System.out.println("3.Peach Lychee");
                    System.out.println("Pick an option between 1-3");
                    System.out.println();
                    //FOOD CHOICE
                    int drinkChoice = key.nextInt();
                    switch (drinkChoice){
                        case 1:
                            System.out.println("SECOND ORDER STATUS");
                            System.out.println();
                            System.out.println("Your Mango Guava Tea is in progress.... ");
                            System.out.println();
                            Crafted craft = new Crafted("Mango Guava Tea", "Mango and Guava concentrate",3.99, 8);
                            craft.inProgress();
                            craft.ready();
                            craft.craftedStatus();
                            System.out.println();
                            break;
                        case 2:
                            System.out.println("SECOND ORDER STATUS");
                            System.out.println();
                            System.out.println("Your Pomegranate PineApple is in progress....");
                            Crafted craft1 = new Crafted("Pomegranate PineApple", "Pomegranate and PineApple concentrate",3.99, 6);
                            System.out.println("SECOND ORDER STATUS");
                            craft1.inProgress();
                            craft1.ready();
                            craft1.craftedStatus();
                            System.out.println();
                            System.out.println();
                            break;
                        case 3:
                            System.out.println("SECOND ORDER STATUS");
                            System.out.println();
                            System.out.println("Your Peach Lychee is in progress");
                            Crafted craft2 = new Crafted(" Peach Lychee", " Peach and Lychee concentrate",3.99, 9);
                            System.out.println("SECOND ORDER STATUS");
                            craft2.inProgress();
                            craft2.ready();
                            craft2.craftedStatus();
                            System.out.println();
                            break;
                        default:
                            System.out.println("Sorry enter numbers between 1-3");

                    }
                     break;

                    case 3:
                    System.out.println("THANKYOU FOR VISITING PANDA EXPRESS!!!!");
                    System.out.println("Press anything to get to home page");
                    key.next();

            }


        }

    }
}
