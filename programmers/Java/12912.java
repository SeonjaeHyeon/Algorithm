/*
https://programmers.co.kr/learn/courses/30/lessons/12912
연습문제
두 정수 사이의 합

[문제설명]
두 정수 a, b가 주어졌을 때 a와 b 사이에 속한 모든 정수의 합을 리턴하는 함수, solution을 완성하세요.
예를 들어 a = 3, b = 5인 경우, 3 + 4 + 5 = 12이므로 12를 리턴합니다.

[제한조건]
a와 b가 같은 경우는 둘 중 아무 수나 리턴하세요.
a와 b는 -10,000,000 이상 10,000,000 이하인 정수입니다.
a와 b의 대소관계는 정해져있지 않습니다.
*/

import java.util.stream.LongStream;

// Math.abs(), 사칙연산자(+, -, *, /), 캐스팅 사용 (더 빠른 풀이)
// 등차수열의 합 공식
class Solution {
    public long solution(int a, int b) {
        return (long) (Math.abs(a - b) + 1) * (a + b) / 2;
    }
}

// for문, Math.min(), Math.max(), += 연산자 사용
class Solution2 {
    public long solution(int a, int b) {
        long answer = 0;
        long x = Math.min(a, b);
        long y = Math.max(a, b);
        
        for (; x <= y; x++) {
            answer += x;
        }
        
        return answer;
    }
}

// LongStream.rangeClosed(), LongStream.sum(), Math.min(), Math.max() 사용 (람다식 풀이)
// rangeClosed는 두 번째 인자인 종료 지점이 스트림에 포함된다. (range는 종료 지점이 포함되지 않음)
class Solution3 {
    public long solution(int a, int b) {
        return LongStream.rangeClosed(Math.min(a, b), Math.max(a, b)).sum();
    }
}
