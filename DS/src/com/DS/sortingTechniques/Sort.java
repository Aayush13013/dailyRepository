package com.DS.sortingTechniques;

public class Sort {
    //bubble sort
    void bubbleSort(int a[], int n) {
        int temp;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (a[j] > a[j + 1]) {
                    a[j] = a[j] + a[j + 1];
                    a[j + 1] = a[j] - a[j + 1];
                    a[j] = a[j] - a[j + 1];
                }
            }
        }
    }
    //selection sort
    void selectionSort(int a[],int n){
        int temp;
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j <n ; j++) {
                if (a[i]>a[j]){
                    a[i]=a[i]+a[j];
                    a[j]=a[i]-a[j];
                    a[i]=a[i]-a[j];
                }
            }
        }
    }
}
