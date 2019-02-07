


public class NumberUtilities {

    public static String getRange(int stop) {
        String answer = "";
            for(int i = 0; i < stop; i++) {
            answer += i;    
            }
        return answer;
    }

    public static String getRange(int start, int stop) {
        String answer = "";
        for(int i = start; i < stop; i++) {
            answer +=i;
    }
        return answer;
    }


    public static String getRange(int start, int stop, int step) {
        String answer = "";
        for(int i = start; i < stop; i += step){
            answer += i;
        }
        return answer;
    }

    public static String getEvenNumbers(int start, int stop) {
        String answer = "";
        if(start%2 == 0){
        for(int i = start; i < stop; i +=2){
            answer += i;
        }
    } else if(start%2 !=0) {
        for(int i = start + 1; i < stop; i +=2){
            answer += i;
        }
    }
        return answer;
    }


    public static String getOddNumbers(int start, int stop) {
        String answer = "";
         if(start%2 == 0){
        for(int i = start + 1; i < stop; i +=2){
            answer += i;
        }
    } else if(start%2 !=0) {
        for(int i = start; i < stop; i +=2){
            answer += i;
        }
    }
        return answer;
    }


    public static String getExponentiations(int start, int stop, int exponent) {
        String answer = "";
        for(int i = start; i <= stop; i++){
            answer += (long)(Math.pow(i, exponent));
        }
        return answer;
    }
}
