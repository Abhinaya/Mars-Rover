package main;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MarsRover {



    public List<String> readFromFile(String inputFile) throws IOException {
        List<String> input =  new ArrayList<String>();
            File inFile = new File(inputFile);
            BufferedReader br = new BufferedReader(new InputStreamReader(
                    new FileInputStream(inFile)));
        String strLine;
        while ((strLine = br.readLine()) != null ) {
                input.add(strLine);
            }
        return input;
    }


    public static void main(String[] args) throws IOException {
        MarsRover marsRover = new MarsRover();
        List<String> input = marsRover.readFromFile("input.txt");
        String plateau=input.get(0);
        setPlateauLimits(plateau);
        RoverExecutor.executeRovers(input);
        }

    private static void setPlateauLimits(String plateau) {
        int xLimit=Integer.parseInt(String.valueOf(plateau.charAt(0)));
        int yLimit=Integer.parseInt(String.valueOf(plateau.charAt(2)));
        Plateau marsPlateau=new Plateau(xLimit,yLimit);
    }

}
