public static void coinFlip(Scanner input){
    while(input.hasNextLine()){
        int headsCount = 0;
        int totalFlips = 0;
        String line = input.nextLine();
        Scanner token = new Scanner(line);
        while(token.hasNext()){
            String flip = token.next();
            totalFlips++;
            if(flip.equalsIgnoreCase("H")){
                headsCount++;
            }
        }
        //no more tokens at line
        double avgHeads = (double) headsCount / totalFlips * 100;
        System.out.printf("%d heads (%.1f%%)", headsCount, avgHeads);
        System.out.println();
        if(avgHeads > (0.5 * 100)){
            System.out.println("You win!");
        }
        System.out.println();
    }
}