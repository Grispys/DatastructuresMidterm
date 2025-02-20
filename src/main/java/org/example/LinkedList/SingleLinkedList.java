package org.example.LinkedList;

import org.example.Tasks;

public class SingleLinkedList {
    public Node head;
    public Node tail;
    public int size;

    public Node createLinkedList(Tasks taskValue){
        Node node = new Node(taskValue);
        node.next = null;
        node.task = taskValue;
        head = node;
        tail = node;
        size =1 ;
        return head;
    }

    public void insertInLinkedList(Tasks taskValue, int location){
        Node node = new Node(taskValue);
        node.task = taskValue;
        if (head==null){
            createLinkedList(taskValue);
            return;

        } else if(location == 0){
            node.next = head;
            head = node;
        } else if (location >= size){
            tail.next = node;
            node.next = null;
            tail = node;

        } {
            Node tempNode = head;
            int index = 0;
            while (index < location - 1){
                tempNode = tempNode.next;
                index ++;
            }
            Node nextNode = node;
            node.next = nextNode;
        }
        size++;

    }


// reusing the linkedlist i previously had made


    public void deleteInLinkedList(int location){
        if(head == null){
            return;
        }
        if(location ==0){
            head = head.next;
            if(head == null){
                tail = null;
            }
        } else if(location >= size -1){
            Node tempNode = head;
            while (tempNode.next != null && tempNode.next != tail){
                tempNode = tempNode.next;
            }
            tempNode.next = null;
            tail = tempNode;


        }else{
            Node tempNode = head;
            int start = 0;
            while(start < location -1){
                tempNode = tempNode.next;
                start++;
            }
            tempNode.next =tempNode.next.next;
        }
        size--;
    }


    public void traverseLinkedList(){
        if (head == null){
            System.out.println("SLL does not exist");
        } else{
            Node tempNode = head;
            for (int i = 0; i <size; i++){
                System.out.print(tempNode.task);
                if (i != size -1){
                    System.out.print(" -> ");
                }
                tempNode = tempNode.next;
            }
            System.out.print("\n");
        }
    }
    public Boolean searchNode (Tasks taskValue){
        if (head !=null){
            Node tempNode = head;
            for (int i = 0; i < size; i++){
                if(tempNode.task == taskValue){
                    System.out.println("LinkedList.Node found: " + tempNode.task + " at location: " + i + "\n");
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.print("LinkedList.Node not found");
        return false;
    }
}

