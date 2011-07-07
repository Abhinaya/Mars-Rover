package test;

import main.RoverCommand;
import main.RoverPosition;
import org.junit.Test;
import org.mockito.InOrder;

import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.mock;

public class RoverCommandTest {
    @Test
    public void shouldExecuteCommands(){
        RoverPosition roverPosition = mock(RoverPosition.class);
        RoverCommand.execute(roverPosition, "MRL");
        InOrder order = inOrder(roverPosition);
        order.verify(roverPosition).move();
        order.verify(roverPosition).turnRight();
        order.verify(roverPosition).turnLeft();
    }
}
