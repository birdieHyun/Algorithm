package programmers.level1;

import java.util.*;

public class Hamburger {

    // 빵1 - 야채2 - 고기3 - 빵1    순으로만 햄버거를 만든다.
    public int solution(int[] ingredient) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for (int i : ingredient) {
            stack.push(i);
            if(stack.size() >= 4) {
                if (stack.get(stack.size() - 4) == 1 && stack.get(stack.size() - 3) == 2 && stack.get(stack.size() - 2) == 3 && stack.get(stack.size() - 1) == 1) {
                    answer++;
                    stack.pop();
                    stack.pop();
                    stack.pop();
                    stack.pop();
                }
            }
        }
        return answer;
    }

}
