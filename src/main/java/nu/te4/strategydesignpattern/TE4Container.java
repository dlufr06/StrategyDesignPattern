/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nu.te4.strategydesignpattern;

import java.util.List;
import nu.te4.strategydesignpattern.strategy.Searcher;

/**
 *
 * @author Daniel Lundberg
 */
public abstract class TE4Container {
    protected List<Integer> container;
    protected Searcher searcher; 
    
    public TE4Container(){}
    
    public void add(int nr){
        container.add(nr);
    }
    
    public void remove(int index){
        container.remove(index);
    }
    
    public int get(int index){
        return container.get(index);
    }
    
    public int size(){
        return container.size();
    }
    
    public int find(int key){
     return searcher.find(key, this);
    }
    
}
