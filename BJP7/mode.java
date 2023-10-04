public static int mode(int[] a){
    int[] arr = new int[100+1];
    for(int i = 0; i < a.length; i++){
        arr[a[i]]++;
    }
    int mode = 0;
    int count = arr[0];
    for(int i = 1; i < arr.length; i++){
        if(arr[i] > count){
            count = arr[i];
            mode = i;
        }
    }
    
    return mode;
}