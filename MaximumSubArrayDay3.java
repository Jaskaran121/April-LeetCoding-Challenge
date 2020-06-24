// Input [-2,1,-3,4,-1,2,1,-5,4]
// Output 6
class MaximumSubArrayDay3 {

    // Solution1 O(n^2)
    public int maxSubArray1(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum;
        for(int i=0;i<nums.length;i++){
            sum = 0;
            for(int j=i;j<nums.length;j++){
                sum = sum + nums[j];
                if(sum>max){
                    max = sum;
                }
            }
        }
        return max;
    }

    // Solution2 O(n)
    public int maxSubArray2(int[] nums) {
        int max_sum = Integer.MIN_VALUE;
        int cur_sum = 0;
        for(int i=0;i<nums.length;i++){
            cur_sum += nums[i];
            max_sum = Math.max(max_sum,cur_sum);
            cur_sum = Math.max(cur_sum,0);
        }
        return max_sum;
    }
}