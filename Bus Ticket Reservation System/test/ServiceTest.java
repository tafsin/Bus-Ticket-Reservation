/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import MVC_Structure.model.Service;
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
public class ServiceTest {
     Service svt;
    public ServiceTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        svt = new Service("Ena","Dhaka","Cox",1000,Time.valueOf("12:00:00"),Time.valueOf("06:00:00"),26,"2020-12-02");
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getService method, of class Service.
     */
    @Test
    public void testGetService() {
      assertEquals("Ena",svt.getService());
    }

    /**
     * Test of setService method, of class Service.
     */
    @Test
    public void testSetService() {

    }

    /**
     * Test of getSource method, of class Service.
     */
    @Test
    public void testGetSource() {
      assertEquals("Dhaka",svt.getSource());
    }

    /**
     * Test of setSource method, of class Service.
     */
    @Test
    public void testSetSource() {

    }

    /**
     * Test of getDestination method, of class Service.
     */
    @Test
    public void testGetDestination() {
       assertEquals("Cox",svt.getDestination());
    }

    /**
     * Test of setDestination method, of class Service.
     */
    @Test
    public void testSetDestination() {

    }

    /**
     * Test of getFare method, of class Service.
     */
    @Test
    public void testGetFare() {

    }

    /**
     * Test of setFare method, of class Service.
     */
    @Test
    public void testSetFare() {

    }

    /**
     * Test of getDtime method, of class Service.
     */
    @Test
    public void testGetDtime() {
        assertEquals(Time.valueOf("12:00:00"),svt.getDtime());
    }

    /**
     * Test of setDtime method, of class Service.
     */
    @Test
    public void testSetDtime() {

    }

    /**
     * Test of getAtime method, of class Service.
     */
    @Test
    public void testGetAtime() {
       assertEquals(Time.valueOf("06:00:00"),svt.getAtime());
    }

    /**
     * Test of setAtime method, of class Service.
     */
    @Test
    public void testSetAtime() {

    }

    /**
     * Test of getSeats method, of class Service.
     */
    @Test
    public void testGetSeats() {

    }

    /**
     * Test of setSeats method, of class Service.
     */
    @Test
    public void testSetSeats() {

    }

    /**
     * Test of getDt method, of class Service.
     */
    @Test
    public void testGetDt() {
        assertEquals("2020-12-02",svt.getDt());
    }

    /**
     * Test of setDt method, of class Service.
     */
    @Test
    public void testSetDt() {

    }
    
}
