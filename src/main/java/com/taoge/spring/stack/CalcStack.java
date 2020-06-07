package com.taoge.spring.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class CalcStack {

    public static List<String> parseExpression(String text){
        List<String>result=new ArrayList<String>();
        String number="";
        for(int i=0;i<text.length();i++){
            char temp=text.charAt(i);
            if(temp>='0'&&temp<='9'){
                number+=temp;
            }else {
                if(!"".equals(number)){
                    result.add(number);
                    number="";
                }
                if('('==temp||')'==temp){
                    result.add(temp+"");
                }
                if('+'==temp||'-'==temp||'*'==temp||'/'==temp){
                    result.add(temp+"");
                }
            }
        }
        if(!"".equals(number)){
            result.add(number);
        }
        return result;
    }

    public static int calc(List<String> expr) throws IllegalAccessException {
        Stack<Integer> numberStack=new Stack<>();
        Stack<String> operationStack=new Stack<>();
        for(String temp:expr){
            if(temp.matches("\\d+")){
                numberStack.push(Integer.parseInt(temp));
            }else{
                if(operationStack.isEmpty()){
                    operationStack.push(temp);
                }else{
                    String top=operationStack.peek();
                    if(getPripority(temp)<=getPripority(top)){
                        int num2=numberStack.pop();
                        int num1=numberStack.pop();
                        int result=calcValue(num1,num2,operationStack.pop());
                        numberStack.push(result);
                        operationStack.push(temp);
                    }else{
                        operationStack.push(temp);
                    }
                }
            }
        }
        while(!operationStack.isEmpty()){
            String operation=operationStack.pop();
            int  num2=numberStack.pop();
            int num1=numberStack.pop();
            int result=calcValue(num1,num2,operation);
            numberStack.push(result);
        }
        return numberStack.pop();
    }

    public static void main(String[] args) throws IllegalAccessException {
        String text="2/2+30*5-40-12*2";
        List<String> expr=parseExpression(text);
        System.out.println("result="+calc(expr));
    }

    public static int calcValue(int num1,int num2,String operation) throws IllegalAccessException {
        if("+".equals(operation)){
            return num1+num2;
        }
        if("-".equals(operation)){
            return num1-num2;
        }
        if("*".equals(operation)){
            return num1*num2;
        }
        if("/".equals(operation)){
            return num1/num2;
        }
        throw  new IllegalAccessException();
    }

    public static int getPripority(String operation){
        if("+".equals(operation)||"-".equals(operation)){
            return 1;
        }
        if("*".equals(operation)||"/".equals(operation)){
            return 2;
        }
        return 0;
    }

}
