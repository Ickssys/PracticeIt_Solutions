public static int priceIsRight(int[] bids, int price){
    int min = Integer.MAX_VALUE;
    int el = 0;
    for(int i = 0; i < bids.length; i++){
        int diff = price - bids[i];
        if(diff >= 0 && diff < min){
            min = diff;
            el = bids[i];
        }
    }
    return el == 0 ? -1 : el;
}