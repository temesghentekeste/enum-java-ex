package develhope.java.finalcouse.finalweek;

import java.sql.SQLOutput;
import java.time.Month;

public enum Seasons {
    WINTER("Winter", Month.DECEMBER, Month.FEBRUARY),
    SPRING("Spring", Month.MARCH, Month.MAY),
    SUMMER("Summer", Month.JUNE, Month.AUGUST),
    AUTUMN("Autumn", Month.SEPTEMBER, Month.NOVEMBER);

    private String season;
    private Month startMonth;
    private Month endMonth;

    Seasons(String season, Month startMonth, Month endMonth) {
        this.season = season;
        this.startMonth =startMonth;
        this.endMonth = endMonth;
    }


    public String getDateRange() {
        return season + " --> " + startMonth + " - " + endMonth;
    }

    @Override
    public String toString() {
        return getDateRange();
    }
};

class MainSeasons {
    public static void main(String[] args) {
        for (Seasons value : Seasons.values()) {
            System.out.println(value);;
        }
    }
}
