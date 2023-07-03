class Solution {
    public int majorityElement(int[] nums) {
        int counter=0;
        int val=0;
        for(int i=0; i<nums.length;i++)
        {
            if(counter==0)
            {
                val=nums[i];
                counter = counter + 1;
            }
            else if(val != nums[i])
            {
                counter-=1;

            }
            else{
                counter+=1;
            }
        }
        return val;
    }
}