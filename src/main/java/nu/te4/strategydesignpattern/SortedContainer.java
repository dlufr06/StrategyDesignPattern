/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nu.te4.strategydesignpattern;

import java.util.ArrayList;
import java.util.Collections;
import nu.te4.strategydesignpattern.strategy.BinarySearcher;

/**
 *
 * @author Daniel Lundberg
 */
public class SortedContainer extends TE4Container {

    public SortedContainer() {
        super();
        container = new ArrayList<>();
        searcher = new BinarySearcher();
    }

    @Override
    public void add(int nr) {
        super.add(nr); //To change body of generated methods, choose Tools | Templates.
        sort();
    }

    private void sort() {
        Collections.sort(container);
    }

}
