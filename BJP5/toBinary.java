public static String toBinary(int n) {
    String str = "";
    if(n == 0){
        return str = "0";
    }
    while(n != 0){
        str = n % 2 + str;
        n /= 2;
    }
    return str;
}