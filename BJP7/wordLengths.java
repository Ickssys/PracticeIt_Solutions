public static void wordLengths(Scanner in) {
    int[] lengths = new int[81];
    while (in.hasNext()) {
        String word = in.next();
        lengths[word.length()]++;
    }
    for (int i = 0; i < lengths.length; i++) {
        if (lengths[i] > 0) {
            System.out.printf("%d: %d\t", i, lengths[i]);
            for (int j = 0; j < lengths[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}