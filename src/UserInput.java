import java.util.Scanner;

public class UserInput {
    public int[] getUserInput(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nThis app will do a simple mathematical process to change the time for the selected time zones.\n");
        System.out.print("Please enter the original time in the 24-hour clock format \"hh:mm\": \n");
        String userInput = scanner.next(); // take user input for original time
        System.out.print("\nWould you like to convert this time from: \n(1)EST to IST \n(2)IST to EST \n\nEnter 1 or 2:\n");
        int desiredChange = scanner.nextInt();
        System.out.println();
        scanner.close();
        
        String[] timeArray = userInput.split(":");
        int inputHours = Integer.parseInt(timeArray[0]);
        int inputMinutes = Integer.parseInt(timeArray[1]);
        int[] userInputTime = {inputHours, inputMinutes, desiredChange};

        return userInputTime;
    }
}
