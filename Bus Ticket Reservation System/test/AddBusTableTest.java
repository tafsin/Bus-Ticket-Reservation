/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import MVC_Structure.model.AddBusTable;
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
public class AddBusTableTest {
    AddBusTable abt;
    
    public AddBusTableTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        abt= new AddBusTable("Ena","Dhaka","Cox",1000,Time.valueOf("12:00:00"),Time.valueOf("06:00:00"),26,"2020-12-02");
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getService1 method, of class AddBusTable.
     */
    @Test
    public void testGetService1() {
      assertEquals("Ena",abt.getService1());
    }

    /**
     * Test of getSource1 method, of class AddBusTable.
     */
    @Test
    public void testGetSource1() {
     assertEquals("Dhaka",abt.getSource1());
    }

    /**
     * Test of getDestination1 method, of class AddBusTable.
     */
    @Test
    public void testGetDestination1() {
     assertEquals("Cox",abt.getDestination1());
    }

    /**
     * Test of getFare1 method, of class AddBusTable.
     */
    @Test
    public void testGetFare1() {
      //assertEquals(26, abt.getFare1());
    }

    /**
     * Test of setFare1 method, of class AddBusTable.
     */
    @Test
    public void testSetFare1() {
     
    }

    /**
     * Test of getDepart1 method, of class AddBusTable.
     */
    @Test
    public void testGetDepart1() {
     assertEquals(Time.valueOf("12:00:00"),abt.getDepart1());

    }

    /**
     * Test of setDepart1 method, of class AddBusTable.
     */
    @Test
    public void testSetDepart1() {
     
    }

    /**
     * Test of getArrival1 method, of class AddBusTable.
     */
    @Test
    public void testGetArrival1() {
     assertEquals(Time.valueOf("06:00:00"),abt.getArrival1());
    }

    /**
     * Test of setArrival1 method, of class AddBusTable.
     */
    @Test
    public void testSetArrival1() {
     
    }

    /**
     * Test of getSeat1 method, of class AddBusTable.
     */
    @Test
    public void testGetSeat1() {
      
    }

    /**
     * Test of setSeat1 method, of class AddBusTable.
     */
    @Test
    public void testSetSeat1() {
     
    }

    /**
     * Test of getDate1 method, of class AddBusTable.
     */
    @Test
    public void testGetDate1() {
     assertEquals("2020-12-02",abt.getDate1());
    }
    
}
