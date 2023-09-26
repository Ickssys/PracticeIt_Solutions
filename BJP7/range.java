public static int range(int[] a){
    int smallest = a[0];
    int largest = a[0];
    for(int i = 1; i < a.length; i++){
        if(a[i] < smallest){
            smallest = a[i];
        }else if(a[i] > largest){
            largest = a[i];
        }
    }
    return Math.abs(largest - smallest + 1);
}