/*
https://programmers.co.kr/learn/courses/30/lessons/12917
문자열 내림차순으로 배치하기
연습문제

[문제설명]
문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수, solution을 완성해주세요.
s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.

[제한사항]
str은 길이 1 이상인 문자열입니다.
*/

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// String.chars(), IntStream.mapToObj(), Stream.sorted(), Stream.collect(), Comparator.reverseOrder(), Collectors.joining() 사용 (스트림 풀이)
class Solution {
    public String solution(String s) {
        return s.chars()
            .mapToObj(Character::toString)
            .sorted(Comparator.reverseOrder())
            .collect(Collectors.joining());
    }
}

// String.toCharArray(), Arrays.sort(), StringBuilder.reverse(), StringBuilder.toString(), new 연산자, char 배열 사용 (더 빠른 풀이)
class Solution2 {
    public String solution(String s) {
        char[] c = s.toCharArray();
        Arrays.sort(c);

        return new StringBuilder(new String(c)).reverse().toString();
    }
}

// Stream.of(), String.split(), Stream.sorted(), Stream.collect(), Comparator.reverseOrder(), Collectors.joining() 사용 (스트림 풀이)
// Stream.of(s.split(""))은 Arrays.stream(s.split(""))으로 대체할 수 있다.
class Solution3 {
    public String solution(String s) {        
        return Stream.of(s.split(""))
            .sorted(Comparator.reverseOrder())
            .collect(Collectors.joining());
    }
}

// Enhanced for문, String.split(), Arrays.sort(), Collections.reverseOrder(), StringBuilder.append(), StringBuilder.toString(), new 연산자, String 배열 사용 (빠른 풀이)
class Solution4 {
    public String solution(String s) {        
        String[] array = s.split("");
        StringBuilder sb = new StringBuilder();

        Arrays.sort(array, Collections.reverseOrder());
        for (String str: array) {
            sb.append(str);
        }
        
        return sb.toString();
    }
}
