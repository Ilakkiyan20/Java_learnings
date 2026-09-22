import java.util.Arrays;
public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(arr));
        System.out.println(arr.length);
        
     
        int[] arr2={1,2,3,4,5};
        System.out.println(Arrays.equals(arr1,arr2));
        System.out.println(Arrays.binarysearch(arr,3));

        Arrays.sort(arr); 
        System.out.println("After sort: " + Arrays.toString(arr)); 

        Arrays.fill(arr, 3); 
        System.out.println("After fill: " + Arrays.toString(arr)); 

       
    }
}
