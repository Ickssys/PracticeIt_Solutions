public static void minToFront(ArrayList<Integer> list){
    int min = list.get(0);
    for(int i = 1; i < list.size(); i++){
        min = Math.min(min, list.get(i));
    }
    int idx = list.indexOf(min);
    list.remove(idx);
    list.add(0, min);
}