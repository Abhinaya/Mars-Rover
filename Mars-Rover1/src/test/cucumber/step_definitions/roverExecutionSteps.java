package test.cucumber.step_definitions;


import cuke4duke.annotation.I18n.EN.*;
import main.Plateau;
import main.Rover;
import main.RoverCommand;
import main.RoverExecutor;
import org.mockito.Mock;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.mockito.Matchers.isNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.MockitoAnnotations.initMocks;


public class roverExecutionSteps {
    Plateau plateau=Plateau.getInstance(5,5);
    @Mock
    Rover rover;

    @Given("^The Initial position is \"([^\"]*)\"$")
    public void roverIsAtInitialPosition(String initialPosition) {
        Rover rover =new Rover(initialPosition);
        assertEquals(rover.toString(),initialPosition);

    }

    @When("^The Command \"([^\"]*)\" is executed$")
    public void  commandIsExecuted(String command){
        initMocks(this);
        RoverCommand.execute(rover,command);
    }

    @Then("^The Final position is \"([^\"]*)\"$")
    public void roverIsAtFinalPosition(String finalPosition){
        Rover rover =new Rover(finalPosition);
        assertEquals(rover.toString(),finalPosition);
      }
    @Then("^exception is thrown for position \"([^\"]*)\"$")
    public void exceptionIsThrown(String finalPosition) {
        assertThat(Plateau.checkXLimit(finalPosition.charAt(0))&&Plateau.checkYLimit(finalPosition.charAt(2)), is(false));
    }
}
