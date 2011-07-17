package main;


public class EastDirection extends Direction {
    @Override
    public Direction leftOf() {
        return new NorthDirection();
    }

    @Override
    public Direction rightOf() {
        return new SouthDirection();
    }
}
