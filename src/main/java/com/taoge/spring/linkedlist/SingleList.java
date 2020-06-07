package com.taoge.spring.linkedlist;

public class SingleList {

    private Node head;

    public SingleList(){
        head=new Node("",-1,-1);
    }

    public void add(String name,int age,int order){
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        Node newNode=new Node(name,age,order);
        temp.next=newNode;
    }

    public void addByCount(String name,int age,int order){
        Node newNode=new Node(name,age,order);
        Node temp=head;
        while(temp.next!=null){
            if(temp.next.order>order){
                break;
            }
            temp=temp.next;
        }
        Node cur=temp.next;
        temp.next=newNode;
        newNode.next=cur;
    }

    public void delByOrder(int order){
        Node temp=head;
        while(temp.next!=null){
            Node cur=temp.next;
            if(cur.order==order){
                temp.next=cur.next;
            }
            temp=temp.next;
        }
    }

    public void delByCountASC(int count){
        Node temp=head;
        int i=0;
        while(temp.next!=null){
            i++;
            Node cur=temp.next;
            if(i==count){
                temp.next=cur.next;
            }
        }
    }

    public int count(){
        int count=0;
        Node temp=head.next;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        return count;
    }

    public static SingleList concat(SingleList one,SingleList two){
        Node newHead=new Node("",-1,-1);
        Node temp1=one.head.next;
        Node temp2=two.head.next;
        Node cur=newHead;
        while(temp1!=null||temp2!=null){
            if(temp2==null){
                cur.next=temp1;
                temp1=temp1.next;
                cur=cur.next;
                continue;
            }
            if(temp1==null){
                cur.next=temp2;
                temp2=temp2.next;
                cur=cur.next;
                continue;
            }
            if(temp1.order<temp2.order){
                cur.next=temp1;
                temp1=temp1.next;
                cur=cur.next;
            }else{
                cur.next=temp2;
                temp2=temp2.next;
                cur=cur.next;
            }
        }
        SingleList result=new SingleList();
        result.head=newHead;
        return result;
    }

    public void delByCountDesc(int count){
        int index=count()-count;
        delByCountASC(index);
    }

    public void showAsc(){
        Node temp=head.next;
        while(temp!=null){
            System.out.println(temp);
            temp=temp.next;
        }
    }

    private void showDescAll1(){
        showDesc(head.next);
    }

    public void showDesc(Node node){
        if(node==null){
            return;
        }
        if(node.next!=null){
            showDesc(node.next);
        }
        System.out.println(node);
    }

    private static class Node{

        private String name;

        private int age;

        private int order;

        private Node next;

        private Node(String name,int age,int order){
            this.name=name;
            this.age=age;
            this.order=order;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", order=" + order +
                    '}';
        }
    }

    public static void main(String[] args) {
        SingleList list=new SingleList();
        list.addByCount("wan",13,5);
        list.addByCount("wu",13,3);
        list.addByCount("ji",14,4);
        list.addByCount("zhui",12,7);

        list.showAsc();
        System.out.println("-----------------------");
//        list.showDescAll1();


        SingleList list2=new SingleList();
        list2.addByCount("li",11,6);
        list2.addByCount("tian",11,1);
        list2.addByCount("zong",15,8);
        list2.addByCount("di",12,2);
        list2.showAsc();
        System.out.println("-----------------------");

        SingleList list3=SingleList.concat(list,list2);
        list3.showAsc();
    }



}
