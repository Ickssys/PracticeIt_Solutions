public static final int max = 60;
public static void wordWrap2(Scanner input, PrintStream output){
    while(input.hasNextLine()){
        String line = input.nextLine();
        int lineLength = line.length();
        int begin = 0;
        int end = max;
        //todo use substring to extract pieces of the string upto 60 chars
        while(lineLength > 60){
            output.println(line.substring(begin, end));
            begin += max;
            end += max;
            lineLength -= max;
        }
        //todo print starting from 60
        output.println(line.substring(begin));
    }
}