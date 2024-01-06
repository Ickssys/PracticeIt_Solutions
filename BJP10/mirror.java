public static void mirror(ArrayList<String> list) {
    int originalSize = list.size();
    int j = list.size() - 1;
    for (int i = 0; i < originalSize; i++) {
        list.add(list.get(j - i));
    }
}
