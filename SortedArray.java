import java.util.*;
public class SortedArray {
    public static int[] getIntegers(int len){
        Scanner sc = new Scanner(System.in);
        int[] newArray = new int[len];
        for(int i=0;i<len;i++){
            newArray[i] = sc.nextInt();
        }
        return newArray;
    }
    public static void printArray(int[] arr){
        for(int i = 0;i<arr.length;i++){
            System.out.println("Element "+i+" contents "+arr[i]);
        }
    }
    public static int[] sortIntegers(int[] arr){
        int[] reverseArray = new int[arr.length];
        Arrays.sort(arr);
        
        for(int i = 0;i<arr.length;i++){
            reverseArray[i] = arr[arr.length -1-i];
        }
        
        // Arrays.sort(arr);
        // int temp;
        // for(int i=0;i< arr.length/2;i++){
        //     temp = arr[i];
        //     arr[i] = arr[arr.length-1-i];
        //     arr[arr.length-1-i]= temp;
        // }
        return reverseArray;
    }
}
    
 
