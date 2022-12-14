package programmers.level1;

public class XNInterval {

    public long[] solution(int x, int n) {
        long[] answer = new long[n];

        long number = x;

        for (int i = 0; i < n; i++) {
            answer[i] = number;
            number += x;
        }

        return answer;
    }

}
