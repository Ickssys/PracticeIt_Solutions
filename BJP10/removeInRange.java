public static void removeInRange(ArrayList<Integer> list, int e, int start, int end){
    for(int i = start; i < end; i++){
        if(list.get(i) == e){
            list.remove(i);
            i--;
            end--;
        }
    }
}