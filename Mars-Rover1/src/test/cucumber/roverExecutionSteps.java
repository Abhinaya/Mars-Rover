package test.cucumber;


import cuke4duke.annotation.I18n.EN.*;
import main.Rover;
import main.RoverCommand;
import main.RoverExecutor;
import org.mockito.Mock;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;


public class roverExecutionSteps {

    @Mock
    Rover rover;
    @Given("^The Initial position is ([^\"]*) ")
    public void roverIsAtInitialPosition(String initialPosition){
        Rover rover =new Rover(initialPosition);
        assertEquals(rover.toString(),initialPosition);
      }

    @When ("^The Command ([^\"]*) is executed ")
    public void  commandIsExecuted(String command){
        RoverCommand.execute(rover,command);
    }

    @Then ("^The Final position is ([^\"]*) ")
    public void roverIsAtFinalPosition(String finalPosition){
        Rover rover =new Rover(finalPosition);
        assertEquals(rover.toString(),finalPosition);
      }
    @Then("^Exception is thrown")
    public void shouldThrowException(){

    }
}
