class Solution {
    public String solution(String my_string, int num1, int num2) {
        String[] my_stringArr = my_string.split("");
        String[] my_stringArr2 = my_string.split("");
        my_stringArr2[num1] = my_stringArr[num2];
        my_stringArr2[num2] = my_stringArr[num1];

        String answer = String.join("",my_stringArr2);
        return answer;
    }
}