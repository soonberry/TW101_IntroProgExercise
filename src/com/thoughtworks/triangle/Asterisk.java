package com.thoughtworks.triangle;

/**
 * Created by shuwenli on 15-2-13.
 */
public class Asterisk {

    public String DrawOne(){
        return "*";
    }

    public String DrawHorLine(int n) {
        String result="*";
        int i=1;
        while (i<n){
            result+="*";
            i++;
        }
        return result;
    }

    public String DrawVerLine(int n) {
        String result="*";
        int i=1;
        while(i<n){
            result+="\n*";
            i++;
        }
        return result;
    }

    public String DrawRightTriangle(int n) {
        String result="*";
        int i=1;
        while (i<n){
            result+="\n"+DrawHorLine(i+1);
            i++;
        }
        return result;
    }
}
