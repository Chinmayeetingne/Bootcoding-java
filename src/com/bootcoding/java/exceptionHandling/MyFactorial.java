package com.bootcoding.java.exceptionHandling;

class MyException extends Exception{
    private int n ;
    public MyException(int n){
        this.n = n;
    }
    public String toString(){
        return "Can not calculate -ve value factorial :" + n;
    }
}
public class MyFactorial {
    public static void main(String[] args) {
        try{
            System.out.println(fact(5));
            System.out.println(fact(-5));
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
    public static int fact(int n) throws MyException{
        int fact =1;
        if(n<0){
            throw new MyException(n);
        }
        else{
            for(int i=1;i<=n;i++){
                fact = fact*i;
            }
        }
        return (fact);
    }
}
