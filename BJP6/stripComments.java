public static void stripComments(Scanner input) {
    boolean inComment = false;
    while (input.hasNextLine()) {
        String line = input.nextLine();
        if(!line.startsWith("/*")){
            if(!line.contains("/*") && line.endsWith("*/")){
                line = "";
            }
            if(line.contains("//")){
                line = line.substring(0, line.indexOf("/")); 
            }
            if(line.contains("/*") && line.contains("*/")){
                line = line.substring(0, line.indexOf("/*")) + line.substring(line.indexOf("*/") + 2);
            }
            System.out.println(line);
        }
    }
}
        