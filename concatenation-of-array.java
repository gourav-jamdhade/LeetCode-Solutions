class Solution {
    public int[] getConcatenation(int[] nums) {

        // //Using two for loops

        // //TC -> O(n)
        // //SC -> O(n)
        // int n = nums.length;
        // int resArr[] = new int[2*n];//the resultant array

        // for(int i = 0; i < n; i++){
        //     resArr[i] = nums[i];
        // }

        // //2nd loop

        // for(int i = 0; i < n; i++){
        //     resArr[i + n] = nums[i];//imp logic
        // }

        // return resArr;


        //Using Single loop

        //TC -> O(n)
        //SC -> O(n)
        int n = nums.length;
        int resArr[] = new int[2*n];

        for(int i = 0; i < 2*n; i++){
            if(i/2 < n && i < n){
                resArr[i] = nums[i];
            }else{
                resArr[i] = nums[i - n];
            }
        }

        return resArr;
    }
}
