package develhope.java.finalcouse.finalweek;

import java.sql.SQLOutput;

public class _01_Enums {
    public static void main(String[] args) {
        basicDefinition();
        associateWithNumericValue();

    }

    private static void basicDefinition() {
        enum DayOfTheWeek {
            MONDAY,
            TUESDAY,
            WEDNESDAY,
            THURSDAY,
            FRIDAY,
            SATURDAY,
            SUNDAY
        }

        System.out.println(DayOfTheWeek.MONDAY);
    }

    private static void associateWithNumericValue() {
        enum DaysOfTheWeek {
            MONDAY(1),
            TUESDAY(2),
            WEDNESDAY(3),
            THURSDAY(4),
            FRIDAY(5),
            SUTURDAY(6),
            SUNDAY(7);

            int dayNumber;

            private DaysOfTheWeek(int dayNumber) {
                this.dayNumber = dayNumber;
                System.out.println(dayNumber);
            }

            public int getDayNumber() {
                return dayNumber;
            }
        }

        System.out.println((DaysOfTheWeek.valueOf("MONDAY")));
        System.out.println(DaysOfTheWeek.values().length);
    }
}


