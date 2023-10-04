public static boolean isUnique(int[] a){
    Arrays.sort(a);
    for(int i = 0; i < a.length-1; i++){
        if(a[i] == a[i+1]){
            return false;
        }
    }
    return true;
}