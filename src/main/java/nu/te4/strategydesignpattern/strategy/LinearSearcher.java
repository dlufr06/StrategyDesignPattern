/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nu.te4.strategydesignpattern.strategy;

import nu.te4.strategydesignpattern.TE4Container;

/**
 *
 * @author Daniel Lundberg
 */
public class LinearSearcher implements Searcher{

    @Override
    public int find(int key, TE4Container container) {
        System.out.println("Uses LinearSearch");
        for(int i=0; i < container.size();i++){
            if(container.get(i) == key){
                return i; 
            }
        }
        return -1;
    }
        
}
