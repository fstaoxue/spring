package com.taoge.spring.linkedlist;

public class CircleLinkedList {

    public Node head;

    public Node cur;

    public CircleLinkedList(String name,int order){
        head=new Node(name,order);
        head.next=head;
        cur=head;
    }

    public void add(String name,int order){
        Node node=new Node(name,order);
        cur.next=node;
        node.next=head;
        cur=node;
    }

    public void del(int n,int m){
        Node temp=head;
        int count=1;
        while(count<n){
            temp=temp.next;
            count++;
        }
        int num=0;
        while(temp!=temp.next){
            Node cur=temp.next;
            if(++num==m){
                temp.next=cur.next;
                System.out.println("淘汰"+cur);
                num=0;
                temp=cur.next;
                continue;
            }
            temp=temp.next;
        }
        System.out.println("最后淘汰"+temp);
    }

    private static class Node{
        private String name;
        private int order;
        private Node next;
        public Node(String name,int order){
            this.name=name;
            this.order=order;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "name='" + name + '\'' +
                    ", order=" + order +
                    '}';
        }
    }

    public static void main(String[] args) {
        CircleLinkedList circleLinkedList=new CircleLinkedList("1",1);
        circleLinkedList.add("2",2);
        circleLinkedList.add("3",3);
        circleLinkedList.add("4",4);
        circleLinkedList.add("5",5);
        circleLinkedList.add("6",6);
        circleLinkedList.add("7",7);
        circleLinkedList.del(4,2);
    }
}
