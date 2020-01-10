/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nu.te4.strategydesignpattern;

import java.util.Random;

/**
 *
 * @author Daniel Lundberg
 */
public class Start {

    public static void main(String[] args) {
        TE4Container c1 = new SortedContainer();
        TE4Container c2 = new UnSortedContainer();

        Random r = new Random();
        for (int i = 0; i < 1000; i++) {
            c1.add(r.nextInt(10000));
            c2.add(r.nextInt(10000));
        }

        System.out.println("Look for 100 in Containers-");
        if (c1.find(100) != -1) {
            System.out.println("Found in c1");
        }

        if (c2.find(100) != -1) {
            System.out.println("Found in c2");
        }
    }
}
