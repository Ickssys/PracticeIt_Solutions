public static int[] append(int[] a1, int[] a2){
    int[] nArray = new int[a1.length + a2.length];
    for(int i = 0; i < a1.length; i++){
        nArray[i] = a1[i];
    }
    for(int i = a1.length; i < nArray.length; i++){
        nArray[i] = a2[i - a1.length];
    }
    return nArray;
}