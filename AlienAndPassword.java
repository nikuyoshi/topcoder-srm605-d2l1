public class AlienAndPassword {
    public int getNumber(String S) {
        int result = 1;
        for(int i = 0; i < S.length()-1; i++){
            if(S.charAt(i) != S.charAt(i+1)) result++;
        }
        return result;
    }
}
