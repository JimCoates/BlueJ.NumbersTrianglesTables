 

public class TriangleUtilities {

    public static String getRow(int numberOfStars) {
        String row = "";
        for(int i = 0; i < numberOfStars; i++){
        row += "*";
        }
        return row;
    }
    
    public static String getTriangle(int numberOfRows) {
        String row = "";
        for(int i = 1; i <= numberOfRows; i++) {
        row += getRow(i) + "\n";
        }
        return row;
    }


    public static String getSmallTriangle() {
        String row = "";
        for(int i = 1; i <= 4; i++) {
        row += getRow(i) + "\n";
        }
        return row;
    }

    public static String getLargeTriangle() {
        String row = "";
        for(int i = 1; i <= 9; i++){
        row += getRow (i) + "\n";
        }
        return row;
    }
}
