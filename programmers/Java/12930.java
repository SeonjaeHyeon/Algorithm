/*
https://programmers.co.kr/learn/courses/30/lessons/12930
연습문제
이상한 문자 만들기

[문제설명]
문자열 s는 한 개 이상의 단어로 구성되어 있습니다. 각 단어는 하나 이상의 공백문자로 구분되어 있습니다. 각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수, solution을 완성하세요.

[제한사항]
문자열 전체의 짝/홀수 인덱스가 아니라, 단어(공백을 기준)별로 짝/홀수 인덱스를 판단해야합니다.
첫 번째 글자는 0번째 인덱스로 보아 짝수번째 알파벳으로 처리해야 합니다.
*/

// for문, String.toCharArray(), Character.toUpperCase(), Character.toLowerCase(), == 연산자, ++ 연산자, 삼항연산자, new 연산자, char 배열 사용 (더 빠른 풀이)
class Solution {
    public String solution(String s) {
        char[] c = s.toCharArray();

        int j = 0;
        for (int i = 0; i < c.length; i++) {
            if (c[i] == ' ') {
                j = 0;
                continue;
            }

            c[i] = (j++ % 2 == 0) ? Character.toUpperCase(c[i]) : Character.toLowerCase(c[i]);
        }

        return new String(c);
    }
}

// Enhanced for문, String.contains(), String.toLowerCase(), String.toUpperCase(), == 연산자, += 연산자, 삼항연산자, String 배열 사용
class Solution2 {
    public String solution(String s) {
        String answer = "";
        int idx = 0;
        String[] array = s.split("");

        for(String ss : array) {
            idx = ss.contains(" ") ? 0 : idx + 1;
            answer += (idx % 2 == 0) ? ss.toLowerCase() : ss.toUpperCase(); 
        }

        return answer;
    }
}

// for문, String.toUpperCase(), String.toCharArray(), Character.toLowerCase(), ++ 연산자 >= 연산자, <= 연산자, new 연산자, char 배열 사용
// 모두 대문자로 치환 후, 앞 문자가 대문자일 때 소문자로 치환
class Solution3 {
    public String solution(String s) {
        char[] c = s.toUpperCase().toCharArray();
        
        for (int i = 1; i < c.length; i++) {
            if (c[i - 1] >= 65 && c[i - 1] <= 90) {
                c[i] = Character.toLowerCase(c[i]);
            }
        }

        return new String(c);
    }
}
