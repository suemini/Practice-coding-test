class Solution {
    public String solution(int age) {
        String answer = "";
        String[] alphabetArr = new String[26];
        for (int i = 0; i < alphabetArr.length; i++) {
            alphabetArr[i] = String.valueOf((char) (97 + i));
        }

        String[] result = String.valueOf(age).split("");
        for (int i = 0; i < result.length; i++) {
            answer += alphabetArr[Integer.parseInt(result[i])];
        }
        return answer;
    }
}