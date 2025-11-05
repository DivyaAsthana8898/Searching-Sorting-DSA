public class SelectionSort {
    public void display(int []arr){
      int n = arr.length;
        for (int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        } 
         System.out.println();
        }
      public  void Sort(int[]arr){
        int n = arr.length;
        for(int i = 0;i<n-1; i++){
            int min = i;
            for(int j=i+1;j<n;j++){
                if(arr[j] < arr[min]){// agr age wla piche wle se bda hai to ye kro;
                 min = j;
                }
            }
             int temp = arr[min];
             arr[min] = arr[i];
             arr[i] = temp;

        }
     }
      public static void main(String[] args){
        int []arr = {5,1,2,9,10};
        SelectionSort obj = new SelectionSort();
        System.out.println("ARRAY BEFORE SORTING ");
        obj.display(arr);
        System.out.println("After Sorting");
        obj.Sort(arr);
        obj.display(arr);
      }
      
    }
     
    
    

