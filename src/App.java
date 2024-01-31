import java.util.Scanner;

// userInputTime[0] is the user inputted hour
// userInputTime[1] is the user inputted minutes
// resultTime[0] is the result hours
// resultTime[1] is the result minutes

public class App {
    public static void main(String[] args) throws Exception {        
        UserInput userInput = new UserInput();
        
        int[] userInputTime = userInput.getUserInput(); //gets user input time and time zone change request
        int[] resultTime = null;

        if(userInputTime[2] == 1){
            ESTtoIST esTtoIST = new ESTtoIST();
            resultTime = esTtoIST.calcTime(userInputTime);
            // call method for convert from EST to IST
        }
        if(userInputTime[2] == 2){
            // call method for convert from IST to EST
            ISTtoEST isTtoEST = new ISTtoEST();
            resultTime = isTtoEST.calcTime(userInputTime);
        }
        
        // System.out.println(String.valueOf(userInputTime[0]) + ":" + String.valueOf(userInputTime[1])); //test for object presence

        // add a 0 in front of single digit minutes when printing result
        System.out.println("The resulting time change is:");
        if(resultTime[1] < 10)System.out.print(resultTime[0] + ":" + "0" + resultTime[1]);    
        else System.out.println(resultTime[0] + ":" + resultTime[1]);

        System.exit(0);
    }
}

