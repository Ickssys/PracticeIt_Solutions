public static void smallestLargest(){
    Scanner input = new Scanner(System.in);
    System.out.print("How many numbers do you want to enter? ");
    int numbers = input.nextInt();
    System.out.print("Number 1: ");
    int num1 = input.nextInt();
    int smallest = num1, largest = num1;
    
    
    
    for(int i = 2; i <= numbers; i++){
        System.out.print("Number " + i + ": ");
        int num = input.nextInt();
        if(num < smallest){
            smallest = num;
        }
        if(num > largest){
            largest = num;
        }
    }
    System.out.println("Smallest = " + smallest);
    System.out.println("Largest = " + largest);
}