/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import MVC_Structure.model.AddBus;
import java.sql.Time;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
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
public class AddBusTest {


        SimpleStringProperty service = new SimpleStringProperty("Ena");
        SimpleStringProperty source = new SimpleStringProperty("Dhaka");
        SimpleStringProperty destination = new SimpleStringProperty("Cox");
        SimpleStringProperty fare = new SimpleStringProperty("1000");
        Time depart = Time.valueOf("12:00:00");
       Time arrival= Time.valueOf("06:00:00");;
        SimpleStringProperty totalseat= new SimpleStringProperty("26");
        SimpleStringProperty date= new SimpleStringProperty("2020-12-02");
           
    
    AddBus ab;
    
    
    public AddBusTest() {
    
     
    }
 
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {

        
        ab =new AddBus(service,source,destination,fare,depart,arrival,totalseat,date);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getService method, of class AddBus.
     */
    @Test
    public void testGetService() {
          assertEquals("Ena",ab.getService());
    }

    /**
     * Test of serviceProperty method, of class AddBus.
     */
    @Test
    public void testServiceProperty() {
      
    }

    /**
     * Test of setService method, of class AddBus.
     */
    @Test
    public void testSetService() {
  
    }

    /**
     * Test of getSource method, of class AddBus.
     */
    @Test
    public void testGetSource() {
       assertEquals("Dhaka",ab.getSource());
    }

    /**
     * Test of sourceProperty method, of class AddBus.
     */
    @Test
    public void testSourceProperty() {
     
    }

    /**
     * Test of setSource method, of class AddBus.
     */
    @Test
    public void testSetSource() {
 
    }

    /**
     * Test of getDestination method, of class AddBus.
     */
    @Test
    public void testGetDestination() {
        assertEquals("Cox",ab.getDestination());

    }

    /**
     * Test of destinationProperty method, of class AddBus.
     */
    @Test
    public void testDestinationProperty() {

    }

    /**
     * Test of setDestination method, of class AddBus.
     */
    @Test
    public void testSetDestination() {
    
    }

    /**
     * Test of getFare method, of class AddBus.
     */
    @Test
    public void testGetFare() {
     assertEquals("1000",ab.getFare());
    }

    /**
     * Test of fareProperty method, of class AddBus.
     */
    @Test
    public void testFareProperty() {
   
    }

    /**
     * Test of setFare method, of class AddBus.
     */
    @Test
    public void testSetFare() {

    }

    /**
     * Test of getTotalseat method, of class AddBus.
     */
    @Test
    public void testGetTotalseat() {
     assertEquals("26",ab.getTotalseat());
    }

    /**
     * Test of totalseatProperty method, of class AddBus.
     */
    @Test
    public void testTotalseatProperty() {
      
    }

    /**
     * Test of setTotalseat method, of class AddBus.
     */
    @Test
    public void testSetTotalseat() {
       
    }

    /**
     * Test of getDate method, of class AddBus.
     */
    @Test
    public void testGetDate() {
      assertEquals("2020-12-02",ab.getDate());
    }

    /**
     * Test of dateProperty method, of class AddBus.
     */
    @Test
    public void testDateProperty() {
     
    }

    /**
     * Test of setDate method, of class AddBus.
     */
    @Test
    public void testSetDate() {
        
    }

    /**
     * Test of getDepart method, of class AddBus.
     */
    @Test
    public void testGetDepart() {
     assertEquals(Time.valueOf("12:00:00"),ab.getDepart());
    }

    /**
     * Test of getArrival method, of class AddBus.
     */
    @Test
    public void testGetArrival() {
      assertEquals(Time.valueOf("06:00:00"),ab.getArrival());  
    }
    
}
