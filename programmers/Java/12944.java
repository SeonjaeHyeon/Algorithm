/*
https://programmers.co.kr/learn/courses/30/lessons/12944
연습문제
평균 구하기

[문제설명]
정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.

[제한사항]
arr은 길이 1 이상, 100 이하인 배열입니다.
arr의 원소는 -10,000 이상 10,000 이하인 정수입니다.
*/

import java.util.OptionalDouble;
import java.util.stream.IntStream;

// IntStream.of(), IntStream.sum(), Array.length, / 연산자, 캐스팅 사용 (람다식 풀이)
class Solution {
    public double solution(int[] arr) {
        return IntStream.of(arr).sum() / (double) arr.length;
    }
}

// IntStream.of(), IntStream.average(), OptionalDouble.isPresent(), OptionalDouble.getAsDouble(), 삼항연산자 사용 (람다식 풀이)
class Solution2 {
    public double solution(int[] arr) {
        OptionalDouble od = IntStream.of(arr).average();

        return od.isPresent() ? od.getAsDouble() : 0;
    }
}

// Enhanced for문, Array.length, += 연산자, / 연산자 사용 (더 빠른 풀이)
class Solution3 {
    public double solution(int[] arr) {
        double answer = 0.0;
        
        for (int i: arr) {
            answer += i;
        }

        return answer / arr.length;
    }
}
