package com.jap;

public class MaxAge {

    // Write the logic to calculate the maximum age from the given array
    //inside the below method and return the calculated maximum age.
    public int getMaxAge(int [] age){
        int max = 0;
        for (int i = 0; i < age.length; i++) {
            if (age[i] > max) {
                max = age[i];
            }
        }
        return max;
    }


    public static void main(String[] args) {
        int age[]={23,34,33,24,2,26,31};
        MaxAge maxAge=new MaxAge();
        int max=maxAge.getMaxAge(age);

        System.out.println("maximum age "+max);

    }
}
