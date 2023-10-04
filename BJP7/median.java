public static int median(int[] a){
    Arrays.sort(a);
    return a[(a.length-1)/ 2];
}