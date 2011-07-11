package test;


import main.RoverPosition;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;

public class RoverPositionTest {
    @Test
    public void shouldParseInput(){
        RoverPosition roverPosition= RoverPosition.parse("2 1 N");
        assertThat(roverPosition.getX(),is(2));
        assertThat(roverPosition.getY(), is(1));
        assertThat(roverPosition.getDirection(),is('N'));
    }

    @Test
    public void shouldMoveWhenFacingNorth(){
        RoverPosition roverPosition=RoverPosition.parse("1 2 N");
        roverPosition.move();
        assertThat(roverPosition.getDirection(), is('N'));
        assertThat(roverPosition.getX(), is(1));
        assertThat(roverPosition.getY(), is(3));
        }

    @Test
    public void shouldMoveWhenFacingEast(){
        RoverPosition roverPosition=RoverPosition.parse("1 2 E");
        roverPosition.move();
        assertThat(roverPosition.getDirection(),is('E'));
        assertThat(roverPosition.getX(),is(2));
        assertThat(roverPosition.getY(),is(2));
    }
    @Test
    public void shouldMoveWhenFacingSouth(){
        RoverPosition roverPosition=RoverPosition.parse("1 2 S");
        roverPosition.move();
        assertThat(roverPosition.getDirection(),is('S'));
        assertThat(roverPosition.getX(),is(1));
        assertThat(roverPosition.getY(),is(1));
    }
    @Test
    public void shouldMoveWhenFacingWest(){
        RoverPosition roverPosition=RoverPosition.parse("1 2 W");
        roverPosition.move();
        assertThat(roverPosition.getDirection(),is('W'));
        assertThat(roverPosition.getX(),is(0));
        assertThat(roverPosition.getY(),is(2));
    }
    @Test
    public void shouldTurnRightWhenFacingNorth(){
        RoverPosition roverPosition=RoverPosition.parse("1 2 N");
        roverPosition.turnRight();
        assertThat(roverPosition.getDirection(),is('E'));
        assertThat(roverPosition.getX(),is(1));
        assertThat(roverPosition.getY(),is(2));
    }
     @Test
    public void shouldTurnRightWhenFacingEast(){
        RoverPosition roverPosition=RoverPosition.parse("1 2 E");
        roverPosition.turnRight();
        assertThat(roverPosition.getDirection(),is('S'));
        assertThat(roverPosition.getX(),is(1));
        assertThat(roverPosition.getY(),is(2));
    }
     @Test
    public void shouldTurnRightWhenFacingSouth(){
        RoverPosition roverPosition=RoverPosition.parse("1 2 S");
        roverPosition.turnRight();
        assertThat(roverPosition.getDirection(),is('W'));
        assertThat(roverPosition.getX(),is(1));
        assertThat(roverPosition.getY(),is(2));
    }
     @Test
    public void shouldTurnRightWhenFacingWest(){
        RoverPosition roverPosition=RoverPosition.parse("1 2 W");
        roverPosition.turnRight();
        assertThat(roverPosition.getDirection(),is('N'));
        assertThat(roverPosition.getX(),is(1));
        assertThat(roverPosition.getY(),is(2));
    }
     @Test
    public void shouldTurnLeftWhenFacingNorth(){
        RoverPosition roverPosition=RoverPosition.parse("1 2 N");
        roverPosition.turnLeft();
        assertThat(roverPosition.getDirection(),is('W'));
        assertThat(roverPosition.getX(),is(1));
        assertThat(roverPosition.getY(),is(2));
    }
    @Test
    public void shouldTurnLeftWhenFacingEast(){
        RoverPosition roverPosition=RoverPosition.parse("1 2 E");
        roverPosition.turnLeft();
        assertThat(roverPosition.getDirection(),is('N'));
        assertThat(roverPosition.getX(),is(1));
        assertThat(roverPosition.getY(),is(2));
    }
    @Test
    public void shouldTurnLeftWhenFacingSouth(){
        RoverPosition roverPosition=RoverPosition.parse("1 2 S");
        roverPosition.turnLeft();
        assertThat(roverPosition.getDirection(),is('E'));
        assertThat(roverPosition.getX(),is(1));
        assertThat(roverPosition.getY(),is(2));
    }
    @Test
    public void shouldTurnLeftWhenFacingWest(){
        RoverPosition roverPosition=RoverPosition.parse("1 2 W");
        roverPosition.turnLeft();
        assertThat(roverPosition.getDirection(),is('S'));
        assertThat(roverPosition.getX(),is(1));
        assertThat(roverPosition.getY(),is(2));
    }
}
