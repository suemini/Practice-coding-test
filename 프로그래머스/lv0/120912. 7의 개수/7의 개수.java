class Solution {
    public int solution(int[] array) {
        int answer = 0;
        String change = "";
        
        for (int i = 0; i < array.length; i++) {
            change += String.valueOf(array[i]);
        }
        for (int i = 0; i < change.length(); i++) {
            if (change.charAt(i) == '7') {
                answer++;
            }
        }
        return answer;
    }
}