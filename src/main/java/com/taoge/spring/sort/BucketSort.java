package com.taoge.spring.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BucketSort {

    public void sort(int[] result,int start,int end){
        int num=result.length;
        int max=result[0];
        int[][] bucket=new int[10][result.length];
        int[] countIndex=new int[10];
        for(int i=1;i<num;i++){
            max=Math.max(max,result[i]);
        }
        for(int gap=1;max/gap>0;gap*=10){
            for(int i=0;i<num;i++){
                int temp=result[i]/gap;
                int tempIndex=temp%10;
                bucket[tempIndex][countIndex[tempIndex]++]=result[i];
            }
            int key=0;
            for(int j=0;j<10;j++){
                int tempKey=0;
                while(tempKey<countIndex[j]){
                    result[key++]=bucket[j][tempKey++];
                }
            }
//            System.out.println(Arrays.toString(result));
            Arrays.fill(countIndex,0);
        }
    }


    public static void main(String[] args) {
        BucketSort sort=new BucketSort();
        ArraySort arraySort=new ArraySort();
//        int[] data=arraySort.produceArray(10,100);
        //int[] data={6,5,4,3,3,2,1};
        int[] data={15, 1,10, 3,10, 0, 10};
        int[] tempData=Arrays.copyOf(data,data.length);
        arraySort.showArray(data);
        sort.sort(data,0,data.length-1);
        arraySort.showArray(data);
//        System.out.println(sort.binarySearch(data,1));
        System.out.println(sort.binarySearch2(data,10).toString());
        //sort.getindex(data,0,data.length-1);
//        Arrays.sort(tempData);
//        System.out.println(Arrays.equals(data,tempData));
//        arraySort.showArray(data);
    }

    public int binarySearch(int[] arr,int key){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int middle=(start+end)/2;
            if(arr[middle]>key){
                end=middle-1;
                continue;
            }else if(arr[middle]<key){
                start=middle+1;
            }else{
                return middle;
            }
        }
        return -1;
//        int middle=start+((key-arr[start])/(arr[end]-arr[start]))*(end-start);
    }

    public List<Integer> binarySearch2(int[] arr, int key){
        List<Integer> resultList=new ArrayList<>();
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int middle=(start+end)/2;
            if(arr[middle]>key){
                end=middle-1;
                continue;
            }else if(arr[middle]<key){
                start=middle+1;
            }else{
                int temoIndex=middle-1;
                while(arr[temoIndex]==key){
                    resultList.add(temoIndex);
                    temoIndex--;
                }
                resultList.add(middle);
                temoIndex=middle+1;
                while(arr[temoIndex]==key){
                    resultList.add(temoIndex);
                    temoIndex++;
                }
                return resultList;
            }
        }
        return null;
    }

}
