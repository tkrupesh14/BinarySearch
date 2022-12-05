public class Main {
    public static void main(String[] args) {
        int[] arr = {2,3,4,16,18,34,56};
        int target = 3;
        int ans = BinarySearch(arr, target);
        System.out.println(ans);
    }
    //return the index
    static int BinarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while (start <= end ){
            //find the middle element
            int mid = start+ (end-start)/2;

            if(target < arr[mid]){
                end = mid-1;
            }
            else if(target > arr[mid]){
                start = mid+1;
            }else{
                return mid;

            }
        }
        return -1;
    }
}