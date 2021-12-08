package com.DS.stack;
//implementing stack using array
public class Stack {

    int MAX=5,top;
    int arr[] = new int[MAX];
    //initializing top with -1 initially in the constructor itself
    Stack()
    {
        top = -1;
    }

    //adding the data into stack
    void push(int data){
        top= top+1;
        arr[top]=data;
    }
    //deleting the element at the top
    void  pop(){
        arr[top]=-1;
        top= top-1;
    }
    //returning the element at the top of the stack
    int peek(){
        return arr[top];
    }

    //check whether stack is full
    boolean isFull(){
        if (top==MAX-1) return true;
        else return false;
    }
    //checks whether the stack is empty
    boolean isEmpty(){
        if (top==-1) return true;
        else return false;
    }
    //display the elements in the stack
    void display(){
        for (int i = top; i >=0 ; i--) {
            System.out.println(arr[i]);
        }
    }
}
