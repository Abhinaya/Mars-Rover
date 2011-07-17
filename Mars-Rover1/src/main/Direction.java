package main;


public abstract class Direction {
    public static final char NORTH = 'N';
    public static final char WEST = 'W';
    public static final char SOUTH = 'S';
    public static final char EAST = 'E';

    public static Direction convertCharacterToDirection(char direction) {
        switch (direction) {
            case 'N':
                return new NorthDirection();
            case 'W':
                return new WestDirection();
            case 'S':
                return new SouthDirection();
            case 'E':
                return new EastDirection();
            default:
                return null;
        }
    }

    public abstract Direction leftOf();

    public abstract Direction rightOf();

    public static char convertDirectionToCharacter(Direction direction) {
        if (direction instanceof NorthDirection)
            return 'N';
        if (direction instanceof SouthDirection)
            return 'S';
        if (direction instanceof WestDirection)
            return 'W';
        if (direction instanceof EastDirection)
            return 'E';
        return ' ';
    }

}

