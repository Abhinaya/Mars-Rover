package main;

public class NorthDirection extends Direction {


    @Override
    public Direction leftOf() {
        return new WestDirection();
    }

    @Override
    public Direction rightOf() {
        return new EastDirection();
    }
}
