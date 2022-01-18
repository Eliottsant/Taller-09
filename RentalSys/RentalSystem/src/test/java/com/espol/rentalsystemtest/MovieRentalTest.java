/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.espol.rentalsystemtest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
<<<<<<< HEAD
 * @author Eliot
=======
 * @author rsgar
>>>>>>> 1a274e19ef95b3aeb15bad0155d1b33d869b4390
 */
public class MovieRentalTest {
    
    public MovieRentalTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getDaysRented method, of class MovieRental.
     */
    @Test
    public void testGetDaysRented() {
        System.out.println("getDaysRented");
        int rd = (int)Math.random();
        final MovieRental movieTest = new MovieRental(new Movie("a", 0), rd);
        assertTrue(movieTest.getDaysRented() == rd);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getMovie method, of class MovieRental.
     */
    @Test
    public void testGetMovie() {
        System.out.println("getMovie");
        final MovieRental movieTest = new MovieRental(null, 0);
        assertTrue(movieTest.getMovie() == null);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
