package com.taoge.spring.linkedlist;

public class SingleLinkedList<T> {

    private Node<T> head;

    public SingleLinkedList(){
        head=new Node<T>(null);
    }

    public void add(T data){
        Node<T> temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        Node<T> node=new Node<T>(data);
        temp.next=node;
    }


    public void show(){
        Node<T> temp=head.next;
        while(temp!=null){
            System.out.println(temp.value+"-->");
            temp=temp.next;
        }
    }

    public void del(int id){
        Node<T> parent=head;
        Node<T> cur=head.next;
        while(cur!=null){
            cur=parent.next;
            if(cur.id==id){
                parent.next=cur.next;
                break;
            }
            parent=parent.next;
        }
    }

    public void delByCount(int count){
        Node<T> parent=head;
        Node<T> cur=head.next;
        int i=0;
        while(i<count){
            parent=parent.next;
            i++;
        }
        cur=parent.next;
        parent.next=cur.next;
    }

    public int count(){
        int count=0;
        Node<T> temp=head.next;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }

    private static class Node<T>{
        private T value;
        private int id;
        private Node<T> next;
        private static int generateId=0;
        public Node(T value){
            this.value=value;
            this.next=null;
            this.id=generateId++;
        }

        public T getValue() {
            return value;
        }

        public void setValue(T value) {
            this.value = value;
        }

        public Node<T> getNext() {
            return next;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }
    }

    public static void main(String[] args) {
        SingleLinkedList<Integer> singleLinkedList=new SingleLinkedList<Integer>();
        singleLinkedList.add(1);
        singleLinkedList.add(5);
        singleLinkedList.add(3);
        singleLinkedList.add(4);
        singleLinkedList.add(5);
        singleLinkedList.show();
    }

}


