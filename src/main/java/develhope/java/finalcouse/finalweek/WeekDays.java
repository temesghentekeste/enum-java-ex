package develhope.java.finalcouse.finalweek;

public enum WeekDays {
    MONDAY("Monday", false),
    TUESDAY("Tuesday", false),
    WEDNESDAY("Wednesday", false),
    THURSDAY("Thursday", false),
    FRIDAY("Friday", false),
    SATURDAY("Saturday", true),
    SUNDAY("Sunday", true);

    private String day;
    private boolean isWeekDay;

    WeekDays(String day, boolean isWeekDay) {
        this.day = day;
        this.isWeekDay = isWeekDay;
    }

    public void getInfo() {
        if(isWeekDay) {
            System.out.println("Weekend!");
        } else {
            System.out.println("Weekday!");
        }
    }

    @Override
    public String toString() {
        return day + " --> " + isWeekDay;
    }
}

class WeekDaysDemo {
    public static void main(String[] args) {
        WeekDays sunday = WeekDays.SUNDAY;
        sunday.getInfo();

        WeekDays friday = WeekDays.FRIDAY;
        friday.getInfo();

    }
}
