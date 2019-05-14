package com.manoj.dynamicArrayImplementation;

public class Stack {

    private int capacity;

    private final static  int DEFAULT_CAPACITY = 10;

    private int size;

    private int top;

    private int[] stackArray;

    private int initialCapacity;

    Stack(){
       this(DEFAULT_CAPACITY);
    }

    Stack(int size){
        capacity = size;
        stackArray = new int[capacity];
        top=-1;
        initialCapacity = capacity;
    }

    public int size(){
        return top+1;
    }

    private void expand(){
        int length = size();
        int [] newStackArray = new int[length<<1];
        System.arraycopy(stackArray,0,newStackArray,0,length);
        stackArray = newStackArray;
        this.capacity = capacity<<1;
    }

    boolean isEmpty(){
        return top<0;
    }

    boolean isFullStack(){
        return size==capacity;
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

    public void push(int data){
        if ( isFullStack() )
            expand();
        System.out.println("pushing the data: "+data+" to the stack");
        stackArray[ ++top ] = data;
        size+=1;
    }

    public int pop() {
        if ( !isEmpty() ) {
            size-=1;
            int data = stackArray[ top-- ];
            return data;
        }
        else {
            System.out.println("stack underflow");
            return  Integer.MIN_VALUE;
        }
    }

}
