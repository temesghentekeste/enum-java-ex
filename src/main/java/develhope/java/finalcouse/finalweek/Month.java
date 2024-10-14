package develhope.java.finalcouse.finalweek;

public enum Month {
    JANUARY("January", true),
    FEBRUARY("February", true),
    MARCH("March", false),
    APRIL("April", false),
    MAY("April", false),
    JUNE("June", false),
    JULY("July", true),
    AUGUST("August", false),
    SEPTEMBER("September", false),
    OCTOBER("October", false),
    NOVEMBER("November", false),
    DECEMBER("December", false);

    private String name;
    private boolean endsInY;

    Month(String name, boolean endsInY) {
        this.name = name;
        this.endsInY = endsInY;
    }

    public String info() {
        if(endsInY) {
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
