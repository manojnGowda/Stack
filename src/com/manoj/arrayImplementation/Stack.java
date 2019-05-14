package com.manoj.arrayImplementation;

public class Stack {
    private int capacity;

    private final static  int DEFAULT_CAPACITY = 10;

    private int size;

    private int top;

    private int[] stackArray;

    Stack(){
        capacity = DEFAULT_CAPACITY;
        stackArray = new int[capacity];
        top=-1;
    }

    Stack(int size){
        capacity = size;
        stackArray = new int[capacity];
        top=-1;
    }

    boolean isEmpty(){
        return top<0;
    }

    boolean isFullStack(){
        return size==capacity;
    }

    public void push(int data){
        if ( !isFullStack() ) {
            System.out.println("pushing the data: "+data+" to the stack");
            stackArray[ ++top ] = data;
            size+=1;
        }
        else {
            System.out.println("stack overflow");
        }
    }

    public int pop() {
        if ( !isEmpty() ) {
            size-=1;
            return stackArray[ top-- ];
        }
        else {
            System.out.println("stack underflow");
           return  Integer.MIN_VALUE;
        }
    }

    public int top() throws Exception {
        if ( !isEmpty() ){
            return stackArray[top];
        }else {
            System.out.println("stack underflow");
            return  Integer.MIN_VALUE;
        }

    }

    public  int getSize(){
        return top+1;
    }
}
