public static int lastIndexOf(int[] a, int x){
    for(int i = a.length-1; i >= 0; i--){
        if(a[i] == x){
            return i;
        }
    }
    return -1;
}

//instead of looping left to right - we loop right to left