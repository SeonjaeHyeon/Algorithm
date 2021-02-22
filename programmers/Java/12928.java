/*
https://programmers.co.kr/learn/courses/30/lessons/12928
연습문제
약수의 합

[문제설명]
정수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수, solution을 완성해주세요.

[제한사항]
n은 0 이상 3000이하인 정수입니다.
*/

import java.util.stream.IntStream;

// for문, / 연산자, % 연산자, == 연산자, += 연산자 사용 (더 빠른 풀이)
class Solution {
    public int solution(int n) {
        int answer = n;
        
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                answer += i;
            }
        }
        
        return answer;
    }
}

// IntStream.rangeClosed(), IntStream.filter(), IntStream.sum(), / 연산자, % 연산자, == 연산자 사용 (람다식 풀이) 
class Solution2 {
    public int solution(int n) {        
        return IntStream.rangeClosed(1, n / 2)
            .filter(i -> n % i == 0)
            .sum() + n;
    }
}
