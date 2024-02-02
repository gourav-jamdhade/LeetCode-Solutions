// Video Link: https://youtu.be/4LTbJiIdf5Y

class Solution {
    public int[] twoSum(int[] nums, int target) {

    //    //Brute force

    //    //Time Complexity -> O(n^2)
    //    //Space complexity -> O(1)
    //    int n = nums.length; //array length

    //    for(int i = 0; i < n; i++){
    //        for(int j = i + 1; j < n; j++){
    //            if(nums[i] + nums[j] == target){
    //                return new int[]{i,j};
    //            }
    //        }
    //    } 

    //    return new int[2];//return an empty array

        Using HashMap
        Time Complexity -> O(n)
        Space complexity -> O(n) - for hashmap
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>(); //map for nums[i], i

        for(int i = 0; i < n; i++){
            int complement = target - nums[i];

            //check if the MAP contains the complement
            if(map.containsKey(complement)){
                //if yes then return i, the index of complement from the map
                return new int[]{i, map.get(complement)};
            }

            //then put the nums[i], i in the Map
            map.put(nums[i], i);
        }

        return new int[2]; //return a blank array;

       
    }
}
