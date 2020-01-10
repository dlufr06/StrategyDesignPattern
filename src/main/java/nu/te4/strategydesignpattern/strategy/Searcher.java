/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nu.te4.strategydesignpattern.strategy;

import nu.te4.strategydesignpattern.TE4Container;

public interface Searcher {
    
    public int find(int key, TE4Container container);
}
