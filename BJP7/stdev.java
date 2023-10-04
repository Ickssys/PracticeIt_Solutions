public static double stdev(int[] a){
    int sumAvg = 0;
    for(int i = 0; i < a.length; i++){
        sumAvg += a[i];
    }
    double avg = (double) sumAvg / a.length;
    double sumSquares = 0;
    for(int j = 0; j < a.length; j++){
        sumSquares += Math.pow(a[j] - avg, 2);
    }
    return Math.sqrt(sumSquares / (a.length - 1));
}