package main;

public class Rover {

    private int x;
    private int y;
    private Direction direction;

    public Rover(String input) {
        String[] position = input.split(" ");
        x = Integer.parseInt(position[0]);
        y = Integer.parseInt(position[1]);
        direction = Direction.convertCharacterToDirection(position[2].charAt(0));
    }

    public void move() {

        if (direction instanceof NorthDirection)
            y += 1;
        else if (direction instanceof WestDirection)
            x -= 1;
        else if (direction instanceof SouthDirection)
            y -= 1;
        else if (direction instanceof EastDirection)
            x += 1;
    }

    public void turnRight() {
        direction = direction.rightOf();
    }

    public void turnLeft() {
        direction = direction.leftOf();
    }


    @Override
    public String toString() {
        return x + " " + y + " " + Direction.convertDirectionToCharacter(direction);
    }


}