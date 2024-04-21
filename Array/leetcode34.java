import java.util.Arrays;

public class leetcode34 {
    public static int[] searchRange(int[] nums, int target) {
        int [] result = new int[2];
        for(int i=0; i<nums.length; i++){
            if(nums[i] == target){
                result[0] = i;
                break;
            }
            else {
                result[0] = -1;
                result[1] = -1;
            }
        }
        for(int j=nums.length-1; j>=0; j--){
            if(nums[j] == target){
                result[1] = j;
                break;
            }
        }
        return result;

    }

    public static void main(String[] args) {
        int [] nums = { 5, 7, 7, 8, 8, 10};
        int target = 8;
        System.out.println(Arrays.toString(searchRange(nums,target)));

    }
}