public class SearchingLinearSearch {
    public int search(int[] arr ,int n ,int key){
        for(int i = 0;i<n;i++){
            if(arr[i] == key){
                return i;
            }

        }
        return -1;// else return -1
    }
     public static void main(String[] args) {
         int[] arr = {10,20,30,40,50,60,70,80};
         SearchingLinearSearch obj = new SearchingLinearSearch();
         System.out.println(obj.search(arr, arr.length, 70));
     }          //sout            //object.method(arguments);
    
}

    

