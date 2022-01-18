/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.espol.rentalsystemtest;

/**
 *
 * @author Eliot
 */
public class Menu {
    public static void main(String[] args){
        Customer c = new Customer("Eliott");
        c.addMovieRental(new MovieRental(new Movie("Spiderman",20),10));
        System.out.println(c.statement());
    }
}
