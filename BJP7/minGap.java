public static int minGap(int[] a) {
    // I can sort the array and check the min gap
    if(a.length < 2){
        return 0;
    }
    int min = a[1] - a[0];
    for (int i = 1; i < a.length - 1; i++) {
        int gap = a[i + 1] - a[i];
        if(gap < min){
            min = gap;
        }
    }
    return min;
}