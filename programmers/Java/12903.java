/*
https://programmers.co.kr/learn/courses/30/lessons/12903
연습문제
가운데 글자 가져오기

[문제설명]
단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.

[제한사항]
s는 길이가 1 이상, 100이하인 스트링입니다.
*/

// String.toCharArray(), String.length(), String.valueOf(), new 연산자, 삼항연산자 사용
class Solution {
    public String solution(String s) {
        char [] chars = s.toCharArray();
        int num = s.length() / 2;
        return s.length() % 2 == 0 ? new String(chars, num - 1, 2) : String.valueOf(chars[num]);
    }
}

// String.length(), String.substring(), String.valueOf(), String.charAt(), 삼항연산자 사용
class Solution2 {
    public String solution(String s) {
        int num = s.length() / 2;
        return s.length() % 2 == 0 ? s.substring(num - 1, num + 1) : String.valueOf(s.charAt(num));
    }
}

// String.substring(), String.length(), 삼항연산자 사용
class Solution3 {
    public String solution(String s) {
        return s.substring((s.length() - 1) / 2, s.length() / 2 + 1);
    }
}

// String.substring(), String.length(), 삼항연산자 사용
class Solution4 {
    public String solution(String s) {
        return s.substring((s.length() - 1) / 2, (s.length() + 2) / 2);
    }
}
