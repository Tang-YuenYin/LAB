
public class Tester {
   public static void main(String[] args) {
        int[] arr = {45, 7, 2, 8, 19, 3};

       Sort result = new Sort();
       
        // Q1
        result.selectionSortSmallest(arr);

        System.out.println("selectionSortSmallest(int[] arr)");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Q2
        result.selectionSortLargest(arr);

        System.out.println("selectionSortLargest(int[] arr)");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    } 
}
