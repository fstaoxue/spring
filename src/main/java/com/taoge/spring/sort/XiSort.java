package com.taoge.spring.sort;

import java.util.Arrays;

public class XiSort {

    public void sort(int[] result){
        int num=result.length;
        for(int gap=num/2;gap>0;gap/=2){
            for(int i=gap;i<num;i++){
                int temp=result[i];
                int j=i;
                while(j-gap>=0&&temp<result[j-gap]){
                    result[j]=result[j-gap];
                    j=j-gap;
                }
                result[j]=temp;
            }
        }
    }

    public void show(int[] result){
        System.out.println(Arrays.toString(result));
    }

    public static void main(String[] args) {
        XiSort sort=new XiSort();
        ArraySort arraySort=new ArraySort();
        int[] data=arraySort.produceArray(1000,100);
        int[] tempData=Arrays.copyOf(data,data.length);
        //sort.showArray(data);
        sort.sort(data);
        Arrays.sort(tempData);
        System.out.println(Arrays.equals(data,tempData));
        arraySort.showArray(tempData);
    }

}
