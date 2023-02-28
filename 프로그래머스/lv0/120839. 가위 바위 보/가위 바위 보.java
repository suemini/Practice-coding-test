class Solution {
    public String solution(String rsp) {
        String answer = "";
        String[] rpsArr = rsp.split("");
        for(int i = 0; i < rpsArr.length; i++) {
            if (rpsArr[i].equals("2")) {
                rpsArr[i] = "0";
            } else if (rpsArr[i].equals("0")) {
                rpsArr[i] = "5";
            } else if (rpsArr[i].equals("5")) {
                rpsArr[i] = "2";
            }
            answer = String.join("",rpsArr);
        }        
        return answer;
    }
}