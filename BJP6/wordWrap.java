public static void wordWrap(Scanner input){
    while(input.hasNextLine()){
        String line = input.nextLine();
        int lineLength = line.length();
        int begin = 0;
        int end = 60;
        //todo use substring to extract pieces of the string upto 60 chars
        while(lineLength > 60){
            System.out.println(line.substring(begin, end));
            begin += 60;
            end += 60;
            lineLength -= 60;
        }
        //todo print starting from 60
        System.out.println(line.substring(begin));
    }
}