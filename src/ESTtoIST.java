public class ESTtoIST  extends Timezones{
    int timeHoursDifference = 10;
    int timeMinutesDifference = 30;

    public int[] calcTime(int[] userInputTime){
        // minutes logic... when minutes > 60, increase hours by +1 and minutes - 60
        int minutesChanging = userInputTime[1] + timeMinutesDifference;
        int resultMinutes;
        if(minutesChanging >= 60){
            resultMinutes = minutesChanging - 60;
            userInputTime[0] = userInputTime[0] + 1;
        }
        else resultMinutes = minutesChanging;

        // hours logic
        int hoursChanging = userInputTime[0] + timeHoursDifference;
        int resultHours;
        if(hoursChanging >= 24){
            resultHours = hoursChanging - 24;
        }
        else{
            resultHours = userInputTime[0] + timeHoursDifference;
        }

        int[] resultTime = {resultHours, resultMinutes};
        return resultTime;
        
    }

}
