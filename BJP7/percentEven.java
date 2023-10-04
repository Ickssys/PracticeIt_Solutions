public static double percentEven(int[] a){
    int count = 0;
    int length = a.length;
    for(int i = 0; i < length; i++){
        if(a[i] % 2 == 0){
            count++;
        }
    }
    return length < 1 ? 0.0 : (double) count / length * 100.0;
}