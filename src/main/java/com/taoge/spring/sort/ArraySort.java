package com.taoge.spring.sort;

import java.util.Arrays;
import java.util.Random;

public class ArraySort {

    public int[] produceArray(int number,int limit){
        int[] array=new int[number];
        Random random=new Random();
        for(int i=0;i<number;i++){
            array[i]=random.nextInt(limit);
        }
        return array;
    }

    public void showArray(int[] result){
        System.out.println(Arrays.toString(result));
    }

    public static void main(String[] args) {
        ArraySort sort=new ArraySort();
        int[] data=sort.produceArray(10,100);
        int[] tempData=Arrays.copyOf(data,data.length);
        sort.showArray(data);
        sort.insert(data);
        Arrays.sort(tempData);
        System.out.println(Arrays.equals(data,tempData));
        sort.showArray(tempData);
    }

    public void bubble(int[] result){
        long sTime=System.currentTimeMillis();
        int num=result.length;
        int temp;
        for(int i=0;i<num-1;i++){
            boolean flag=false;
            for(int j=0;j<num-1-i;j++){
                if(result[j]>result[j+1]){
                    temp=result[j];
                    result[j]=result[j+1];
                    result[j+1]=temp;
                    flag=true;
                }
            }
            if(!flag){
                break;
            }
        }
        long eTime=System.currentTimeMillis();
        System.out.println("cost"+(eTime-sTime));
    }

    public void select(int[] result){
        int num=result.length;
        int temp;
        for(int i=0;i<num-1;i++){
            int index=i;
            for(int j=i+1;j<num;j++){
                if(result[index]>result[j]){
                    index=j;
                }
            }
            temp=result[i];
            result[i]=result[index];
            result[index]=temp;
        }
    }

    public void insert(int[] result){
        int num=result.length;
        for(int i=1;i<num;i++){
            int current=result[i];
            int j=i;
            while(j-1>=0&&current<result[j-1]){
                result[j]=result[j-1];
                j--;
            }
            result[j]=current;
        }
    }



}
