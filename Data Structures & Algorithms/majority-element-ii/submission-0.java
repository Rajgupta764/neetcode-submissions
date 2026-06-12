class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        int count1 = 0, count2 = 0;
        int candidate1 = 0, candidate2 = 0;
        
        // Step 1: Find potential candidates
        for(int num : nums){
            
            if(num == candidate1){
                count1++;
            }
            else if(num == candidate2){
                count2++;
            }
            else if(count1 == 0){
                candidate1 = num;
                count1 = 1;
            }
            else if(count2 == 0){
                candidate2 = num;
                count2 = 1;
            }
            else{
                count1--;
                count2--;
            }
        }
        
        // Step 2: Reset counts
        count1 = 0;
        count2 = 0;
        
        // Step 3: Verify candidates
        for(int num : nums){
            if(num == candidate1) count1++;
            else if(num == candidate2) count2++;
        }
        
        List<Integer> list = new ArrayList<>();
        int n = nums.length;
        
        if(count1 > n/3) list.add(candidate1);
        if(count2 > n/3) list.add(candidate2);
        
        return list;
    }
}
