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
public class BinarySearcher implements Searcher {

    @Override
    public int find(int key, TE4Container container) {
        System.out.println("Uses BinaySearch");
        int low = 0;
        int high = container.size();
        while (low <= high) {
            int mid = (low + high) / 2;
            if (container.get(mid) < key) {
                low = mid + 1;
            } else if (container.get(mid) > key) {
                high = mid - 1;
            } else if (container.get(mid) == key) {
                return mid;
            }
        }
        return -1;
    }

}
