import java.util.Scanner;

public class L6Q4 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String: ");
        String before=sc.nextLine();
        
        MyStack <Character> S=new MyStack();
        for(int i=0;i<before.length();i++)
        {
            S.push(before.charAt(i));
        }
        
        String after="";
        while(!S.isEmpty())
        {
            after+=S.pop();
        }
        
        if (before.equalsIgnoreCase(after)) {
            System.out.println("Palindrome!");
        }
        else {
            System.out.println("Not a palindrome");
        }
    }
    
}
