package com.thoughtworks.fizzbuzz;

/**
 * Created by shuwenli on 15-2-16.
 */
public class FizzBuzz {

    public String isFizzBuzz(int n) {
        String result="";
        if (n % 3 == 0) {
            result += "Fizz";
            if (n % 5 == 0)
                result += "Buzz";
        }
        else if(n%5==0)
            result+="Buzz";
        else
            result+=n;

        return result;
    }


    public String fizzBuzz(int n){
        String result="";
        for (int i = 1; i <=n; i++) {
            result+=isFizzBuzz(i);
            result+="\n";
        }
        return result;
    }

}
