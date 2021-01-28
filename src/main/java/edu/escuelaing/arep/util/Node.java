package edu.escuelaing.arep.util;

/**
 *
 * @author Federico Barrios Meneses
 */
public class Node<E> {
    private E value;
    private Node<E> nextNode = null;
    
    public Node(E value){
        this.value = value;
    }
    
    public E getValue(){
        return this.value;
    }
    
    public Node<E> getNextNode(){
        return this.nextNode;
    }
    
    public void setNextNode(Node nextNode){
        this.nextNode = nextNode;
    }
}
