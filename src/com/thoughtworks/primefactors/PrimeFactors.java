package com.thoughtworks.primefactors;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by shuwenli on 15-2-16.
 */
public class PrimeFactors {
    public List<Integer> generate(int n) {
        List<Integer> factors=new ArrayList<Integer>();
        if(n<2)
            return null;
        else{
            for (int i = 2; i <= n; i++) {
                while (n!=i){
                    if(n%i!=0)
                        break;
                    factors.add(Integer.valueOf(i));
                    n=n/i;
                }
            }
            factors.add(Integer.valueOf(n));
            return factors;
        }
    }
}
