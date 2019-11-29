package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int [] d = {11, 3, 14, 16, 7};

        boolean isSorted = false;
        int s;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < d.length-1; i++) {
                if(d[i] > d [i+1]){
                    isSorted = false;

                    s = d[i];
                    d [i] = d [i+1];
                    d [i+1] = s;
                }
            }
            System.out.println(Arrays.toString(d));
        }
        System.out.println(Arrays.toString(d));

    }

    public static void main (String[] args, long x  ) {

        long [] d = {11, 3, 14, 16, 7};

        boolean isSorted = false;
        long t;
        while(!isSorted) {
            isSorted = true;
            for (long i = 0; i < d.length-1; i++) {
                if(d[(int)i] > d [(int)i+1]){
                    isSorted = false;

                    t = d[(int)i];
                    d [(int)i] = d [(int)i+1];
                    d [(int)i+1] = t;
                }
            }
            System.out.println(Arrays.toString(d));
        }
        System.out.println(Arrays.toString(d));

    }

}