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
 * @author Eliot
 */
public class CustomerTest {
    
    public CustomerTest() {
    }

    @org.junit.BeforeClass
    public static void setUpClass() throws Exception {
    }

    @org.junit.AfterClass
    public static void tearDownClass() throws Exception {
    }

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }
    /**
     * Test of addMovieRental method, of class Customer.
     */
    @org.junit.Test
    public void testAddMovieRental() {
        System.out.println("addMovieRental");
        MovieRental arg = null;
        Customer instance = null;
        if(!arg.equals(null)){
            instance.addMovieRental(arg);
        }
        else{
            fail("La Pelicula que se desea ingresar es nula");
        }
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of addVideoGameRental method, of class Customer.
     */
    @org.junit.Test
    public void testAddVideoGameRental() {
        System.out.println("addVideoGameRental");
        VideoGameRental arg = null;
        Customer instance = null;
        instance.addVideoGameRental(arg);
        assertNotNull("Prueba pasada",arg);
        // TODO review the generated test code and remove the default call to fail.
        fail("Videojuego nulo no se puedo agregar");
    }

    /**
     * Test of statement method, of class Customer.
     */
    @org.junit.Test
    public void testStatement() {
        System.out.println("statement");
        Customer instance = new Customer("Eliott");
        instance.addMovieRental(new MovieRental(new Movie("Spiderman",10),3));
        instance.addMovieRental(new MovieRental(new Movie("Titanic",5),2));   
        String expResult = instance.statement();
        String result = instance.statement();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
