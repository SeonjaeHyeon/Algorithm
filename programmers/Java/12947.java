/*
https://programmers.co.kr/learn/courses/30/lessons/12947
연습문제
하샤드 수

[문제설명]
양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다. 예를 들어 18의 자릿수 합은 1+8=9이고, 18은 9로 나누어 떨어지므로 18은 하샤드 수입니다. 자연수 x를 입력받아 x가 하샤드 수인지 아닌지 검사하는 함수, solution을 완성해주세요.

[제한조건]
x는 1 이상, 10000 이하인 정수입니다.
*/

import java.util.stream.Stream;

// Enhanced for문, String.valueOf(), String.split(), Integer.parseInt(), += 연산자, % 연산자, == 연산자, String 배열 사용 (더 빠른 풀이)
class Solution {
    public boolean solution(int x) {
        String[] s = String.valueOf(x).split("");

        int n = 0;
        for (String ss: s) {
            n += Integer.parseInt(ss);
        }

        // assert n != 0;
        return x % n == 0;
    }
}

// Stream.of(), Stream.mapToInt(), String.valueOf(), String.split(), IntStream.sum(), % 연산자, == 연산자 사용 (스트림 풀이)
class Solution2 {
    public boolean solution(int x) {
        return x % Stream.of(String.valueOf(x).split(""))
                    .mapToInt(Integer::parseInt)
                    .sum() == 0;
    }
}

// String.valueOf(), String.chars(), IntStream.map(), IntStream.sum(), % 연산자, == 연산자 사용 (스트림 풀이)
class Solution3 {
    public boolean solution(int x) {
        return x % String.valueOf(x).chars().map(c -> c - '0').sum() == 0;
    }
}
