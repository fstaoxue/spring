package com.taoge.spring.sort;

import java.util.Arrays;

public class GuiSort {

    public void sort(int[] result,int start,int end){
        int middle=(start+end)/2;
        if(start<end){
            sort(result,start,middle);
            sort(result,middle+1,end);
            merge(result,start,end,middle);
        }
    }

    public void merge(int[] result,int start,int end,int middle){
        int[] temp=new int[result.length];
        int i=start;
        int index1=start;
        int index2=middle+1;
        while(index1<=middle||index2<=end){
            if(index1>middle){
                temp[i++]=result[index2++];
                continue;
            }
            if(index2>end){
                temp[i++]=result[index1++];
                continue;
            }
            if(result[index1]<result[index2]){
                temp[i++]=result[index1++];
            }else{
                temp[i++]=result[index2++];
            }
        }
        while(start<=end){
            result[start]=temp[start];
            start++;
        }
    }


    public static void main(String[] args) {
        GuiSort sort=new GuiSort();
        ArraySort arraySort=new ArraySort();
        int[] data=arraySort.produceArray(1000,2000);
        //int[] data={6,5,4,3,3,2,1};
//        int[] data={15, 1, 3, 0, 10};
        int[] tempData=Arrays.copyOf(data,data.length);
        arraySort.showArray(data);
        sort.sort(data,0,data.length-1);
        //sort.getindex(data,0,data.length-1);
        Arrays.sort(tempData);
        System.out.println(Arrays.equals(data,tempData));
        arraySort.showArray(data);
    }

}
