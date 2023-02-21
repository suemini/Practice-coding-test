class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] speak = new String[]{"aya", "ye", "woo", "ma"};
        for (int i = 0; i < babbling.length; i++) {
            babbling[i] = babbling[i].replaceAll("aya", String.valueOf(1))
                .replaceAll("ye", String.valueOf(1)).replaceAll("woo", String.valueOf(1))
                .replaceAll("ma", String.valueOf(1));
        }
        
        for (int i = 0; i < babbling.length; i++) {
            if (babbling[i].matches("[0-9]+")){
                answer++;
            }
        }
        return answer;
    }
}