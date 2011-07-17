package main;

import java.util.ArrayList;
import java.util.List;

public class RoverExecutor {
    public static List<Rover> executeRovers(List<String> input){
        int i = 1;
        List<Rover> roverList = new ArrayList<Rover>();
        while (i < input.size()) {
            String position = input.get(i);
            String command = input.get(i + 1);
            Rover rover = new Rover(position);
            RoverCommand.execute(rover, command);
            roverList.add(rover);
            System.out.println(rover.toString());
            i += 2;
        }
        return roverList;
    }
}