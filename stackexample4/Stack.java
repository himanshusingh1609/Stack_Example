package dsa.stackexample4;

import java.util.ArrayList;
import java.util.List;
public class Stack {
    private ArrayList<Integer> arr;
    private int tos;

    public Stack(){
        arr=new ArrayList<Integer>();
        tos=-1;

    }
    public void push(int x){
        tos++;
        arr.add(tos,x);
    }
    public int pop(){
        if(tos==-1)
            throw new StackException("Stack Underflow");

        int x=arr.remove(tos);
        --tos;
        return x;
    }
    public int peek(){
        if(tos==-1){
            throw new StackException("Stack Underflow");

        }
        int x=arr.get(tos);
        return x;
    }
}
