public class InsertionSort {
    public void display(int []arr){
        int n = arr.length;
        for(int i =0;i<n ;i++){
             System.out.print(arr[i] + " ");
        } 
        System.out.println();           
        }
        public void sort (int[]arr){
            int n = arr.length;
            for (int i = 0; i < n ; i++) {
                int temp = arr[i];
                int j = i-1;
                while(j>=0  && arr[j] > temp){// arr[j] < temp will provide decreasing order
                    arr[j+1] = arr[j];
                    j = j-1;
                }
                 arr[j+1] = temp;
                 
                
            }
        }
         public static void main(String[] args) {
            int []arr = {1,5,9,2,10};
            InsertionSort obj = new InsertionSort();
            obj.sort(arr);
            obj.display(arr);
         }
        }
         
    
    

