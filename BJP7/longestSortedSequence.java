public static int longestSortedSequence(int[] a){
    int consecutives = 1;
    int longest = 1;
    for(int i = 0; i < a.length - 1; i++){
        if(a[i] <= a[i+1]){
            consecutives++;
            if(consecutives > longest){
                longest = consecutives;
            }
        }else{
            consecutives = 1;
        }
        
    }
    return a.length < 1 ? 0 : longest;
}