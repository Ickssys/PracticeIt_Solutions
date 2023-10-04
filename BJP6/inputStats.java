public static void inputStats(Scanner input){
    String longestLine = "";
    int longestLineLength = 0;
    int numberOfLines = 0;
    while(input.hasNextLine()){
        int tokens = 0, wordLongestLength = 0;
        String line = input.nextLine();
        int lineLength = line.length();
        if(lineLength > longestLineLength){
            longestLineLength = lineLength;
            longestLine = line;
        }
        numberOfLines++;
        Scanner token = new Scanner(line);
        while(token.hasNext()){
            String word = token.next();
            tokens++;
            int wordLength = word.length();
            if(wordLength > wordLongestLength){
                wordLongestLength = wordLength;
            }
        }
        //no more tokens
        System.out.println("Line " + numberOfLines + " has " + tokens + " tokens " + "(longest = " + wordLongestLength + ")");
    }
    //no more lines
    System.out.println("Longest line: " + longestLine );
}