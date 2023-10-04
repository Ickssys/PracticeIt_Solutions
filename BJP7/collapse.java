public static int[] collapse(int[] list){
    int[] aMod;
    if(list.length % 2 != 0){
        aMod = new int[list.length / 2 + 1];
        aMod[aMod.length - 1] = list[list.length - 1];
    }else{
        aMod = new int[list.length / 2];
    }
    for(int i = 0; i < list.length / 2; i++){
        aMod[i] = list[2 * i] + list[2 * i + 1];
        
    }
    return aMod;
}