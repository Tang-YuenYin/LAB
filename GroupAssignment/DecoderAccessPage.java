
package Encryption;

import static WuKingdom.WuKingdomHierarchy.WKHselectionBar;
import static WuKingdom.WuKingdomHierarchy.line;
import java.util.ArrayList;
import java.util.Scanner;

public class DecoderAccessPage {
   public static void DecoderInterface()
   {
       boolean stay=true;
       Decryption d=new Decryption();
       while(stay)
       {
           if(!stay)
           {
               return ;
           }  
        Scanner sc=new Scanner(System.in);
        System.out.println("Text: ");
        String text=sc.nextLine();
        //sc.nextLine();
        System.out.println("Shift: ");
        int shift=sc.nextInt();
        System.out.println("Decryption type:[1 for Decryption 1.0| 2 for Decryption 2.0 | 3 for Decryption 3.0]");
        int choice=sc.nextInt();
        sc.nextLine();
        System.out.println("Please enter secret key: ");
        String key=sc.nextLine();
        line();
        if(key.equals(d.getKey()))
        {
            System.out.println("Output:");
            if(choice==1)
            {
                System.out.println(d.CeasarCipher1(text,shift));
            }
            else if(choice==2)
            {
                System.out.println(d.CeasarCipher2(text,shift));
            }
            else if(choice==3)
                System.out.println(d.MorseCode(text,shift));
            else
            {
                System.out.println("Choice does not exist");
            }
        }
        line();
           System.out.println("Press Enter to continue");
           System.out.println("Press -1 to exit");
           String inout=sc.nextLine();
           line();
           
           if(inout.equals("-1"))
           {
               stay=false;
               return;
           }
       }
   }
   
   public static void main(String[] args) {
          System.out.println("Welcome to the Wu Kingdom War Strategy System");
          Scanner select=new Scanner(System.in);
          while(true)
          {
            line();
            System.out.println("1 Wu Kingdom's Hierarchy");
            System.out.println("2 Soldier's Arrangement");
            System.out.println("3 Borrowing Arrows with Straw Boats");
            System.out.println("4 Enemy Fortress Attack Simulation");
            System.out.println("5 Food Harvesting");
            System.out.println("6 Encrypted Text");
            System.out.println("7 Red Cliff on Fire");
            System.out.println("8 Engaging Cao Cao at Hua Rong Road");
            System.out.println("-1 To exit Interface");
            System.out.print("Please choose a function: ");
            int selection=select.nextInt();
            select.nextLine();
            line();
            if(selection==1)
            {
            WKHselectionBar();
            }
            else if(selection==6)
            {
              DecoderInterface();
            }
            else if(selection==-1)
            {
                break;
            }
          }
          System.out.println("Thank you for visiting wu Kingdom War Strategy System");
    }
   
     public static void line()
  {
      System.out.println("----------------------------------------------");
  }
}
