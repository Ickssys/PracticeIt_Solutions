public static void evenSum(){
    Scanner input = new Scanner(System.in);
    System.out.print("how many integers? ");
    int numbers = input.nextInt();
    int max = 0, sum = 0;
    
    for(int i = 1; i <= numbers; i++){
        System.out.print("next integer? ");
        int num = input.nextInt();
        if(num % 2 == 0){
            sum += num;
            if(num > max){
                max = num;
            }
        }
    }
    System.out.println("even sum = " + sum);
    System.out.println("even max = " + max);
}