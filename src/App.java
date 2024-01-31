// userInputTime[0] is the user inputted hour
// userInputTime[1] is the user inputted minutes
// userInputTime[2] is the user's pick for timezone change

// resultTime[0] is the result hours
// resultTime[1] is the result minutes

// timeResultString[0] is the result hours resultTime[0]
// timeResultString[1] is the result minutes resultTime[1]
// timeResultString[2] is the user inputted hours userInputTime[0]
// timeResultString[3] is the user inputted minutes userInputTime[1]

public class App {
    public static void main(String[] args) throws Exception {
        UserInput userInput = new UserInput();

        int[] userInputTime = userInput.getUserInput(); // gets user input time and time zone change request 
        int[] resultTime = null;

        // Call methods depending on user desired time zone change 1 or 2

        // call method for convert from EST to IST
        if (userInputTime[2] == 1) {
            ESTtoIST esTtoIST = new ESTtoIST();
            resultTime = esTtoIST.calcTime(userInputTime);
        }
        // call method for convert from IST to EST
        if (userInputTime[2] == 2) {
            ISTtoEST isTtoEST = new ISTtoEST();
            resultTime = isTtoEST.calcTime(userInputTime);
        }

        String[] timeResultString = new String[4];
        
        // string formatting for the result times
        if (resultTime[0] < 10) {
            timeResultString[0] = ("0" + String.valueOf(resultTime[0]));
        }
        else timeResultString[0] = String.valueOf(resultTime[0]);
        
        if (resultTime[1] < 10) {
            timeResultString[1] = ("0" + String.valueOf(resultTime[1]));
        }
        else timeResultString[1] = String.valueOf(resultTime[1]);

        
        
        
        //string formatting for user inputted times
        if (userInputTime[0] < 10) { // adds 0 in front of single digit hours
            timeResultString[2] = ("0" + String.valueOf(userInputTime[0]));
        }
        else timeResultString[2] = String.valueOf(userInputTime[0]); //store user inputted hours in result string array

        if (userInputTime[1] < 10) {
            timeResultString[3] = ("0" + String.valueOf(userInputTime[1]));
        }
        else timeResultString[3] = String.valueOf(userInputTime[1]); //store user inputted minutes in result string array
        

        switch(userInputTime[2]){
            case 1:
                System.out.println("The time converted from " + timeResultString[2] + ":" + timeResultString[3] + " EST is " + timeResultString[0] + ":" + timeResultString[1] + " IST"); break;
            case 2:
                System.out.println("The time converted from " + timeResultString[2] + ":" + timeResultString[3] + " IST is " + timeResultString[0] + ":" + timeResultString[1] + " EST"); break;
            }
        
        System.exit(0);
    }
}
