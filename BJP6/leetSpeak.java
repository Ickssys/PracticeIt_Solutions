public static void leetSpeak(Scanner input, PrintStream output) {
    while (input.hasNextLine()) {
        String line = input.nextLine();
        Scanner token = new Scanner(line);
        while (token.hasNext()) {
            String word = token.next();
            word = word.replace("o", "0");
            word = word.replace("l", "1");
            word = word.replace("e", "3");
            word = word.replace("a", "4");
            word = word.replace("t", "7");
            if (word.endsWith("s")) {
                word = word.substring(0, word.length()-1) + "Z";
                
            }
            word = "(" + word + ")";
            output.print(word + " ");
        }
        output.println();
    }
}