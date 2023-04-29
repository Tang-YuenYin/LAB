import java.util.Scanner;
public class MTowerOfHanoi {
    public static void main(String[] args) {
        //the three pole for placing the pieces
        MyStack<Integer>rod1=new MyStack<>();
        MyStack<Integer>rod2=new MyStack<>();
        MyStack<Integer>rod3=new MyStack<>();
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("START");
        System.out.println("------------------------------------");
        //Number of disc
        System.out.print("Enter no of Disk: ");
        int n=sc.nextInt();
        fill(rod1,n);
        
         System.out.println("Rod 1: "+rod1.toString());
        System.out.println("Rod 2: "+rod2.toString());
        System.out.println("Rod 3: "+rod3.toString());
        System.out.println("");
        
        System.out.println("Press 'Enter' to continue!");
        sc.nextLine();
        sc.nextLine();
        
        //Calculate the minimum move
        int move=(int)Math.pow(2.0, n)-1;
        
        //Show the step and display visualisation
        recrusion(n,move,rod1,rod2,rod3);

    }
    
    public static void fill(MyStack<Integer>rod,int n)
    {
        for(int i=n;i>=1;i--)
        {
            rod.push(i);
        }
    }
    
    //We want to move A->C
    public static void recrusion(int n,int move,MyStack<Integer>rod1,MyStack<Integer>rod2,MyStack<Integer>rod3)
    {
        int count=move;
        //For even no the iteration must go this way A<->B,A<->C,B<->C
        if(n%2==1)
        {
            for (int i = 1; i <= move; i++) {
            if (i % 3 == 1) { // A<->C
                moveBetween(rod1, rod3);
            }
            else if (i % 3 == 2) { // A<->C
                moveBetween(rod1, rod2);
            }
            else if (i % 3 == 0) { // B<->C
                moveBetween(rod2, rod3);
            }
            count--;
            display(rod1,rod2,rod3,count,move);
            }
        }   
            else
            {
            for (int i = 1; i <= move; i++) {
            if (i % 3 == 1) { // A<->B
                moveBetween(rod1, rod2);
            }
            else if (i % 3 == 2) { // A<->C
                moveBetween(rod1, rod3);
            }
            else if (i % 3 == 0) { // B<->C
                moveBetween(rod2, rod3);
            }
            count--;
            display(rod1,rod2,rod3,count,move);
            }
        }
    }
    public static void moveBetween(MyStack<Integer>source,MyStack<Integer>destination)
    {

        //source pole is empty
        if(source.isEmpty())
        {
            source.push(destination.pop());
        }
        
        //if destination is empty
        else if(destination.isEmpty())
        {
            destination.push(source.pop());
        }
        
        //if source top disk>destination top disk
        else if(source.peek()<destination.peek())
        {
            destination.push(source.pop());
        }
        else if(destination.peek()<source.peek())
        {
            source.push(destination.pop());
        }
    
    }
    public static void display(MyStack<Integer>rod1,MyStack<Integer>rod2,MyStack<Integer>rod3,int count,int move)
    {
        System.out.println("Rod 1: "+rod1.toString());
        System.out.println("Rod 2: "+rod2.toString());
        System.out.println("Rod 3: "+rod3.toString());
        
        System.out.println();
        if(count==0)
        {
            System.out.println("End");
            System.out.println("Number of move: "+move);
        }
        else
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Press 'Enter' to continue!");
            sc.nextLine();
        }
        
    }
    
}
