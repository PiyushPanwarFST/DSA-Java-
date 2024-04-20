public class TwoSum {
    public static int[] TwoSum(int []array , int target){
        int n = array.length;
        int left = 0;
        int right = n-1;
        int [] ans = new int [2];

        while(left<right){
            int sum = array[left]+array[right];
            if(sum==target){
                ans[0]=left;
                ans[1]= right;

               return ans;
            }
            else if(sum>target){
                right-- ;
            }
            else{
                left++ ;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int [] array = {2,7,11,15};
        int target = 9;
        int []ans = TwoSum(array,target);

        for( int value: ans){
            System.out.print(value + " ");
        }
    }
}
