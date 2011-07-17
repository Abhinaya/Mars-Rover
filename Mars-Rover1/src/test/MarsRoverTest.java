package test;


import main.MarsRover;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MarsRoverTest {

    @Test
    public void shouldReadInputFromFile() throws IOException {
        MarsRover marsRover=new MarsRover();
        List testString = marsRover.readFromFile("input.txt");
        assertThat((String) testString.get(0),is("5 5"));
    }
}
