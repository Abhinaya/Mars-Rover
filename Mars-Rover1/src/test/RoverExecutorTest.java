package test;

import main.RoverCommand;
import main.RoverExecutor;
import main.RoverPosition;
import org.junit.Test;
import org.mockito.InOrder;
import org.mockito.Mock;

import javax.print.attribute.TextSyntax;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;

public class RoverExecutorTest {
    @Test
    public void shouldExecuteRoverCommands(){
        RoverPosition roverPosition= mock(RoverPosition.class);
        RoverCommand roverCommand= mock(RoverCommand.class);
        List<String> inputList = new ArrayList<String>();
        inputList.add("1 2 N");
        inputList.add("MLMLM");
        inputList.add("1 3 E");
        inputList.add("MLM");
        inputList.add("1 4 W");
        inputList.add("RRM");

        List<RoverPosition> roverPositionList = RoverExecutor.executeRovers(inputList);
        assertThat(roverPositionList.get(0).toString(),is("0 2 S"));
        assertThat(roverPositionList.get(1).toString(),is("2 4 N"));
        assertThat(roverPositionList.get(2).toString(),is("2 4 E"));

    }
}
