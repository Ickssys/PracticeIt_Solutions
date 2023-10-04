public static boolean isMagicSquare(int[][] arr) {
    if (arr.length > 2) {
        for (int i = 0; i < arr.length; i++) {
            if (arr.length != arr[i].length) {
                return false;
            }
        }
        int sumRow1 = 0;
        
        // sum of row 1
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                sumRow1 += arr[i][j];
            }
        }
        for (int i = 1; i < arr.length; i++) {
            int sumRows = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sumRows += arr[i][j];
            }
            if (sumRows != sumRow1) {
                return false;
            }
        }
        for (int i = 0; i < arr[0].length; i++) {
            int sumColumns = 0;
            for (int j = 0; j < arr.length; j++) {
                sumColumns += arr[j][i];
            }
            if (sumColumns != sumRow1) {
                return false;
            }
        }
        int sumDiagonals = 0;
        for (int i = 0; i < arr.length; i++) {
            sumDiagonals += arr[i][i];
        }
        if (sumDiagonals != sumRow1) {
            return false;
        }
        
    }
    return true;
}