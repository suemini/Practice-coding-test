class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] my_stringArr = String.valueOf(my_string).split("");
        String[] alphabetArr1 = new String[26];
        String[] alphabetArr2 = new String[26];

        for (int j = 0; j < my_stringArr.length; j++) {
            for (int i = 0; i < alphabetArr1.length; i++) {
                alphabetArr1[i] = String.valueOf((char) (97 + i));
                alphabetArr2[i] = String.valueOf((char) (65 + i));
                if (my_stringArr[j].equals(alphabetArr1[i])) {
                    my_stringArr[j] = alphabetArr2[i];
                } else if (my_stringArr[j].equals(alphabetArr2[i])) {
                    my_stringArr[j] = alphabetArr1[i];
                }
            }
            answer = String.join("", my_stringArr);
        }
        return answer;
    }
}