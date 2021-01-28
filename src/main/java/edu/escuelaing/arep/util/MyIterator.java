package edu.escuelaing.arep.util;

import java.util.Iterator;

/**
 *
 * @author Federico Barrios Meneses
 */

public class MyIterator<E> implements Iterator<E>{
    private Node<E> currentNode = null;
    
    public MyIterator(MyArrayList<E> list) { 
        this.currentNode = list.getHead();
    }
    
    @Override
    public boolean hasNext() {
        return currentNode != null;
    }

    @Override
    public E next() {
        E data = currentNode.getValue(); 
        currentNode = currentNode.getNextNode(); 
        return data; 
    }
}
