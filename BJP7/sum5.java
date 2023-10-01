public static int[] sum5(int[] nums){
    int[] result = new int[5];
    for(int i = 0; i < nums.length; i++){
        result[i % 5] += nums[i];
    }
    return result;
}