import java.util.Arrays;
 
public class Even {
 
   public static void main(String[] args) {
      int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
      int evenNums = 0;
      int n = nums.length;
        for (int i = 0; i < n; i++) {
             if(nums[i]%2 == 0){
                evenNums++;
            }
        }
      int [] nums2 = new int[evenNums];
        int index = 0;
        for (int i = 0; i < n; i++) {
             if(nums[i]%2 == 0){
                nums2[index] = nums[i];
                index++;
            }
        }
      System.out.println(Arrays.toString(nums2));
   }
    
}