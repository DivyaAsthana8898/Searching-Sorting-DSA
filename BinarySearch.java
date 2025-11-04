
import com.sun.jdi.PathSearchingVirtualMachine;

public class BinarySearch {
    public int bsearch(int[]nums ,int key){      
         int low = 0;
        int high = nums.length-1;
        while(low <= high){
            int mid = (low + high) / 2; // int mid = low  - (high - low ) / 2;
            if(nums[mid] == key){ 
                return mid;
            }
            if(key <= mid){
                high = mid - 1;
            } else{
                    low = mid + 1;
                }
            }  
            return -1;// return low;
        }
         
         
    
         public static void main(String [] args){
            int [] nums = {10 ,20,30,40,50,60,70,80};
            BinarySearch obj = new BinarySearch();
            System.out.println(obj.bsearch(nums, 40));
         }
    }
    

