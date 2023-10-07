public static void xo(int n) {
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            if (i == j || (i + j) % (n-1) == 0) {
                System.out.print("x");
            } else {
                System.out.print("o");
            }
        }
        System.out.println();
    }
}