package main;


public abstract class Direction {
    public abstract void move(RoverPosition roverPosition);
    public abstract void turnLeft(RoverPosition roverPosition);
    public abstract void turnRight(RoverPosition roverPosition);

    public static Direction convertCharacterToDirection(char direction)
    {
        switch (direction){
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

    public static char convertDirectionToCharecter(Direction direction)
    {
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

