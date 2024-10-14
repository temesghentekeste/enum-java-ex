package develhope.java.finalcouse.finalweek;

public enum UserType {
    ADMIN(1),
    USER(1);

    private int type;

    UserType(int type) {
        this.type = type;
    }

    public int getUserTypeInt() {
        return type;
    }
}
