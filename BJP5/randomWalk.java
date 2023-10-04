public static void randomWalk() {
    Random r = new Random();
    int pos = 0;
    int max = 0;
    System.out.println("position = " + pos);
    while (pos != 3 && pos != -3) {
        int step = 0;
        boolean takeStep = r.nextBoolean();
        if(!takeStep){
            step = 1;
        }else{
            step = -1;
        }
        
        pos += step;
        
        max = Math.max(pos, max);
        
        System.out.println("position = " + pos);
    }
    System.out.println("max position = " + max);
}