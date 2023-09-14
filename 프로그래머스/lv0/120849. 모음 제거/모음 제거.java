class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] strArr = my_string.split("");
		for(int i=0; i<strArr.length; i++) {
			if (strArr[i].equals("a") || strArr[i].equals("e")
				|| strArr[i].equals("i") || strArr[i].equals("o")
				|| strArr[i].equals("u"))  {
				answer += ""; 
				} else {
					answer += strArr[i];
			}
		}
        return answer;
    }
}