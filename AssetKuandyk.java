import com.sun.xml.internal.stream.Entity;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.GregorianCalendar;
import java.util.Scanner;
public class AssetKuandyk {
    public static void main(String[] args) {
        Greeting();
        travelTimeBudget();
        timeDifference();
        CountryArea();
        NextDestination();

    }
        public static void Greeting(){
            Scanner scan = new Scanner(System.in);
            System.out.println("Welcome to Vacation Planner !");
            System.out.print("What is your name:");
            String name = scan.nextLine();
            System.out.print("Nice to meet you " + name + ", where are you traveling to?");
            String place = scan.nextLine();
            System.out.println("Great! " + place + " sounds like a great trip");
            System.out.println();
        }
        static void  travelTimeBudget() {
            Scanner scan = new Scanner(System.in);
            System.out.print("How many days are you going to spend traveling?");
            int days = scan.nextInt();
            System.out.print("How much money , in USD , are you planning to spend on your trip:");
            double money = scan.nextDouble();
            String money1 = String.format("%.0f",money);
            scan.nextLine();
            System.out.print("What is the three letter currency symbol for your travel destination?");
            String symbol = scan.nextLine();
            System.out.print("How many EUR are there in 1 USD?");
            double ss = scan.nextDouble();
            int hours = days * 24;
            int minute = hours * 60;
            int seconds = minute * 60;
            double mon = (money / days);
            double budget = money * ss;
            double per = budget/days;
            System.out.println();

            System.out.println("If you are traveling for " + days + " days that is same as " + hours + " hours or " + minute + " minutes or " + seconds + " seconds.");
            System.out.println("If you are going to spend " + "$" + money1 + " USD that means per day you can spend up to " + "$"+String.format("%.1f", mon) + " USD ");
            System.out.println("Your total budget in "+ symbol + " is " + budget + " " + symbol +" , which per day is " + String.format("%.2f",per ) + " " + symbol);
            System.out.println();
    }


    public static void timeDifference(){
        Scanner scan = new Scanner(System.in);
        System.out.print("What is the time difference, in hours, between your home and your destination?");
        int time = scan.nextInt();
        int dayhour = 24;
        int midday = 12;
        int time2 = time % dayhour;
        int timedifference1 = 0;
        int timedifference2 = 0;
        if(time >= 0){
            timedifference1 = time2 +midday;
            timedifference2 = time2;
            if(timedifference1 >= dayhour){
                timedifference1 -= dayhour;
            }
        }else if(time < 0){
            timedifference2= time2 + dayhour;
            timedifference1 = Math.abs(time2+midday);
        }
        System.out.println("That means that when it is midnight at home it will be " + timedifference2 + ":00" + " in your destination and when it's noon at home it will be " + timedifference1 + ":00");
        System.out.println();
        
    }
    public static void CountryArea(){
        Scanner scan = new Scanner(System.in);
        System.out.print("What is square area of your destination country in km2 ?");
        int km = scan.nextInt();
        double miles2 = 0.38610215854245;
        double km2 = miles2 * km;
        System.out.println("In miles2 that is " + String.format("%.2f",km2));
        System.out.println();

    }
    public static void NextDestination() {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many places you traveled to : ");
        int place = scan.nextInt();
        String [] name1 = new String[place];
        scan.nextLine();
        for(int i  = 0; i < place; i++){
            System.out.print("Enter the name : ");
            name1[i]= scan.nextLine();
        }
        System.out.println();
        System.out.println("Next place you want to travel to :");
        String [] place2 = new String[5];
        for(int i = 0; i < 5;i++){
            System.out.print(i + ": ");
            place2[i] = scan.nextLine();

        }
        System.out.println();

        System.out.print("Your input should be -> ");
        int place3 = scan.nextInt();
        System.out.println("Thank you , Your next location is : " + place2[place3 - 1]);
    }


    

}