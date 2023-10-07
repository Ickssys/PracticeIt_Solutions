public static void printRange(int a, int b){
    if(a < b){
        for(int i = a; i <= b; i++){
            System.out.print(i + " ");
        }
    }else if(a > b){
        for(int i = a; i >= b; i--){
            System.out.print(i + " ");
        }
    }else{
        System.out.println(a);
    }
}