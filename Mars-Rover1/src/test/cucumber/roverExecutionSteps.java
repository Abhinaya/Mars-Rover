package test.cucumber;


import cuke4duke.annotation.I18n.EN.*;
import main.Rover;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;


public class roverExecutionSteps {

    @Given("^The Initial position is ([^\"]*) ")
    public void roverIsAtInitialPosition(String initialPosition){
        Rover rover =new Rover(initialPosition);
        assertEquals(rover.toString(),initialPosition);
      }
    @When ("^The Command is ([^\"]*) ")
    public void  commandIsRetrieved(String command){

    }
     @Given ("^The Final position is ([^\"]*) ")
    public void roverIsAtFinalPosition(String finalPosition){

        Rover rover =new Rover(finalPosition);
        assertEquals(rover.toString(),finalPosition);
      }
}
