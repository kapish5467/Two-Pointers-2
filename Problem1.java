// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
    //replace elements with j if the count of the element is<=2

// Your code here along with comments explaining your approach
class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums==null || nums.length==0)
            return 0;
        int j=1;
        int count=1;
       for(int i=1;i<nums.length;i++)
       {
           if(nums[i]==nums[i-1])
               count++;
           else
               count=1;
           if(count<=2)
           {
               nums[j]=nums[i];
               j++;
           }
       }
        return j;
        
        }        
    }
    