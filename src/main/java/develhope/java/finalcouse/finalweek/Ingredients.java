package develhope.java.finalcouse.finalweek;

public enum Ingredients {
    BUN(0.2),
    SAUCE(0.3),
    POTATO(0.4),
    OIL(.08);

    private double price;

    Ingredients(double price) {
        this.price = price;
    }

    public double getPrice() {
        return  price;
    }
}
