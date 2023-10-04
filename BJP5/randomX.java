public static void randomX() {
    Random r = new Random();
    int num;
    do {
        num = r.nextInt(15) + 5;
        for (int i = 0; i < num; i++) {
            System.out.print("x");
        }
        System.out.println();
    }while(num < 16);
}


//this is variation of the fence post problem.