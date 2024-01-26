import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nThis app will do a simple mathematical process to change time from EST to India.\n");
        System.out.print("Please enter the EST time in the 24-hour clock format hh:mm, \n");
        String userInput = scanner.next(); // take user input
        
        // System.out.print("AM, PM, or 24 hour clock? Enter A/P/2:"); // choose am pm or 24 hour clock
        // String ampm24 = scanner.next(); //take user input for am pm or 24
        // if(ampm24.equalsIgnoreCase("A")){System.out.println("Entry error. Please enter as A/P/2" );} //conditional to check for am pm or 24
        
        String[] timeArray = userInput.split(":");
        int inputHours = Integer.parseInt(timeArray[0]);
        int inputMinutes = Integer.parseInt(timeArray[1]);
        System.out.println("The time you gave is " + inputHours + ":" + inputMinutes );


        // hours logic - will need minutes aspect added
        int hoursChanging = inputHours + 10;
        int resultHours;
        if(hoursChanging >= 24){
            resultHours = hoursChanging - 24;
        }
        else{
            resultHours = inputHours + 10;
        }

        System.out.println(resultHours);
        

        // we need to take hours and add 10. but IF it passes 12 this will cause confusion
        // perhaps we need to determine if hours given is 24 hour clock or 12 hour clock am/pm
        // we need to add 30 minutes. however after 60 we need to add to hours 
        // and add remainders to next minutes


        scanner.close();
    }
}

