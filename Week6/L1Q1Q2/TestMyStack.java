public class TestMyStack {
    public static void main(String[] args) {
    //Character stack
  MyStack <Character>Cstack=new MyStack<>();
  
  //add a,b,c into stack
  Cstack.push('a');
  Cstack.push('b');
  Cstack.push('c');
  
  //print stack
   System.out.println(Cstack.toString());
   
   //check if b and k are in the stack
   System.out.println("\'b\' is in the stack? "+Cstack.search('b'));
   System.out.println("\'k\' is in the stack? "+Cstack.search('k'));
   
  System.out.println("");
   //Integer Stack
   MyStack<Integer> IStack=new MyStack<>();
   
   //add 1,2,3
   IStack.push(1);
   IStack.push(2);
   IStack.push(3);
  
   //print stack
   System.out.println(IStack.toString());
   
   //check if 6 in in the stack
   System.out.println("\'6\' is in the stack? "+Cstack.search('6'));
}

}
