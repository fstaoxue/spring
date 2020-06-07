package com.taoge.spring.tree;

import com.taoge.spring.sort.ArraySort;

public class BinaryTree {

    private Node root;

    public void add3(Node head,int value){
        head=new Node(value);
    }



    public void add(int value){
        if(root==null){
            root=new Node(value);
        }else{
            add2(root,value);
        }
    }

    public void add2(Node head,int value){
        Node node=new Node(value);
        if(head==null){
            head=node;
        }else{
            if(value<head.value){
                if(head.left==null){
                    head.left=node;
                }else{
                    add2(head.left,value);
                }
            }else{
                if(head.right==null){
                    head.right=node;
                }else{
                    add2(head.right,value);
                }
            }
        }
    }


    public void preorder(Node node){
        if(node!=null){
            System.out.println(node.value);
            if(node.left!=null){
                preorder(node.left);
            }
            if(node.right!=null){
                preorder(node.right);
            }
        }
    }

    public static void main(String[] args) {
        ArraySort sort=new ArraySort();
//        int[] data=sort.produceArray(10,100);
        int[] data={61, 76, 56, 54, 34, 16, 34, 12, 56, 48};
//        sort.select(data);
        sort.showArray(data);
        BinaryTree tree=new BinaryTree();
        tree.add3(tree.root,99);
        for(int i=0;i<data.length;i++){
            tree.add(data[i]);
        }
        tree.preorder(tree.root);
    }

    private static class Node{
        private Node left;
        private Node right;
        private int value;

        public Node(int value){
            this.value=value;
        }

        public Node getLeft() {
            return left;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public Node getRight() {
            return right;
        }

        public void setRight(Node right) {
            this.right = right;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }

}
