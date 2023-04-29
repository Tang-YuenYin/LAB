import java.util.ArrayList;
public class MyStack <E>{
    ArrayList<E> stack;
    
    //Constructor
    public MyStack(){
        stack=new ArrayList<>();
    }
    
    //Methods
    //Add one object to the top of the stack
    public void push(E o)
    {
        stack.add(o);
    }
    
    //Remove one object from the top of the stack
    public E pop()
    {
        return stack.remove(this.stack.size()-1);
    }
    
    //Read the data on the top 
    public E peek()
    {
        return stack.get(this.stack.size()-1);
    }
    
    //get size 
    public int getSize()
    {
        return this.stack.size();
    }
    
    //check if it is empty
    public boolean isEmpty()
    {
        return this.stack.size()==0;
        //return this.stack.isEmpty();
    }
    
    //to display String
    public String toString()
    {
        return stack.toString();
    }
    
    public boolean search (E o)
    {
        return stack.contains(o);
    }
}
