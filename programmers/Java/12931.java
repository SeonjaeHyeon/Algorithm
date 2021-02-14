/*
https://programmers.co.kr/learn/courses/30/lessons/12931
연습문제
자릿수 더하기

[문제설명]
자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.

[제한사항]
N의 범위 : 100,000,000 이하의 자연수
*/

import java.util.stream.Stream;

// Stream.of(), Stream.map(), Stream.mapToInt(), Stream.sum(), String.valueOf(), String.split(), Integer.parseInt(), Integer.intValue() 사용 (스트림 풀이)
public class Solution {
    public int solution(int n) {
        return Stream.of(String.valueOf(n).split(""))  // String.valueOf()를 Integer.toString()으로 대체할 수 있다.
            .map(i -> Integer.parseInt(i))
            .mapToInt(i -> i.intValue())  // 또는 .mapToInt(Integer::intValue)
            .sum();
    }
}

// while문, != 연산자, += 연산자, % 연산자, /= 연산자 사용 (더 빠른 풀이)
public class Solution2 {
    public int solution(int n) {
        int answer = 0;
        
        while (n != 0) {
            answer += n % 10;            
            n /= 10;
        }
        
        return answer;
    }
}

// Enhanced for문, String.valueOf(), String.split(), Integer.parseInt(), += 연산자, String 배열 사용
public class Solution3 {
    public int solution(int n) {
        int answer = 0;
        String[] array = String.valueOf(n).split("");  // String.valueOf()를 Integer.toString()으로 대체할 수 있다.
        
        for (String s: array) {
            answer += Integer.parseInt(s);
        }
        
        return answer;
    }
}

// Enhanced for문, Integer.toString(), String.toCharArray(), += 연산자, char 배열 사용 (빠른 풀이)
public class Solution4 {
    public int solution(int n) {
        int answer = 0;
        char[] array = Integer.toString(n).toCharArray();
        
        for (char c: array) {
            answer += c - 48;  // 문자(char) 0의 ASCII 코드는 48이다.
        }
        
        return answer;
    }
}

// for문, Integer.toString(), Integer.parseInt(), String.length(), String.valueOf(), String.charAt(), += 연산자 사용 (빠른 풀이)
public class Solution5 {
    public int solution(int n) {
        int answer = 0;
        String s = Integer.toString(n);
        
        for (int i = 0; i < s.length(); i++) {
            answer += Integer.parseInt(String.valueOf(s.charAt(i)));  // String.valueOf()를 Character.toString()으로 대체할 수 있다.
        }
        
        return answer;
    }
}
