package com.thoughtworks.fizzbuzz;

/**
 * Created by shuwenli on 15-2-16.
 */
public class FizzBuzz {

    public String FizzBuzz(int n){
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
