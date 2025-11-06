public class MergeSort {
    public int[] merge (int[]arr1 ,int[]arr2, int n ,int m){
        int i = 0;
        int j = 0;
        int k = 0;
        int []result = new int[n+m];
        while(i < n && j < m){
            if(arr1[i] < arr2[j]){
                result[k] = arr1[i];
                i++;
            }else{
               result[k] = arr2[j];
               j++;
            }
            k++;
        }
         while(i < n ){// IN CASE OF LEFTOVER  PART IN THAT array
            result[k] = arr1[i];
            i++;
            k++;
         }
          while (j < m) {// IN CASE OF LEFTOVER  PART IN THAT array
            result[k] = arr2[j];
            j++;
            k++;

            
          }
                  return result;
            }
        
         public void display(int []arr){
            int n = arr.length;
            for(int i = 0; i<n; i++){
                System.out.print(arr[i] + " ");
            }
             System.out.println();
         }
          public static void main(String[] args) {
            MergeSort obj =new MergeSort();
            int []arr1 = {0,1,8,10};
            int []arr2 = {2,4,11,15};
            obj.display(arr1);
            obj.display(arr2);
            int []result = obj.merge(arr1, arr2, arr1.length, arr2.length);
            obj.display(result);

          }
        }

    

 

