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
 * @author rsgar
 */
public class MovieTest {
    
    public MovieTest() {
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
     * Test of getPriceCode method, of class Movie.
     */
    @Test
    public void testGetPriceCode() {
        System.out.println("getPriceCode");
        int rd = (int)Math.random();
        final Movie movieTest = new Movie("test", rd);
        movieTest.setPriceCode(2);
        assertTrue(movieTest.getPriceCode() == rd);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPriceCode method, of class Movie.
     */
    @Test
    public void testSetPriceCode() {
        System.out.println("setPriceCode");
        int rd = (int)Math.random();
        final Movie movieTest = new Movie("test", rd);
        movieTest.setPriceCode(2);
        assertTrue(movieTest.getPriceCode() == rd);
        // TODO review the generated test code and remove the defwault call to fail.
        fail("The test case is a prototype.");
    }
    
}
