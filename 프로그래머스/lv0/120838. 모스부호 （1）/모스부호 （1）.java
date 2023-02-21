class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] morse = new String[] {".-","-...","-.-.","-..",".","..-.","--.","....","..",
                                       ".---","-.-",".-..","--","-.","---",".--.","--.-",
                                       ".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        String[] alphabetarr = new String[26];
        for(int i = 0; i < alphabetarr.length; i++) {
            alphabetarr[i] = String.valueOf((char) (97+i));
        }

        String[] letterarray = letter.split(" ");
        
        for (int i = 0; i < letterarray.length; i++) {
            for (int j = 0; j < morse.length; j++) {
                if (letterarray[i].equals(morse[j])) {
                    letterarray[i] = alphabetarr[j];
                    answer += String.valueOf(letterarray[i]);
                }
            }
        }
        return answer;
    }
}