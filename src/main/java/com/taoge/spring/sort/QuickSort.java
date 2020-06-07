package com.taoge.spring.sort;

import java.util.Arrays;

public class QuickSort {

    public void quickSort(int[] result,int start,int end){
        if(start<end){
            int index=getindex(result,start,end);
            quickSort(result,start,index);
            quickSort(result,index+1,end);
        }
    }

    public int getindex(int[] arr,int low,int high){
        int tmp=arr[low];
        System.out.println(low+"--"+high);
        while(low<high){
            while(low<high&&arr[high]>=tmp){
                high--;
            }
            arr[low]=arr[high];
            System.out.println(Arrays.toString(arr));
            while(low<high&&arr[low]<=tmp){
                low++;
            }
            arr[high]=arr[low];
            System.out.println(Arrays.toString(arr));
        }
        arr[low]=tmp;
        System.out.println(Arrays.toString(arr));
        System.out.println(low);
        return low;
    }

    public static void main(String[] args) {
        QuickSort sort=new QuickSort();
        ArraySort arraySort=new ArraySort();
//        int[] data=arraySort.produceArray(10000,1000);
        //int[] data={6,5,4,3,3,2,1};
        int[] data={10,9,10,11,8,10,22};
        int[] tempData=Arrays.copyOf(data,data.length);
        arraySort.showArray(data);
        System.out.println();
        sort.quickSort(data,0,data.length-1);
        //sort.getindex(data,0,data.length-1);
        Arrays.sort(tempData);
//        System.out.println(Arrays.equals(data,tempData));
//        arraySort.showArray(tempData);
    }

}
