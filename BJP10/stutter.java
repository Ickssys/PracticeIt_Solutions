public static void stutter(ArrayList<String> list, int k){
    if(k <= 0){
        list.clear();
    }
    //we can use the indices to achieve same outcome
    for(int i = 0; i < list.size() - 1; i += k){
        for(int j = i + 1; j < i + k; j++){
            list.add(j, list.get(i));
        }
    }
}