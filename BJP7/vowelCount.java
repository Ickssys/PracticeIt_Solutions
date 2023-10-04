public static int[] vowelCount(String str){
    int[] vowels = new int[5];
    for(int i = 0; i < str.length(); i++){
        if(str.charAt(i) == 'a'){
            vowels[0]++;
        }else if(str.charAt(i) == 'e'){
            vowels[1]++;
        }else if(str.charAt(i) == 'i'){
            vowels[2]++;
        }else if(str.charAt(i) == 'o'){
            vowels[3]++;
        }else if(str.charAt(i) == 'u'){
            vowels[4]++;
        }
    }
    return vowels;
}