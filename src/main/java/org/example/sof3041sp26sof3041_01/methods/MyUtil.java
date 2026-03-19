package org.example.sof3041sp26sof3041_01.methods;

public class MyUtil {

    public int add(int x, int y) {

        return x + y;
    }

    public String reverse(String input) {

        // abc => cba
        return new StringBuilder(input).reverse().toString();
    }


}
