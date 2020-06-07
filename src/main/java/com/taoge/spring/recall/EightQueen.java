package com.taoge.spring.recall;

public class EightQueen {

    private static final  int NUM=8;

    private static int count=0;

    public static void main(String[] args) {
        int[] result=new int[NUM];
        recall(result,0);
    }

    public static void recall(int[]result,int index){
        if(index>=NUM){
            count++;
            show(result,count);
            return;
        }else{
            for(int i=0;i<NUM;i++){
                if(judge(result,index,i)){
                    result[index]=i;
                    recall(result,index+1);
                }
            }
        }
    }

    public static boolean judge(int[] result,int index,int num){
        for(int i=0;i<index;i++){
            if(!judge(i,result[i],index,num)){
               return false;
            }
        }
        return true;
    }

    public static boolean judge(int x1,int y1,int x2,int y2){
        if(y1==y2){
            return false;
        }
        if(Math.abs(x1-x2)==Math.abs(y1-y2)){
            return false;
        }
        return true;
    }

    public static void show(int[] result,int count){
        System.out.println("第"+count+"种结果开始");
        for(int i=0;i<NUM;i++){
            StringBuilder builder=new StringBuilder();
            for(int j=0;j<NUM;j++){
                if(j==result[i]){
                    builder.append(" 2 ");
                }else{
                    builder.append(" 0 ");
                }
            }
            System.out.println(builder.toString());
        }
        System.out.println("第"+count+"种结果结束");
    }
}
