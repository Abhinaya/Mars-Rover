package main;

public class RoverPosition {

    private int x;
    private int y;
    private char direction;

   public RoverPosition(String input){
        String[] position= input.split(" ");
        x= Integer.parseInt(position[0]);
        y= Integer.parseInt(position[1]);
        direction=position[2].charAt(0);
    }

    public boolean move() {
       switch (direction){
           case Direction.NORTH:
               if(Plateau.checkYLimit(y+1))
               {
                   y+=1;
                   return true;
               }
               else
               return false;

           case Direction.WEST:
               if(Plateau.checkXLimit(x - 1))
               {
                   x-=1;
                   return true;
               }
               else
               return false;

           case Direction.SOUTH:
               if(Plateau.checkXLimit(y-1))
               {
                   y-=1;
                   return true;
               }
               else
               return false;
           case Direction.EAST:
               if(Plateau.checkYLimit(x+1))
               {
                   x+=1;
                   return true;
               }
               else
               return false;
       }


        return false;
    }

    public void turnRight() {
        switch (direction){
            case Direction.NORTH:
                direction=Direction.EAST;
                break;
            case Direction.EAST:
                direction=Direction.SOUTH;
                break;
            case Direction.SOUTH:
                direction=Direction.WEST;
                break;
            case Direction.WEST:
                direction=Direction.NORTH;
                break;
        }

    }

    public void turnLeft() {
        switch (direction){
            case Direction.NORTH:
                direction=Direction.WEST;
                break;
            case Direction.EAST:
                direction=Direction.NORTH;
                break;
            case Direction.SOUTH:
                direction=Direction.EAST;
                break;
            case Direction.WEST:
                direction=Direction.SOUTH;
                break;
        }
    }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        @Override
        public String toString() {
            return x+" "+y+" "+direction;
        }

        public char getDirection() {
            return direction;
    }
}