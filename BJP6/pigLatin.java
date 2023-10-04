public static void pigLatin(Scanner input){
    while(input.hasNextLine()){
        String line = input.nextLine();
        Scanner token = new Scanner(line);
        while(token.hasNext()){
            String word = token.next();
            word = word.toLowerCase();
            if(word.startsWith("a") || word.startsWith("e")
                || word.startsWith("i") || word.startsWith("o") || word.startsWith("u")){
                    word += "yay";
                }else{
                    word = word.substring(1) + word.charAt(0) + "ay";
                }
                System.out.print(word + " ");
            }
            System.out.println();
        }
    }