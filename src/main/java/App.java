// UCF COP3330 Summer 2021 Assignment 6 Solution
// *  Copyright 2021 Igli Spaho

//Your computer knows what the current year is, which means you can incorporate that into your programs. You just have to figure out how your programming language can provide you with that information.
// Create a program that determines how many years you have left until retirement and the year you can retire. It should prompt for your current age and the age you want to retire and display the output as shown in the example that follows.

// Example Output
// What is your current age? 25
// At what age would you like to retire? 65
// You have 40 years left until you can retire.
// It's 2015, so you can retire in 2055.
// Constraints
// Again, be sure to convert the input to numerical data before doing any math.
// Don’t hard-code the current year into your program. Get it from the system time via your programming language.


import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
public class App {
    public static void main (String[] args){
        Scanner in =new Scanner(System.in);
        System.out.print("What is your current age?");
        String age = in.nextLine();

        System.out.print("At what age would you like to retire?");
        String retire = in.nextLine();

        int a = Integer.parseInt(age);
        int b = Integer.parseInt(retire);
        int c = b-a;


        Date currentDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy");


        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int retireYear = currentYear +c;

        System.out.println("You have " + c + " years left until you can retire." );
        System.out.println("Its "+currentYear+ " so you can retire in " +retireYear  );
    }
}
