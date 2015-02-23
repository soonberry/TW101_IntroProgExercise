package com.thoughtworks.diamond;

/**
 * Created by shuwenli on 15-2-14.
 */
public class Diamond {
    public String drawLine(String c, int n) {
        String result = "";
        for (int i = 0; i < n; i++) {
            result += c;
        }
        return result;
    }

    public String drawIsoTriangle(int n) {
        String result = "";
        for (int i = 0; i < n; i++) {
            result += drawLine(" ", n - i - 1) + drawLine("*", 2 * (i + 1) - 1) + "\n";
        }
        return result;
    }

    public String drawTraTriangle(int n) {
        String result = "";
        for (int i = n - 1; i > 0; i--) {
            result += drawLine(" ", n - i) + drawLine("*", 2 * i - 1) + "\n";
        }
        return result;
    }

    public String drawDiamond(int n) {
        String result = "";
        result = drawIsoTriangle(n) + drawTraTriangle(n);
        return result;
    }

    public String drawDiamondWithName(int n, String s) {
        String result = "";
        for (int i = 0; i < n - 1; i++) {
            result += drawLine(" ", n - i - 1) + drawLine("*", 2 * (i + 1) - 1) + "\n";
        }
        result += s + "\n" + drawTraTriangle(n);
        return result;

    }
}
