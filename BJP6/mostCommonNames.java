public static int mostCommonNames(Scanner input) {
    int uniqueName = 0;
    
    while (input.hasNextLine()) {
        int count = 1;
        int maxCount = count;
        String line = input.nextLine();
        Scanner token = new Scanner(line);
        String previousName = token.next();
        uniqueName++;
        String mostCommonName = previousName;
        while (token.hasNext()) {
            String name = token.next();
            if(name.equals(previousName)){
                count++;
            }else{
                uniqueName++;
                if(count > maxCount){
                    mostCommonName = previousName;
                    maxCount = count;
                }
                count = 1;
            }
            previousName = name;
        }
        //line has no more tokens
        if(count > maxCount){
            mostCommonName = previousName;
        }
        System.out.println("Most common: " + mostCommonName);
    }
    return uniqueName;
}