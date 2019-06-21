import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
//    private static double ingredientCost;
//    public static void setIngredientCost(){
//        double guac = 0.50;
//        double chips = 0.50;
//
//
//    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        ArrayList<String> rice = new ArrayList<>();
        ArrayList<String> meat = new ArrayList<>();
        ArrayList<String> beans = new ArrayList<>();
        ArrayList<String> salsa = new ArrayList<>();
        ArrayList<String> veggies = new ArrayList<>();
        ArrayList<String> cheese = new ArrayList<>();
//        ArrayList<String> side = new ArrayList<>();
        ArrayList<String> chips = new ArrayList<>();
        ArrayList<String> beverage = new ArrayList<>();
        ArrayList<String> guac = new ArrayList<>();
        ArrayList<String> sourCream = new ArrayList<>();
        ArrayList<String> queso = new ArrayList<>();

        rice.add("white rice");
        rice.add("brown rice");
        rice.add("no rice");

        meat.add("chicken");
        meat.add("steak");
        meat.add("chorizo");
        meat.add("carnidas");
        meat.add("sofritas");
        meat.add("veggies");

        beans.add("pinto");
        beans.add("black");
        beans.add("no beans");

        salsa.add("mild");
        salsa.add("medium");
        salsa.add("hot");
        salsa.add("no salsa");

        veggies.add("lettuce");
        veggies.add("fajita veggies");
        veggies.add("no veggies");

//        cheese.add("cheese");
//        cheese.add("extra cheese");
//        cheese.add("light cheese");
//        cheese.add("no cheese");
        cheese.add("yes");
        cheese.add("no");

        sourCream.add("no");
        sourCream.add("yes");

        queso.add("yes");
        queso.add("no");

//        side.add("queso");
//        side.add("sour cream");
//        side.add("no side");
//        side.add("Both: sour cream & queso");

        chips.add("yes");
        chips.add("no");

        guac.add("no");
        guac.add("yes");

        beverage.add("coke");
        beverage.add("sprite");
        beverage.add("mountain dew");
        beverage.add("izzy");
        beverage.add("water");
        beverage.add("beer");
        beverage.add("cup of ice *ice is not free");

        int rand_salsa, rand_meat, rand_rice, rand_cheese, rand_veggies,
                rand_beans, rand_side, rand_chips, rand_beverage,
                rand_guac, rand_sourCream, rand_queso,    num = 1;
        String userResponse, cont = "";
        //number increment formula using for loop
        // have num return increment next to response?
        //msg here??
//        while(true){

//        while (!cont.equalsIgnoreCase("n")) {

//user inputs how many burritos they want:
        //uncomment lines 64 + 65, comment line 66
//            System.out.println("How many burros would you like?");
//            userResponseNum = sc.nextInt();
        int userResponseNum = 25;

        do {
            // or first message here

            //user's response
//            userResponse = sc.nextLine();

            //random generators in order
            rand_rice = rand.nextInt(rice.size());
            rand_beans = rand.nextInt(beans.size());
            rand_meat = rand.nextInt(meat.size());
            rand_salsa = rand.nextInt(salsa.size());
            rand_veggies = rand.nextInt(veggies.size());
            rand_cheese = rand.nextInt(cheese.size());
//            rand_side = rand.nextInt(side.size());
            rand_guac = rand.nextInt(guac.size());
            rand_queso = rand.nextInt(queso.size());
            rand_sourCream = rand.nextInt(sourCream.size());
            rand_beverage = rand.nextInt(beverage.size());


            //show customiziations in order
            System.out.println("Burrito" + num  + ": " + rice.get(rand_rice) + ", " + beans.get(rand_beans) + ", "
                    + meat.get(rand_meat) + ", " + salsa.get(rand_salsa) + ", " + veggies.get(rand_veggies) + ", "
                    + cheese.get(rand_cheese) + ", " + guac.get(rand_rice) + " ," + queso.get(rand_queso) + ", " +
            sourCream.get(rand_sourCream) + ", " + beverage.get(rand_beans));
            num++;

//
//            System.out.println("Would you like me to make another burrito? \n " +
//                    "Type: (y/n)");
//            cont = sc.nextLine();
        }while(num <= userResponseNum);
        System.out.println("Enjoy your burrito!!");
    }

    //numerous uncomments are from original code in 'Main' class
    //this class auto generates x number of burritos for customer
}
