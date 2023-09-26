public static boolean isPalindrome(String str){
    for(int i = 0; i < str.length() / 2; i++){
        String strMod = str.toLowerCase();
        if(strMod.charAt(i) != strMod.charAt(str.length() - 1 - i)){
            return false;
        }
    }
    return true;
}