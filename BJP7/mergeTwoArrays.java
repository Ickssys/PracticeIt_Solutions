public static int[] merge(int[] A, int[] B){
        int[] nA = new int[A.length + B.length];
        for(int i = 0; i < A.length; i++){
            nA[i]  = A[i];
        }
        for(int j = A.length; j < nA.length; j++){
            nA[j] = B[j - A.length];
        }
        return nA;
}