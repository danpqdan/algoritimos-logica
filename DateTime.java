//https://www.hackerrank.com/challenges/java-date-and-time/problem?isFullScreen=true

import java.util.Calendar;

public class DateTime {
    
    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
        if(year>2000 && year<3000){
            Calendar calendar = Calendar.getInstance();
            calendar.set(year, month-1, day);
            String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
            int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
            return daysOfWeek[dayOfWeek-1].toUpperCase(); 
        }
        else{    
            return "";
        }    
    }

}
