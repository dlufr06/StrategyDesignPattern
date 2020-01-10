/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nu.te4.strategydesignpattern;

import java.util.LinkedList;
import nu.te4.strategydesignpattern.strategy.LinearSearcher;

/**
 *
 * @author Daniel Lundberg
 */
public class UnSortedContainer extends TE4Container {

    public UnSortedContainer() {
        super();
        container = new LinkedList<>();
        searcher = new LinearSearcher();
    }

}
