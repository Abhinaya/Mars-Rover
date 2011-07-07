package main;


public class RoverCommand {


    public static void execute(RoverPosition roverPosition, String commands) {
        for(char command:commands.toCharArray()){
            if(command=='M')
                roverPosition.move();
            else if(command=='R')
                roverPosition.turnRight();
            else if(command=='L')
                roverPosition.turnLeft();
        }
    }
}
