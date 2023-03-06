class Solution {
    public int solution(int hp) {
        int answer = 0;
        int work = 0;
        int general = hp / 5;
        int soldier = (hp%5) / 3;
        if ((hp%5) % 3 != 0) {
            work = (hp%5) % 3;
        }
        answer = general + soldier + work;
        return answer;
    }
}