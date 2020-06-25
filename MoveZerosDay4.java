// Input: [0,1,0,3,12]
// Output: [1,3,12,0,0]

class MoveZeroesDay4 {

    // first solution with using extra space
    public void moveZeroes1(int[] nums) {
        int[] resultArray = new int[nums.length];
        int index = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != 0)
            {
                resultArray[index] = nums[i];
                index++;
            }
        }
        for(int i=0;i<resultArray.length;i++){
            nums[i] = resultArray[i];
        }
        System.out.println(Arrays.toString(nums));
    }

    // second solution space: O(1) and time O(n)
    public void moveZeroes2(int[] nums) {
        int indexNonZero = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[indexNonZero] = nums[i];
                indexNonZero++;
            }
        }

        for (int i = indexNonZero; i < nums.length; i++) {
            nums[i] = 0;
        }
        System.out.println(Arrays.toString(nums));
    }
}