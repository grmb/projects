/*This is an attempted recreation of a Polytechnic project that I was tasked with a few years ago. My old file was
on my old computer but it deteriorated and therefore made it irretrievable.
The idea behind this project is to make a simple meal ordering system for customers. They had to be able to select
an appetizer, a main course, and a dessert. They are also allowed to skip selecting any meal should they so desire.
At the end of the program, the system is to calculate the total cost of the meals.*/
/*AUTHOR: Gabriel Burgos*/
import java.text.DecimalFormat;
import java.util.Scanner;
public class SetMeal {
	static String [] mealName = {"Caesar Salad", "Soup of the Day", "Garlic Bread",
            "Grilled Fish", "Chicken Chop", "Sirloin Steak",
             "Mango Pudding", "Ice Cream", "Apple Pie" };//array of food names
static double[] mealArray = {2.50, 2.80, 1.80, 6.70, 5.80, 7.60, 2.80, 1.70, 2.50};//declare an array of food prices
private static double appetizer = 0.00;// Need to set as global variable for totalCost() to access. Applies to String names as well
private static double mainMeal = 0.00;
private static double dessert = 0.00;
private static String appetizerName = "";
private static String mainName = "";
private static String dessertName = "";

static Scanner input = new Scanner(System.in);//input the user choice
static DecimalFormat fmt = new DecimalFormat("0.00"); //limited to two d.p. bec we are working with cents
public static void main (String[] args) {

int choice = 0;

while (choice != 5) {// pressing 5 exits the program and need to loop back to main after ordering meal

System.out.println("\t\tBOTAK JAMES MENU");
System.out.println("------------------------------------");
System.out.println("Please select an option(Press the number):");
System.out.println("1. Appetizer");
System.out.println("2. Main Course");
System.out.println("3. Dessert");
System.out.println("4. Total Cost");
System.out.println("5. Exit");
System.out.println("You can only choose ONE choice from the selection.");
System.out.println("Enter your choice:");
choice = input.nextInt();


switch (choice) {
case 1:

	appetizerMeal();
	break;


case 2:
	mainCourse();
	break;

case 3:
	dessertCourse();
	break;

case 4:
	totalCost();
	break;

case 5:
	System.out.println("Thank you for ordering at BOTAK JAMES.");
	break;

default:
	System.out.println("Error! Please pick another number");

}//end of switch(choice)
}//end of while loop



}//end of main


static void appetizerMeal() {

int choiceAppetizer=0;
while (choiceAppetizer>3||choiceAppetizer==0) {//only three choices
System.out.println("Please select an appetizer.");
System.out.println("1. Caesar Salad      $2.50");
System.out.println("2. Soup of the Day   $2.80");
System.out.println("3. Garlic Bread      $1.80");
System.out.println("Enter your choice:");

choiceAppetizer = input.nextInt();

switch (choiceAppetizer) {
case 1:
appetizer = mealArray[0]; //access the particular global array for this choice
appetizerName = mealName[0];
System.out.println("You chose Caesar Salad.");
break;
case 2:
appetizer = mealArray[1];
appetizerName = mealName[1];
System.out.println("You chose Soup of the Day.");
break;
case 3:
appetizer = mealArray[2];
appetizerName = mealName[2];
System.out.println("You chose Garlic Bread.");
break;


default:
System.out.println("Error! Pick another choice");
break;

}
}

}//end of appetizerMeal()

static void mainCourse(){

int choiceMain = 0;
while (choiceMain>3||choiceMain==0) {//only three choices
System.out.println("Please select a main course.");
System.out.println("1. Grilled Fish       $6.70");
System.out.println("2. Chicken Chop       $5.80");
System.out.println("3. Sirloin Steak      $7.60");
System.out.println("Enter your choice:");
choiceMain = input.nextInt();
switch (choiceMain){
case 1:
mainMeal = mealArray[3];
mainName = mealName[3];
System.out.println("You chose Grilled Fish.");
break;
case 2:
mainMeal = mealArray[4];
mainName = mealName[4];
System.out.println("You chose Chicken Chop.");
break;
case 3:
mainMeal = mealArray[5];
mainName = mealName[5];
System.out.println("You chose Sirloin Steak.");
break;

default:
System.out.println("Error! Pick another choice");
break;

    }//end switch
  }//end while loop
}//end of mainCourse()

static void dessertCourse(){

int choiceDessert = 0;
while (choiceDessert>3||choiceDessert==0) {//only three choices
System.out.println("Please select a dessert.");
System.out.println("1. Mango Pudding       $2.80");
System.out.println("2. Ice Cream           $1.70");
System.out.println("3. Apple Pie           $2.50");
System.out.println("Enter your choice:");
choiceDessert = input.nextInt();
switch (choiceDessert){
case 1:
dessert = mealArray[6];
dessertName = mealName[6];
System.out.println("You chose Mango Pudding.");
break;
case 2:
dessert = mealArray[7];
dessertName = mealName[7];
System.out.println("You chose Ice Cream.");
break;
case 3:
dessert = mealArray[8];
dessertName = mealName[8];
System.out.println("You chose Apple Pie.");
break;

default:
System.out.println("Error! Pick another choice");
break;

      }//end switch
   }//end while loop
}//end of dessertCourse()

static void totalCost(){
/*Shows what the user ordered and its cost. If nothing is ordered, it will indicate as such.*/
double total = 0.00;
total = appetizer + mainMeal + dessert;
if(appetizer>0.00) {
System.out.println("For the appetizer, you ordered " + appetizerName + ".      $" + fmt.format(appetizer));
}else{
System.out.println("No appetizer ordered.");
}
if(mainMeal>0.00) {
System.out.println("For the main course, you ordered " + mainName + ".      $" + fmt.format(mainMeal));
}else{
System.out.println("No main course ordered.");
}
if(dessert>0.00) {
System.out.println("For the dessert, you ordered " + dessertName + ".      $" + fmt.format(dessert));
}else{
System.out.println("No dessert ordered.");
}
System.out.println("The total cost is $" +fmt.format(total)+".");

}//end of totalCost()

}//end class
