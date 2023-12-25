public static void swapPairs(ArrayList<String> list){
    for(int i = 0; i < list.size() / 2; i++){
        String temp = list.get(2 * i);
        list.set(2 * i, list.get(2 * i + 1));
        list.set(2 * i + 1, temp);
    }
    System.out.println(list);
}