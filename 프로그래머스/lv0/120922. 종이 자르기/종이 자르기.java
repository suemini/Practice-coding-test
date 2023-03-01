class Solution {
    public int solution(int M, int N) {
        int answer = 0;
        int x = M;
        int y = N;
        
        if(M > 1) {
            x = M - 1;
        } else {
            x = 0;
        }

        if (N > 1) {
            y = (N-1) * M;
        } else {
            y = 0;
        }
        
        answer = x + y;
        
        return answer;
    }
}