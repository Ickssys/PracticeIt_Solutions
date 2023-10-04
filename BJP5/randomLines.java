public static void randomLines(){
    Random r = new Random();
    int lines = r.nextInt(6) + 5;
    for(int i = 0; i < lines; i++){
        int length = r.nextInt(81)+1;
        int lStart = 0;
        while(lStart < length){
            int ch = r.nextInt(26) + 97;
            System.out.print((char)ch);
            lStart++;
        }
        System.out.println();
    }
    
}