package test;


import main.RoverPosition;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;

public class RoverPositionTest {
    @Test
    public void shouldParseInput(){
        RoverPosition roverPosition= new RoverPosition("2 1 N");
        assertThat(roverPosition.getX(),is(2));
        assertThat(roverPosition.getY(), is(1));
        assertThat(roverPosition.getDirection(),is('N'));
    }

    @Test
    public void shouldMoveWhenFacingNorth(){
        RoverPosition roverPosition=new RoverPosition("1 2 N");
        roverPosition.move();
        assertThat(roverPosition.getDirection(), is('N'));
        assertThat(roverPosition.getX(), is(1));
        assertThat(roverPosition.getY(), is(3));
        }

    @Test
    public void shouldMoveWhenFacingEast(){
        RoverPosition roverPosition=new RoverPosition("1 2 E");
        roverPosition.move();
        assertThat(roverPosition.getDirection(),is('E'));
        assertThat(roverPosition.getX(),is(2));
        assertThat(roverPosition.getY(),is(2));
    }
    @Test
    public void shouldMoveWhenFacingSouth(){
        RoverPosition roverPosition=new RoverPosition("1 2 S");
        roverPosition.move();
        assertThat(roverPosition.getDirection(),is('S'));
        assertThat(roverPosition.getX(),is(1));
        assertThat(roverPosition.getY(),is(1));
    }
    @Test
    public void shouldMoveWhenFacingWest(){
        RoverPosition roverPosition=new RoverPosition("1 2 W");
        roverPosition.move();
        assertThat(roverPosition.getDirection(),is('W'));
        assertThat(roverPosition.getX(),is(0));
        assertThat(roverPosition.getY(),is(2));
    }
    @Test
    public void shouldTurnRightWhenFacingNorth(){
        RoverPosition roverPosition=new RoverPosition("1 2 N");
        roverPosition.turnRight();
        assertThat(roverPosition.getDirection(),is('E'));
        assertThat(roverPosition.getX(),is(1));
        assertThat(roverPosition.getY(),is(2));
    }
     @Test
    public void shouldTurnRightWhenFacingEast(){
        RoverPosition roverPosition=new RoverPosition("1 2 E");
        roverPosition.turnRight();
        assertThat(roverPosition.getDirection(),is('S'));
        assertThat(roverPosition.getX(),is(1));
        assertThat(roverPosition.getY(),is(2));
    }
     @Test
    public void shouldTurnRightWhenFacingSouth(){
        RoverPosition roverPosition=new RoverPosition("1 2 S");
        roverPosition.turnRight();
        assertThat(roverPosition.getDirection(),is('W'));
        assertThat(roverPosition.getX(),is(1));
        assertThat(roverPosition.getY(),is(2));
    }
     @Test
    public void shouldTurnRightWhenFacingWest(){
        RoverPosition roverPosition=new RoverPosition("1 2 W");
        roverPosition.turnRight();
        assertThat(roverPosition.getDirection(),is('N'));
        assertThat(roverPosition.getX(),is(1));
        assertThat(roverPosition.getY(),is(2));
    }
     @Test
    public void shouldTurnLeftWhenFacingNorth(){
        RoverPosition roverPosition=new RoverPosition("1 2 N");
        roverPosition.turnLeft();
        assertThat(roverPosition.getDirection(),is('W'));
        assertThat(roverPosition.getX(),is(1));
        assertThat(roverPosition.getY(),is(2));
    }
    @Test
    public void shouldTurnLeftWhenFacingEast(){
        RoverPosition roverPosition=new RoverPosition("1 2 E");
        roverPosition.turnLeft();
        assertThat(roverPosition.getDirection(),is('N'));
        assertThat(roverPosition.getX(),is(1));
        assertThat(roverPosition.getY(),is(2));
    }
    @Test
    public void shouldTurnLeftWhenFacingSouth(){
        RoverPosition roverPosition=new RoverPosition("1 2 S");
        roverPosition.turnLeft();
        assertThat(roverPosition.getDirection(),is('E'));
        assertThat(roverPosition.getX(),is(1));
        assertThat(roverPosition.getY(),is(2));
    }
    @Test
    public void shouldTurnLeftWhenFacingWest(){
        RoverPosition roverPosition=new RoverPosition("1 2 W");
        roverPosition.turnLeft();
        assertThat(roverPosition.getDirection(),is('S'));
        assertThat(roverPosition.getX(),is(1));
        assertThat(roverPosition.getY(),is(2));
    }

    @Test
    public void shouldConvertToString(){
        RoverPosition position = new RoverPosition("3 4 S");
        assertThat(position.toString(), is("3 4 S"));
    }
}
