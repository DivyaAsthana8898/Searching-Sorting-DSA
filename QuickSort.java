public class QuickSort {
    static int partition(int [] arr,int low,int high){
         int pivot = arr[high];
         int i = 0;
         int j = 0;
         while(i < high){
            if(arr[i] <= pivot){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;// swap and move j pointer
            }
            i++;// all are less than pivot then move 
         }
          return j-1; // these all return return j-1 are all sorted 
        }
                 
        static void sort(int[]arr ,int low ,int high){
          if(low < high ){     // condition
            int p = partition(arr,low,high);// partion the subarrays acc to the pivot ;
            sort(arr,low,p-1); // for left Sub array;

            sort(arr,p+1,high); // for //right Sub array;

          } 
        }
         public static void main(String[] args) {
            int[]arr = {4,5,6,7};
            int n = arr.length;
            sort(arr,0,n-1);// calling sort function
            System.out.println("Sorted array is : ");
            for(int nums: arr){
                System.out.print(  nums + " ");
            }
         }
    }
    

