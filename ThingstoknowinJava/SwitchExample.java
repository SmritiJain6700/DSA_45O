package ThingstoknowinJava;
public class SwitchExample {
    public static void main(String[] args) {
        int day = 3;
        String dayName;

        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                //no break is present so it will fall through to next case even if the condition don't match
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default: // it is optional and executes it none of the cases not match
                dayName = "Invalid day";
                break;
        }

        System.out.println("The day is " + dayName);
    }
}
