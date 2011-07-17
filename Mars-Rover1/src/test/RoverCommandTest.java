package test;

import main.RoverCommand;
import main.Rover;
import org.junit.Test;
import org.mockito.InOrder;

import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.mock;

public class RoverCommandTest {
    @Test
    public void shouldExecuteCommands(){
        Rover rover = mock(Rover.class);
        RoverCommand.execute(rover, "MRL");
        InOrder order = inOrder(rover);
        order.verify(rover).move();
        order.verify(rover).turnRight();
        order.verify(rover).turnLeft();
    }
}
