/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q3;

import java.util.Comparator;
import java.util.PriorityQueue;

public class ticketSyetem {
    public static void main(String[] args) {
        PriorityQueue<Integer>queue=new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
     int[]arr={4,3,8,9,0,1};
     int k=3;
     int[][]arr2D=new int[arr.length-k+1][k];
     int[]result=new int[arr.length-k+1];
     for(int i=0;i<arr.length-k+1;i++)
     {
         for(int j=i,z=0;z<k;j++,z++)
         {
             arr2D[i][z]=arr[j];

         }
     }
     
     for(int i=0;i<arr.length-k+1;i++)
     {

         System.out.print("max(");
         for(int j=0;j<k;j++)
         {
             queue.offer(arr2D[i][j]);
             System.out.print(arr2D[i][j]+", ");
         }
         System.out.println(")="+queue.peek());
         result[i]=queue.peek();
         for(int j=i;j<k;j++)
         {
             queue.remove();
         }

     }

        System.out.print("Hence we get arr = [");
        for(int i=0;i<arr.length-k+1;i++)
     {

         System.out.print(result[i]+ ", ");

     }
        System.out.print("]");
     
    }
}


