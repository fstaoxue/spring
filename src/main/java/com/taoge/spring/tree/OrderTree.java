package com.taoge.spring.tree;

import java.util.ArrayList;
import java.util.List;

public class OrderTree {

    private Node head;

    public OrderTree(int[] arr){
        head=produce(arr,0);
    }


    private Node produce(int[] arr,int n){
        int num=arr.length;
        if(n>=num||n<0){
            return null;
        }
        Node node=new Node(arr[n]);
        Node left=produce(arr,2*n+1);
        Node right=produce(arr,2*n+2);
        node.left=left;
        node.right=right;
        return node;
    }

    private void show(Node head){
        if(head!=null){
            System.out.println(head.value);
            show(head.left);
            show(head.right);
        }

    }

    private static class Node{
        private int value;
        private Node left;
        private Node right;
        public Node(int value){
            this.value=value;
        }
    }

    private void show2(List<Node> list){
        if(list==null||list.size()<=0){
            return ;
        }
        List<Node> nextList=new ArrayList<>();
        for(Node temp:list){
            if(temp!=null){
                System.out.print(temp.value+"   ");
                if(temp.left!=null){
                    nextList.add(temp.left);
                }
                if(temp.right!=null){
                    nextList.add(temp.right);
                }
            }
        }
        show2(nextList);
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        OrderTree tree=new OrderTree(arr);
        tree.show(tree.head);
        List<Node> nextList=new ArrayList<>();
        nextList.add(tree.head);
        System.out.println("-------");
        tree.show2(nextList);

    }
}
