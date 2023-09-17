public static void wordWrap3(Scanner input) throws FileNotFoundException {
        // Scanner input = new Scanner(new File("input.txt"));
        while(input.hasNextLine()){
            String line = input.nextLine();
            while(line.length() > 60){
                //if last char is space print the string upto char;
                if(line.charAt(60) == ' '){
                    System.out.println(line.substring(0, 60));
                    //update line to start one greater than space char;
                    line = line.substring(61);
                }else{
                    //let idx = the index of the last space char
                    int idx = line.substring(0,60).lastIndexOf(" ");
                    System.out.println(line.substring(0,idx));
                    //update line to start at one greater than space char;
                    line = line.substring(idx + 1);
                }
            }
            System.out.println(line);
        }
    }    

    // public static void wordWrap3(Scanner input){
    // }
}
