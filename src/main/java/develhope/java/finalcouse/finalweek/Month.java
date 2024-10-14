package develhope.java.finalcouse.finalweek;

public enum Month {
    JANUARY("January"),
    FEBRUARY("February"),
    MARCH("March" ),
    APRIL("April"),
    MAY("April"),
    JUNE("June"),
    JULY("July"),
    AUGUST("August"),
    SEPTEMBER("September"),
    OCTOBER("October"),
    NOVEMBER("November"),
    DECEMBER("December");

    private String name;

    Month(String name) {
        this.name = name;
    }

    public String info() {
        if(name.endsWith("y")) {
            return "ends with y";
        }
        return "doesn't end with y";
    }

    @Override
    public String toString() {
        return name + " " + info();
    }
}

class MonthDemo {
    public static void main(String[] args) {
        for (Month value : Month.values()) {
            System.out.println(value);
        }
    }
}
