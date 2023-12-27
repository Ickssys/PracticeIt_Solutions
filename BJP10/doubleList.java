public static void doubleList(ArrayList<String> list){
    //we need to save size since "add" increases the list size;
    int size = list.size();
    for(int i = 0; i < size; i++){
        String word = list.get(i);
        list.add(i + 1, word);
    }
    /* We can also approach this problem like a fence post problem
     * and print the last item after the loop finishes.
     */
}