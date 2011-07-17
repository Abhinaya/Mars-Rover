package main;


public class RoverCommand {


    public static void execute(Rover rover, String commands) {
        for(char command:commands.toCharArray()){
            if(command=='M')
            {
               rover.move();

            }
            else if(command=='R')
            {
               rover.turnRight();
            }
            else if(command=='L')
               rover.turnLeft();
            else throw new IllegalArgumentException("Invalid Command");
        }
    }
}
