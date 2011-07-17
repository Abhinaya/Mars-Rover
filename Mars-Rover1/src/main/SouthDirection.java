package main;


public class SouthDirection extends Direction {
    @Override
    public Direction leftOf() {
        return new EastDirection();
    }

    @Override
    public Direction rightOf() {
        return new WestDirection();
    }
}
