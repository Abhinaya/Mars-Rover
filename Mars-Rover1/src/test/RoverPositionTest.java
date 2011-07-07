package test;


import main.RoverPosition;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class RoverPositionTest {
    @Test
    public void shouldParseInput(){
        RoverPosition roverPosition= RoverPosition.parse("2 1 N");
        assertThat(roverPosition.getX(),is(2));
        assertThat(roverPosition.getY(), is(1));
        assertThat(roverPosition.getDirection(),is("N"));
    }
}
