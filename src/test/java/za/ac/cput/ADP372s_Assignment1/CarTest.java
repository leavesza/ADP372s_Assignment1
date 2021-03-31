package za.ac.cput.ADP372s_Assignment1;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.*;

public class CarTest {


    private Car car1 = new Car("Ford",200);
    private Car car2 = new Car("Ford",200);
    //Object equality
    @Test
    public void testGetModel() {

        assertEquals(car1.getModel(),car2.getModel());
    }

    //Object Identity
    @Test
    public void testCar(){
        Car car1;
        Car car2;
        car1 = new Car("Ford",200);
        car2 = car1;
        assertSame(car1,car2);
    }

    //Failing test
    @Test
    public void testFailGetModel() {
        assertEquals("Porche",car1.getModel());
    }


    @Timeout(10)
    @Test
    public void testUnhappyToStart(){
        assertFalse(car1.isFast());
    }


    @Disabled
    @Test
    public void testHappyAfterPlay(){
        car1.isFast();
        assertTrue(car1.isFast());
    }
}