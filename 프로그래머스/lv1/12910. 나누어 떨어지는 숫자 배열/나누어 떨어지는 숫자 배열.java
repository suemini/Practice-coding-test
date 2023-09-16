import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
        	if(arr[i] % divisor == 0 ) {
        		answer.add(arr[i]);
        	}
        }
         
        if(answer.size() == 0 ) {
        	return new int[] {-1};
        } else {  
            int[] answerArray = new int[answer.size()];
	        for (int i = 0; i < answer.size(); i++) {
	            answerArray[i] = answer.get(i);
	        }
	        Arrays.sort(answerArray);
            return answerArray;
        }
    }
}