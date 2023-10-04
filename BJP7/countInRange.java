public static int countInRange(int[] a, int min, int max){
    int count = 0;
    for(int i = 0; i < a.length; i++){
        if(min <= a[i] && a[i] <= max){
            count++;
        }
    }
    return count;
}