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
}
