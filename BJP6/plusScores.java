public static void plusScores(Scanner input){
    while(input.hasNextLine()){
        //new line
        int plusCount = 0;
        int totalCharacters = 0;
        String name = input.nextLine();
        String plusMinus = input.nextLine();
        
        for(int i = 0; i < plusMinus.length(); i++){
            totalCharacters++;
            if(plusMinus.charAt(i) == '+'){
                plusCount++;
            }
        }
        double plusPercent = (double) plusCount / totalCharacters * 100;
        System.out.printf("%s: %.1f%% plus", name, plusPercent);
        System.out.println();
    }
    //no more lines
}