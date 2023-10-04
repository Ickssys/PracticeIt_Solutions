public static boolean contains(int[] a1, int[] a2){
    for(int i = 0; i <= a1.length - a2.length; i++){
        int count = 0;
        for(int j = 0; j < a2.length; j++){
            if(a1[j + i] == a2[j]){
                count++;
            }
        }
        if(count == a2.length){
            return true;
        }
    }
    return false;
}