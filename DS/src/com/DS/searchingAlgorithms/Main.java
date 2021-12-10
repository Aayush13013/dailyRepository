package com.DS.searchingAlgorithms;

import com.DS.sortingTechniques.Sort;

public class Main {
    public static void main(String[] args) {
        int a[]={6,2,4,8,1};
//        int index = new Search().linearSearch(a,5,1);
        new Sort().bubbleSort(a,5);
        int index = new Search().binarySearch(a,5,1);
        System.out.println(index);
    }
}
