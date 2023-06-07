/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q1;

/**
 *
 * @author 22004775
 */
public class DIOStack<DIO> {
    private DIO[] array = (DIO[]) new Object[1];
    private int size = 0;

    public void push(DIO o) { 
        if(size==array.length-1)
        {
           int len=array.length*2;
           DIO[]newArray=(DIO[]) new Object[len];
           array=newArray;
        }
       array[size]=o;
       size++;
        
    }
    public DIO pop() {
        if(isEmpty())
        {
            return null;
        }
        else
        {
            DIO s=array[size-1];
            array[size-1]=null;
            size--;
            return s;
        }
    }
    public DIO peek() {
        if(isEmpty())
        {
            return null;
        }
        else
        {
            return array[size-1];
        }
    }
    public boolean isEmpty() {
        if(size==0)
        {
            return true;
        }
        else
            return true;
    }
    public int size() {
        return size;
    }
    @Override
    public String toString() {
        
        if(size==0)
        {
            return "[]";
        }
        else{
        String s="[";
        for(int i=0;i<size;i++)
        {
           s+=array[i]+", ";
        }
        s+="]";
        return s;
        }
        
    }
    private void resize(int size) {
        DIO[]newArray = (DIO[]) new Object[size];
        for(int i=0;i<array.length;i++)
        {
           newArray[i]=array[i];
        }
        array=newArray;
    }
    
}
