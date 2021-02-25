package turtle;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class TurtleTest {

    Turtle turtle;
    Pen turtlePen;

    @BeforeEach
    void setUp() {

        turtlePen = new Pen();
        turtle = new Turtle(turtlePen);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void turtle_hasAPen(){
        assertNotNull(turtle.getPen());
    }


    @Test
    void turtlePen_CanBeSetToDown(){
        turtle.getPen().setPenOrientation(PenOrientation.PEN_DOWN);
        System.out.println(turtle.getPen().getPenOrientation());
        assertEquals( turtle.getPen().getPenOrientation(),PenOrientation.PEN_DOWN);
    }


    @Test
    void turtlePen_canBeSetToUp(){
        turtle.getPen().setPenOrientation(PenOrientation.PEN_UP);
        assertEquals( turtle.getPen().getPenOrientation(),PenOrientation.PEN_UP);
    }


        @Test
        void turtle_canTurnRight(){
        //given that
        turtle.setCurrentDirection(CurrentDirection.EAST);
        //when
        turtle.turnRight();
        //assert
        assertEquals(CurrentDirection.SOUTH,turtle.getCurrentDirection(CurrentDirection.EAST));
        turtle.turnRight();
        assertEquals(CurrentDirection.WEST,turtle.getCurrentDirection(CurrentDirection.EAST));
        turtle.turnRight();
        assertEquals(CurrentDirection.NORTH,turtle.getCurrentDirection(CurrentDirection.EAST));
        turtle.turnRight();
        assertEquals(CurrentDirection.EAST,turtle.getCurrentDirection(CurrentDirection.EAST));
        }


    @Test
    void turtle_canTurnLeft(){
        //given that
        turtle.setCurrentDirection(CurrentDirection.EAST);
        //when
        turtle.turnLeft();
        //assert
        assertEquals(CurrentDirection.NORTH,turtle.getCurrentDirection(CurrentDirection.EAST));
        turtle.turnLeft();
        assertEquals(CurrentDirection.WEST,turtle.getCurrentDirection(CurrentDirection.EAST));
        turtle.turnLeft();
        assertEquals(CurrentDirection.SOUTH,turtle.getCurrentDirection(CurrentDirection.EAST));
        turtle.turnLeft();
        assertEquals(CurrentDirection.EAST,turtle.getCurrentDirection(CurrentDirection.EAST));
    }



    /*@Test
    void turtle_canMoeEastWard_onASketchPad_whilePenIsUp(){
        //given
        //given that
        turtle.getCurrentDirection(CurrentDirection.EAST);
        turtle.getPen().setPenOrientation(PenOrientation.PEN_UP);

        turtle.setCurrentDirection(CurrentDirection.EAST);
        SketchPad sketchPad = new SketchPad();
        turtle.move(sketchPad,5);
    }*/


    @Test
    void turtle_canMoveEastWard_onASketchPad_WhilePenIsUp(){

        turtle.setCurrentDirection(CurrentDirection.EAST);
        turtle.getPen().setPenOrientation(PenOrientation.PEN_UP);
        SketchPad sketchPad = new SketchPad(20, 20);
        turtle.setCurrentPosition(new Position(0,0));
        turtle.move(sketchPad, 5);
        assertEquals(new Position (0,4), turtle.getCurrentPosition());
        turtle.move(sketchPad, 2);
        assertEquals(new Position (0,5),
                turtle.getCurrentPosition());
    }

    @Test
    void turtle_canMoveSouthWard_onASketchPad_WhilePenIsUp(){

        turtle.setCurrentDirection(CurrentDirection.SOUTH);
        turtle.getPen().setPenOrientation(PenOrientation.PEN_UP);
        SketchPad sketchPad = new SketchPad(20, 20);
        turtle.setCurrentPosition(new Position(0,0));
        turtle.move(sketchPad, 5);
        assertEquals(new Position (4,0), turtle.getCurrentPosition());

        turtle.move(sketchPad, 2);
        assertEquals(new Position (5,0),
                turtle.getCurrentPosition());
    }

    @Test
    void turtle_canMoveWESTWard_onASketchPad_WhilePenIsUp(){

        turtle.setCurrentDirection(CurrentDirection.WEST);
        turtle.getPen().setPenOrientation(PenOrientation.PEN_UP);
        SketchPad sketchPad = new SketchPad(20, 20);
        turtle.setCurrentPosition(new Position(0,7));
        turtle.move(sketchPad, 5);
        assertEquals(new Position (0,3), turtle.getCurrentPosition());

        turtle.move(sketchPad, 2);
        assertEquals(new Position (0,2),
                turtle.getCurrentPosition());
    }

    @Test
    void turtle_canMoveNORTHWard_onASketchPad_WhilePenIsUp(){

        turtle.setCurrentDirection(CurrentDirection.NORTH);
        turtle.getPen().setPenOrientation(PenOrientation.PEN_UP);
        SketchPad sketchPad = new SketchPad(20, 20);
        turtle.setCurrentPosition(new Position(7,0));
        turtle.move(sketchPad, 5);
        assertEquals(new Position (3,0), turtle.getCurrentPosition());

        turtle.move(sketchPad, 2);
        assertEquals(new Position (2,0),
                turtle.getCurrentPosition());
    }


    @Test
    void Turtle_canWriteOnSketchPad_WhileFacingEast(){
        turtle.setCurrentDirection(CurrentDirection.WEST);
        turtle.getPen().setPenOrientation(PenOrientation.PEN_DOWN);
        SketchPad sketchPad = new SketchPad(20,20);
        turtle.setCurrentPosition(new Position(0, 0));
        int numberOfSteps = 5;
        turtle.move(sketchPad, 5);
        for (int column = 0; column < numberOfSteps; column ++){
            assertEquals(1, sketchPad.getFloor()[0][column]);
        }
        assertEquals(new Position (0,4), turtle.getCurrentPosition());
    }
}