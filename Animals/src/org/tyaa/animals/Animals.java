/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.animals;

import org.tyaa.animalslib.Cat;
import org.tyaa.animalslib.Goldfish;

/**
 *
 * @author student
 */
public class Animals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Cat cat = new Cat();
        cat.breathe();
        cat.eat();
        
        Goldfish g = new Goldfish();
        g.eat();
    }
    
}
