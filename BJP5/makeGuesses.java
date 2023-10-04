public static void makeGuesses(){
    Random r = new Random();
    int guess = r.nextInt(50) + 1;
    System.out.println("guess = " + guess);
    int guesses = 1;
    while(guess <= 48){
        guess = r.nextInt(50) + 1;
        System.out.println("guess = " + guess);
        guesses++;
    }
    System.out.println("total guesses = " + guesses);
}