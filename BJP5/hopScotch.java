public static void hopscotch(int n){
    System.out.println("   " + "1");
    int add = 0;
    for(int i = 0; i < n; i++){
        System.out.println((i + 2 + add) + "     " + (i + 3 + add));
        System.out.println("   " + (i + 4 + add));
        add += 2;
    }
}