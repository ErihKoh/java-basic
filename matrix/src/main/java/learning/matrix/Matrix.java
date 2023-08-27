
public class BinarySearch {

	public static void main(String[] args) {

	    int data[] = { 3, 6, 7, 10, 34, 56, 60, 71, 85, 98 };
	    int numberToFind = 10;
            int firstIdx = 0;
            int lastIdx = data.length - 1;
            
            int index = binarySearch(data, numberToFind, firstIdx, lastIdx);
            
           
            System.out.print(index);
            
      
	}
        
        public static int binarySearch(int[] nums, int target, int left, int right) {
            
            int mid = (left + right) / 2;
            if (target == nums[mid]) {
                System.out.print(mid);
                return mid;
            }
            else if (target > nums[mid]) {
                binarySearch(nums, target, mid, right);
            }
            else if (target < nums[mid]) {
                binarySearch(nums, target, left, mid);
            }
            
            return -1;
            
        }

}
