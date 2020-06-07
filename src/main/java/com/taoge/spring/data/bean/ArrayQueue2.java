package com.taoge.spring.data.bean;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

public class ArrayQueue2<E> implements Queue<E> {

    transient private Object[] element;

    transient private int head;

    transient private int tail;

    public int size() {
        return tail-head;
    }

    public boolean isEmpty() {
        return head==tail;
    }

    public boolean contains(Object o) {
        for(int i=head;i<tail;i++){
            Object temp=element[i];
            if(temp.equals(o)){
                return true;
            }
        }
        return false;
    }

    public Iterator<E> iterator() {
        return null;
    }

    public Object[] toArray() {
        return new Object[0];
    }

    public <T> T[] toArray(T[] a) {
        return null;
    }

    public boolean add(E e) {
        return false;
    }

    public boolean remove(Object o) {
        return false;
    }

    public boolean containsAll(Collection<?> c) {
        return false;
    }

    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    public boolean removeAll(Collection<?> c) {
        return false;
    }

    public boolean retainAll(Collection<?> c) {
        return false;
    }

    public void clear() {

    }

    public boolean offer(E e) {
        return false;
    }

    public E remove() {
        return null;
    }

    public E poll() {
        return null;
    }

    public E element() {
        return null;
    }

    public E peek() {
        return null;
    }
}
