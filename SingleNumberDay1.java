// Input: [2,2,1]
// Output: 1

class SingleNumberDay1 {

    // Using extra memory time: O(n) space: O(n)
    public int singleNumber1(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();
        
        for(int i=0;i<nums.length;i++){
            if(hashSet.contains(nums[i])){
                hashSet.remove(nums[i]);
            } else
                hashSet.add(nums[i]);
        }
        
        return hashSet.iterator().next();
    }

    // With out using extra memory time: O(n) space: O(1)
    public int singleNumber2(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }
}