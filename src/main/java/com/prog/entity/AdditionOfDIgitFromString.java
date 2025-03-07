package com.prog.entity;

public class AdditionOfDIgitFromString {

    public static int addNumbersOnly(String str){//"12adof35tugof23"
        int len=str.length();
        int sum=0;
        int flag=0;
        for(int i=0;i<len;i++){
            if(Character.isDigit(str.charAt(i))){
                sum+=Character.getNumericValue(str.charAt(i));
                i=i+1; //Next adjecent gigit skiping
            }
        }
        return sum;
    }
}
