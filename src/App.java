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


        // minutes logic... when minutes > 60, increase hours by +1 and minutes - 60
        int minutesChanging = inputMinutes + 30;
        int resultMinutes;
        if(minutesChanging >= 60){
            resultMinutes = minutesChanging - 60;
            inputHours = inputHours + 1;
        }
        else resultMinutes = minutesChanging;

        // hours logic
        int hoursChanging = inputHours + 10;
        int resultHours;
        if(hoursChanging >= 24){
            resultHours = hoursChanging - 24;
        }
        else{
            resultHours = inputHours + 10;
        }

        // add a 0 in front of single digit minutes when printing result
        if(resultMinutes < 10)System.out.println(resultHours + ":" + "0" + resultMinutes);    
        else System.out.println(resultHours + ":" + resultMinutes);

        scanner.close();
    }
}

//can even input clock and control execution
//Thread.sleep(1000);
// can even try to build clock
// stretch - clock show in am/pm
// just need a while loop