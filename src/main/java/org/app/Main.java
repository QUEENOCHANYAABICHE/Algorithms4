package org.app;

//PROG THAT REVERSES AN ARRAY
import java.util.*;
public class Main{
    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3,4,5};
        int size = arr.length;
        int[] newArr = new int[size] ;
        for(int i =0; i < size; i++){
            newArr[i] = arr[size - 1 - i];
        }
        System.out.println(Arrays.toString(newArr));
    }
}
