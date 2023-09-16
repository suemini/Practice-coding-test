class Solution {
    public boolean solution(int x) {
        boolean answer = false;
        int ans = 0;
        int temp = x;

        while(temp > 0) {
        	int digit = temp % 10;
        	ans += digit;
        	temp /= 10;
        }
        
        if( x % ans == 0) {
        	answer = true;
        }
        
        return answer;
    }
}