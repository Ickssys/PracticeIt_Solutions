public static void filterRange(ArrayList<Integer> list, int min, int max){
    //we can also loop right to left to achieve same outcome
    for(int i = 0; i < list.size(); i++){
        if(min <= list.get(i) && list.get(i) <= max){
            list.remove(i);
            i--;
        }
    }
}