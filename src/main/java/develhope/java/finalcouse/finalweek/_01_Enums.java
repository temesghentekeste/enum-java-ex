package develhope.java.finalcouse.finalweek;

import java.sql.SQLOutput;
import java.time.DayOfWeek;
import java.time.MonthDay;

public class _01_Enums {
    public static void main(String[] args) {
        basicDefinition();
        basicDefinitionWithSwitch(DayOfWeek.FRIDAY);
        associateWithNumericValue();

        Ingredients choice = Ingredients.BUN;

        System.out.println(choice.getPrice());

        UserType admin = UserType.ADMIN;

        System.out.println(admin.getUserTypeInt());

    }

    private static void basicDefinitionWithSwitch(DayOfWeek day) {
        enum DayOfTheWeek {
            MONDAY,
            TUESDAY,
            WEDNESDAY,
            THURSDAY,
            FRIDAY,
            SATURDAY,
            SUNDAY
        }

        switch (day) {
            case MONDAY:
                System.out.println("Lunedi");
                break;
            case TUESDAY:
                System.out.println("Martedi");
                break;
            case WEDNESDAY:
                System.out.println("Mercoledi");
                break;
            case THURSDAY:
                System.out.println("Giovedi");
                break;
            case FRIDAY:
                System.out.println("Venerdi");
                break;
            case SATURDAY:
                System.out.println("Sabato");
                break;
            case SUNDAY:
                System.out.println("Domenica");
                break;
            default:
                System.out.println("Invalid day!");

        }

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


