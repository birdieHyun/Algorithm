package programmers.level1;

public class AddString {

    public static void main(String[] args) {
        String s = "안녕하세요 아아아아";

        System.out.println(s.replaceAll(".", "1"));


    }

    public int Solution(String s) {

        int answer = 0;
        s = s.replace("zero", "0");
        s = s.replace("one", "1");
        s = s.replace("two", "2");
        s = s.replace("three", "3");
        s = s.replace("four", "4");
        s = s.replace("five", "5");
        s = s.replace("six", "6");
        s = s.replace("seven", "7");
        s = s.replace("eight", "8");
        s = s.replace("nine", "9");

        return Integer.valueOf(s);
    }

}
