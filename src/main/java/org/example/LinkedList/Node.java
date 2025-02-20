package org.example.LinkedList;

import org.example.Tasks;

public class Node {
    public Tasks task;
    public Node next;

    public Node(Tasks task){
        this.task = task;
        this.next = null;
    }
}
