package test.cucumber;


import cuke4duke.annotation.I18n.EN.*;
import main.RoverCommand;
import main.RoverPosition;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;


public class roverExecutionSteps {

    @Given("^The Initial position is ([^\"]*) ")
    public void roverIsAtInitialPosition(String initialPosition){
        RoverPosition roverPosition=new RoverPosition(initialPosition);
        assertEquals(roverPosition.toString(),initialPosition);
      }
    @When ("^The Command is ([^\"]*) ")
    public void  commandIsRetrieved(String command){

    }
     @Given ("^The Final position is ([^\"]*) ")
    public void roverIsAtFinalPosition(String finalPosition){

        RoverPosition roverPosition=new RoverPosition(finalPosition);
        assertEquals(roverPosition.toString(),finalPosition);
      }
}
