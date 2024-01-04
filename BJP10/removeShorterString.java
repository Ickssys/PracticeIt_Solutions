public static void removeShorterStrings(ArrayList<String> list){
    for(int i = 0; i < list.size() - 1; i++){
       String first = list.get(i); 
       String second = list.get(i + 1);
       if(first.length() <= second.length()){
        list.remove(i);
       }else{
        list.remove(i + 1);
       }
    }
}
