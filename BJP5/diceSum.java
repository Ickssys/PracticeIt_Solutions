public static void diceSum() {
    Scanner input = new Scanner(System.in);
    Random r = new Random();
    System.out.print("Desired dice sum: ");
    int desiredSum = input.nextInt();
    int firstDie = r.nextInt(6) + 1;
    int secondtDie = r.nextInt(6) + 1;
    int sum = firstDie + secondtDie;
    System.out.println(firstDie + " and " + secondtDie + " = " + sum);
    while (sum != desiredSum) {
        firstDie = r.nextInt(6) + 1;
        secondtDie = r.nextInt(6) + 1;
        sum = firstDie + secondtDie;
        System.out.println(firstDie + " and " + secondtDie + " = " + sum);
    }
    
}