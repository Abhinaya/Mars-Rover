package test;


import main.Plateau;
import main.Rover;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class RoverTest{
    Plateau plateau=Plateau.getInstance(5,5);
    @Test
    public void shouldMoveWhenFacingNorth(){
        Rover rover = new Rover("1 2 N");
        rover.move();
        Rover dummyRover = new Rover("1 3 N");
        rover.equals(dummyRover);
    }

    @Test
    public void shouldMoveWhenFacingEast() {
        Rover rover = new Rover("1 2 E");
        rover.move();
        Rover dummyRover = new Rover("2 2 E");
        rover.equals(dummyRover);
    }

    @Test
    public void shouldMoveWhenFacingSouth() {
        Rover rover = new Rover("1 2 S");
        rover.move();
        Rover dummyRover = new Rover("1 1 S");
        rover.equals(dummyRover);
    }

    @Test
    public void shouldMoveWhenFacingWest() {
        Rover rover = new Rover("1 2 W");
        rover.move();
        Rover dummyRover = new Rover("0 2 W");
        rover.equals(dummyRover);
    }

    @Test
    public void shouldTurnRightWhenFacingNorth() {
        Rover rover = new Rover("1 2 N");
        rover.turnRight();
        Rover dummyRover = new Rover("1 2 E");
        rover.equals(dummyRover);
    }

    @Test
    public void shouldTurnRightWhenFacingEast() {
        Rover rover = new Rover("1 2 E");
        rover.turnRight();
        Rover dummyRover = new Rover("1 2 S");
        rover.equals(dummyRover);
    }

    @Test
    public void shouldTurnRightWhenFacingSouth() {
        Rover rover = new Rover("1 2 S");
        rover.turnRight();
        Rover dummyRover = new Rover("1 2 W");
        rover.equals(dummyRover);
    }

    @Test
    public void shouldTurnRightWhenFacingWest() {
        Rover rover = new Rover("1 2 W");
        rover.turnRight();
        Rover dummyRover = new Rover("1 2 N");
        rover.equals(dummyRover);
    }

    @Test
    public void shouldTurnLeftWhenFacingNorth() {
        Rover rover = new Rover("1 2 N");
        rover.turnLeft();
        Rover dummyRover = new Rover("1 2 W");
        rover.equals(dummyRover);
    }

    @Test
    public void shouldTurnLeftWhenFacingEast() {
        Rover rover = new Rover("1 2 E");
        rover.turnLeft();
        Rover dummyRover = new Rover("1 2 N");
        rover.equals(dummyRover);
    }

    @Test
    public void shouldTurnLeftWhenFacingSouth() {
        Rover rover = new Rover("1 2 S");
        rover.turnLeft();
        Rover dummyRover = new Rover("1 2 E");
        rover.equals(dummyRover);
    }

    @Test
    public void shouldTurnLeftWhenFacingWest() {
        Rover rover = new Rover("1 2 W");
        rover.turnLeft();
        Rover dummyRover = new Rover("1 2 S");
        rover.equals(dummyRover);
    }

    @Test
    public void shouldConvertToString() {
        Rover rover = new Rover("3 4 S");
        assertThat(rover.toString(), is("3 4 S"));
    }

//    @Test
//    public void shouldThrowExceptionWhenROverMovesOutofBounds(){
//        Rover rover=new Rover("5 5 N");
//        rover.move();
//        assertThat(Plateau.checkYLimit(6),is(false));
//    }
}
