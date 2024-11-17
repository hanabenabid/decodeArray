package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static int[] decode(int[] encoded, int first) {
        int [] result = new int[encoded.length + 1];
        result[0]=first;
        for (int i = 0;i< encoded.length; i++){
            result[i+1]=encoded[i]^ result[i];
        }
        return result;
    }
    public static void main(String[] args) {

    }
}