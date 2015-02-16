package com.thoughtworks.fizzbuzz;

/**
 * Created by shuwenli on 15-2-16.
 */
public class FizzBuzz {

    public String fizz(int n){
        if(n%3==0)
            return "Fizz";
        return "";
    }

    public String buzz(int n) {
        if (n%5==0)
            return "Buzz";
        return "";
    }


    public String fizzBuzz(int n){
        String result="";
        for (int i = 1; i <=n; i++) {
            if(i%3==0) {
                result += "Fizz";
                if (i % 5 == 0)
                    result += "Buzz";
            }
            else if(i%5==0)
                result+="Buzz";
            else
                result+=i;
            result+="\n";
        }
        return result;
    }


}
