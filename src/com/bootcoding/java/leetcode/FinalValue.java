package com.bootcoding.java.leetcode;

public class FinalValue {

    public static void main(String[] args) {
        String[] operations = {"++X", "++X", "X++"};
        System.out.println(finalValueAfterOperations(operations));
    }

    public static int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for (int i = 0; i < operations.length; i++) {
            if (operations[i] == ("++X") || operations[i] == ("X++")) {
                x++;
            } else {
                x--;
            }
        }
        return x;
       /* int x= 0;
        for(int i=0;i<operations.length;i++){
            if(operations[i] == "--x" || operations[i] == "x--"){
                x = x-1;
            } else if (operations[i] == "++x" || operations[i] == "x++") {
                x = x+1;
            }else {
                continue;
            }
        }
        return x;
    }*/

    }
}

