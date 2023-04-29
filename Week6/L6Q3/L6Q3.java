public class L6Q3 {
    public static void main(String[] args) {
   MyStack<Integer>S=new MyStack<>();
   
   for(int i=0;i<10;i++)
   {
       S.push(i);
   }
   
        System.out.println("Sum: "+sum(S));;
}
    public static int sum(MyStack<Integer>S)
    {
        int sum=0;
       if(S.isEmpty())return 0;
       else
       {
           while(!S.isEmpty())
           {
              sum+= S.pop();
           }
           return sum;
       }
    }
    
}
