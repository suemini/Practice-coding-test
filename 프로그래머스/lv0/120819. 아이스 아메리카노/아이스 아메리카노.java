class Solution {
    public int[] solution(int money) {
        int coffee = money / 5500;
        int charge = money - (5500*coffee);
        int answer[] = new int[]{coffee, charge};

        return answer;
    }
}