public static String season(int m, int d) {
    if ((m == 3 && 1 <= d && d <= 15) || 1 <= m && m < 3 && d <= 31 || m == 12 && 16 <= d && d <= 31) {
        return "Winter";
    } else if ((m == 3 && 16 <= d && d <= 31) || 3 < m && m < 6 && d <= 31 || m == 6 && 1 <= d && d <= 15) {
        return "Spring";
    } else if((m == 6 && 16 <= d && d <= 31) || 6 < m && m < 9 && d <= 31 || m == 9 && 1 <= d && d <= 15) {
        return "Summer";
    } else {
        return "Fall";
    }
}