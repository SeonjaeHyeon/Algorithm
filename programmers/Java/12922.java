/*
https://programmers.co.kr/learn/courses/30/lessons/12922
연습문제
수박수박수박수박수박수?

[문제설명]
길이가 n이고, 수박수박수박수....와 같은 패턴을 유지하는 문자열을 리턴하는 함수, solution을 완성하세요. 예를들어 n이 4이면 수박수박을 리턴하고 3이라면 수박수를 리턴하면 됩니다.

[제한사항]
n은 길이 10,000이하인 자연수입니다.
*/

// StringBuilder, for문, 삼항연산자 사용
class Solution {
    public String solution(int n) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < n; i++) {
            answer.append(i % 2 == 0 ? "수": "박");
        }

        return answer.toString();
    }
}

// StringBuilder, for문 사용
class Solution2 {
    public String solution(int n) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                answer.append("수");
            }
            else {
                answer.append("박");
            }
        }

        return answer.toString();
    }
}

// char 배열, 삼항연산자, str.replace(), str.substring() 시용
class Solution3 {
    public String solution(int n) {
        String answer = new String(new char[n % 2 == 0 ? n / 2 : n / 2 + 1]).replace("\0", "수박");
        return n % 2 == 0 ? answer : answer.substring(0, n);
    }
}

// char 배열, 삼항연산자, str.replace(), str.substring() 시용
class Solution4 {
    public String solution(int n) {
        return new String(new char[n % 2 == 0 ? n / 2 : n / 2 + 1]).replace("\0", "수박").substring(0, n);
    }
}
