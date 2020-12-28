/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import MVC_Structure.model.Seat;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Acer
 */
public class SeatTest {
    Seat st;
    
    public SeatTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        st = new Seat(26);
        
        
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getSeats method, of class Seat.
     */
    @Test
    public void testGetSeats() {
        assertEquals(26, st.getSeats());

    }

    /**
     * Test of setSeats method, of class Seat.
     */
    @Test
    public void testSetSeats() {
        
        st.setSeats(40);
        assertEquals(26, st.getSeats());

    }

    /**
     * Test of isBooked method, of class Seat.
     */
    @Test
    public void testIsBooked() {
        
        assertEquals(true,st.isBooked());

    }

    /**
     * Test of setBooked method, of class Seat.
     */
    @Test
    public void testSetBooked() {
        st.setBooked(true);
        assertEquals(true,st.isBooked());

    }
    
}
