public static void removeDuplicates(ArrayList<String> list){
    for(int i = 0; i < lsit.size() - 1; i++){
        if(list.get(i).equals(list.get(i + 1))){
            list.remove(i + 1);
            i--;
        }
    }
}