package com.DS.sortingTechniques;

public class Main {
    public static void main(String[] args) {
        int a[]={6,2,4,8,1};
        new Sort().bubbleSort(a,5);
        for (int e:a) {
            System.out.println(e);
        }
    }
}
