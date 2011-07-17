package main;


public class WestDirection extends Direction{
    @Override
    public Direction leftOf() {
        return new SouthDirection();
    }

    @Override
    public Direction rightOf() {
        return new NorthDirection();
    }
}
