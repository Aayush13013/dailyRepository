package com.DS.searchingAlgorithms;

import com.DS.sortingTechniques.Sort;

public class Search {
    //linear search
    public int linearSearch(int a[],int n,int key){
        for (int i = 0; i < n; i++) {
            if (a[i]==key){
                return i;
            }
        }
        return -1;
    }

    //binary search
    //for binary search the collection need to be sorted first
    public int binarySearch(int a[],int n, int key){
        int left = 0;
        int right = n-1;
        int mid;
        while(left<=right){
            mid= (left+right)/2;
            if (a[mid]==key){
                return mid;
            }
            if (key<a[mid]){
                right=mid-1;
            }
            else{
                left= mid +1;
            }
        }
        return -1;
    }
}
