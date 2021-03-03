/*
https://programmers.co.kr/learn/courses/30/lessons/12933
연습문제
정수 내림차순으로 배치하기

[문제설명]
함수 solution은 정수 n을 매개변수로 입력받습니다. n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 예를들어 n이 118372면 873211을 리턴하면 됩니다.

[제한조건]
n은 1이상 8000000000 이하인 자연수입니다.
*/

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// Enhanced for문, String.valueOf(), String.split(), Arrays.sort(), Long.parseLong(), Math.pow(), += 연산자, * 연산자, ++ 연산자, String 배열 사용 (더 빠른 풀이)
class Solution {
    public long solution(long n) {
        String[] s = String.valueOf(n).split("");
        long answer = 0;
        
        Arrays.sort(s);
        
        int i = 0;
        for (String ss: s) {
            answer += Long.parseLong(ss) * Math.pow(10, i++);
        }
        
        return answer;
    }
}

// String.valueOf(), String.split(), Stream.of(), Stream.sorted(), Stream.collect(), Comparator.reverseOrder(), Collectors.joining(), Long.parseLong() 사용 (스트림 풀이)
class Solution2 {
    public long solution(long n) {
        String s = Stream.of(String.valueOf(n).split(""))
            .sorted(Comparator.reverseOrder())
            .collect(Collectors.joining());
        
        return Long.parseLong(s);
    }
}

// Long.toString(), String.chars(), IntStream.sorted(), IntStream.forEach(), Character.valueOf(), Long.parseLong(), + 연산자, 캐스팅 사용 (스트림 풀이)
class Solution3 {
    String s = "";  // 지역 변수로 둘 경우 forEach 부분에서 에러 발생

    public long solution(long n) {
        Long.toString(n).chars()
            .sorted()
            .forEach(c -> s = Character.valueOf((char)c) + s);
        
        return Long.parseLong(s);
    }
}
