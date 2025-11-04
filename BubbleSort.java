
import com.sun.jdi.PathSearchingVirtualMachine;

public class BubbleSort {
     public void printArray( int[]arr){
        int n = arr.length;// n is local var
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " " );
            
            
        }
         System.out.println();

     }

     public  void sort(int []arr){
       int n = arr.length;
       boolean IsSwapped;// starts boolean

       for(int i = 0;i<n-1;i++){
        IsSwapped = false;
        for(int j = 0;j<n-1-i; j++){
            if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                IsSwapped = true; 
            }
        }
        if(IsSwapped == false){// if already swapped
            break;
        }
    }
}
       
      public static void main(String[] args){
        int [] arr = {5,1,2,9,10,7,12,6};
       BubbleSort obj = new BubbleSort();
       obj.sort(arr);
       obj.printArray(arr);

     }
    
}
// because you need only n - 1 passes to fully sort.

//n - 1 - i → because after each pass, the last i elements are already sorted, so no need to check them again.