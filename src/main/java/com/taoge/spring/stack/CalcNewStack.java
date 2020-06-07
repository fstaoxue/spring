package com.taoge.spring.stack;

import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class CalcNewStack {
    public static List<String> parseExpression(List<String> expr){
        Stack<String> exprStack=new Stack<>();
        Stack<String> helpStack=new Stack<>();
        for(String temp:expr){
            if(temp.matches("\\d+")){
                exprStack.push(temp);
            }else {
                boolean flag=true;
                while(flag){
                    flag=false;
                    if("(".equals(temp)||helpStack.isEmpty()){
                        helpStack.push(temp);
                    }else if(")".equals(temp)){
                        while(!helpStack.isEmpty()){
                            String tempTop=helpStack.pop();
                            if("(".equals(tempTop)){
                                break;
                            }else{
                                exprStack.push(tempTop);
                            }
                        }
                    } else{
                        String top=helpStack.peek();
                        if(CalcStack.getPripority(temp)>CalcStack.getPripority(top)){
                            helpStack.push(temp);
                        }else{
                            String tempTop=helpStack.pop();
                            exprStack.push(tempTop);
                            flag=true;
                        }
                    }
                }

            }
        }
        while(!helpStack.isEmpty()){
            exprStack.push(helpStack.pop());
        }
        return exprStack;
    }

    public static int calc(List<String> expr) throws IllegalAccessException {
        Stack<Integer> resultStack=new Stack<>();
        for(String temp:expr){
            if(temp.matches("\\d+")){
                resultStack.push(Integer.parseInt(temp));
            }else{
                int num2=resultStack.pop();
                int num1=resultStack.pop();
                resultStack.push(CalcStack.calcValue(num1,num2,temp));
            }
        }
        return resultStack.pop();
    }

    public static void main(String[] args) throws IllegalAccessException {
        String expr="(2+3)*(5-4)+19-9";
        List<String> result=CalcStack.parseExpression(expr);
        result.stream().forEach(System.out::println);
        List<String> exprList=parseExpression(result);
        exprList.stream().forEach(System.out::println);
        int result2=calc(exprList);
        System.out.println("result=="+result2);
    }

}
