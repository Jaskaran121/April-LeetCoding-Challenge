// Input: 19
// Output: true
// Explanation: 
// 12 + 92 = 82
// 82 + 22 = 68
// 62 + 82 = 100
// 12 + 02 + 02 = 1

class HappyNumberDay2 {
    public boolean isHappy(int n) {
        int sum = 0;
        HashSet<Integer> set = new HashSet<>();
        while(sum != 1)
        {
            sum = 0;
            // Calculating sum by squaring each digit of a number.
            while(n != 0)
            {
                int rem = n % 10;
                sum = sum + (rem*rem);
                n = n / 10;
            }
            
            if(set.contains(sum))
                return false;
            else 
                set.add(sum);
            n = sum;
        }
        return sum == 1;
    }
}