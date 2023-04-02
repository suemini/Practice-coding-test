class Solution {
    public int[] solution(int n, int[] numlist) {
        int[] arr = new int[100];
        int index = 0;
        for(int i=0; i< numlist.length; i++) {
            if (numlist[i] % n == 0) {
                arr[index] = numlist[i];
                index++;
            }
        }
        
        int[] answer = new int[index];
        for(int i=0; i<index; i++) {
            if (arr[i] != 0) {
                answer[i] = arr[i];
            }
        }
        return answer;
    }
}