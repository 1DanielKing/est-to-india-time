import java.util.Scanner;

public class UserInput {
    public int[] getUserInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nThis app will do a simple mathematical process to change time for the selected time zone.\n");
        System.out.print("Please enter the original time in the 24-hour clock format hh:mm, \n");
        String userInput = scanner.next(); // take user input for original time
        System.out.print("\nWould you like to convert this time from: \n(1)EST to IST (2)IST to EST? \nEnter 1 or 2:");
        int desiredChange = scanner.nextInt();
        scanner.close();
        
        
        // System.out.print("AM, PM, or 24 hour clock? Enter A/P/2:"); // choose am pm or 24 hour clock
        // String ampm24 = scanner.next(); //take user input for am pm or 24
        // if(ampm24.equalsIgnoreCase("A")){System.out.println("Entry error. Please enter as A/P/2" );} //conditional to check for am pm or 24
        
        String[] timeArray = userInput.split(":");
        int inputHours = Integer.parseInt(timeArray[0]);
        int inputMinutes = Integer.parseInt(timeArray[1]);

        int[] userInputTime = {inputHours, inputMinutes, desiredChange};

        System.out.println("The time you gave is " + userInputTime[0] + ":" + userInputTime[1] );

        return userInputTime;
    }
}
