/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import MVC_Structure.model.ViewBookings;
import java.sql.Time;
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
public class ViewBookingsTest {
    ViewBookings vb;
    public ViewBookingsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        vb= new ViewBookings("Tasnim","01766424191","Dhaka","Cox","Ena","2020-12-02",2,"2000");
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getName method, of class ViewBookings.
     */
    @Test
    public void testGetName() {
       assertEquals("Tasnim",vb.getName());
    }

    /**
     * Test of setName method, of class ViewBookings.
     */
    @Test
    public void testSetName() {

    }

    /**
     * Test of getPhone method, of class ViewBookings.
     */
    @Test
    public void testGetPhone() {
        assertEquals("01766424191",vb.getPhone());

    }

    /**
     * Test of setPhone method, of class ViewBookings.
     */
    @Test
    public void testSetPhone() {

    }

    /**
     * Test of getSource method, of class ViewBookings.
     */
    @Test
    public void testGetSource() {
        assertEquals("Dhaka",vb.getSource());
    
    }

    /**
     * Test of setSource method, of class ViewBookings.
     */
    @Test
    public void testSetSource() {
        
    }

    /**
     * Test of getDestination method, of class ViewBookings.
     */
    @Test
    public void testGetDestination() {
        assertEquals("Cox",vb.getDestination());
        
    }

    /**
     * Test of setDestination method, of class ViewBookings.
     */
    @Test
    public void testSetDestination() {
        
    }

    /**
     * Test of getService method, of class ViewBookings.
     */
    @Test
    public void testGetService() {
        assertEquals("Ena",vb.getService());
    }

    /**
     * Test of setService method, of class ViewBookings.
     */
    @Test
    public void testSetService() {
        
    }

    /**
     * Test of getDate method, of class ViewBookings.
     */
    @Test
    public void testGetDate() {
        assertEquals("2020-12-02",vb.getDate());
        
    }

    /**
     * Test of setDate method, of class ViewBookings.
     */
    @Test
    public void testSetDate() {
       
    }

    /**
     * Test of getSeats method, of class ViewBookings.
     */
    @Test
    public void testGetSeats() {
      //assertEquals(2,vb.getSeats());  
    }

    /**
     * Test of setSeats method, of class ViewBookings.
     */
    @Test
    public void testSetSeats() {
        
    }

    /**
     * Test of getAmount method, of class ViewBookings.
     */
    @Test
    public void testGetAmount() {
       assertEquals("2000",vb.getAmount()); 
    }

    /**
     * Test of setAmount method, of class ViewBookings.
     */
    @Test
    public void testSetAmount() {
        
    }
    
}
