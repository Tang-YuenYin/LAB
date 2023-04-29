import java.util.Scanner;
public class TestIntMyStack {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        //Decalare the constructor
        MyStack<Integer>IStack=new MyStack<>();
        
        
        System.out.print("Enter an integer: ");
        int n=sc.nextInt();
        
        //push i from 1 to entered value
        for(int i=1;i<=n;i++)
        {
            IStack.push(i);
        }
        
        //Get size of the stack
        System.out.println("Size of the stack: "+IStack.getSize());
        
        //Display content by poppingg.pop pop pop pop pop.
        while(!IStack.isEmpty())
        {
            System.out.print(IStack.pop()+" ");
        }
        System.out.println("");
        
    }
 
}
