package org.example;

public class Ex2 {
    public static boolean isPrime(int number){
        for (int j=2; j<number;j++){
            if (number % j == 0)
                return false;
        }
        return true;
    }

    public boolean isEven(int number) {
        if (number % 2 == 0){
            return true;
    }else {
        return false;
        }
    }

    public static boolean isMultiple(int number,int divisor){
        if (number % divisor == 0) {
            return true;
        }else{
                return false;
            }
        }
    }