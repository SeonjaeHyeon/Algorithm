/*
https://programmers.co.kr/learn/courses/30/lessons/12916
연습문제
문자열 내 p와 y의 개수

[문제설명]
대문자와 소문자가 섞여있는 문자열 s가 주어집니다. s에 'p'의 개수와 'y'의 개수를 비교해 같으면 True, 다르면 False를 return 하는 solution를 완성하세요. 'p', 'y' 모두 하나도 없는 경우는 항상 True를 리턴합니다. 단, 개수를 비교할 때 대문자와 소문자는 구별하지 않습니다.
예를 들어 s가 pPoooyY면 true를 return하고 Pyy라면 false를 return합니다.

[제한사항]
문자열 s의 길이 : 50 이하의 자연수
문자열 s는 알파벳으로만 이루어져 있습니다.
*/

// for문, str.length(), str.charAt() 사용
class Solution {
    boolean solution(String s) {       
        int p = 0;
        int y = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == 'P' || c == 'p') {
                p++;
            }
            else if (c == 'Y' || c == 'y') {
                y++;
            }
        }

        return p == y;
    }
}

// for문, str.length(), str.charAt() 사용
class Solution2 {
    boolean solution(String s) {       
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == 'P' || c == 'p') {
                count++;
            }
            else if (c == 'Y' || c == 'y') {
                count--;
            }
        }

        return count == 0;
    }
}

// for문, str.toLowerCase(), str.length(), str.charAt() 사용
class Solution3 {
    boolean solution(String s) {
        s = s.toLowerCase();

        int p = 0;
        int y = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'p') {
                p++;
            }
            else if (s.charAt(i) == 'y') {
                y++;
            }
        }

        return p == y;
    }
}

// Enhanced for문, str.toLowerCase(), str.toCharArray() 사용
class Solution4 {
    boolean solution(String s) {
        s = s.toLowerCase();

        int p = 0;
        int y = 0;
        for (char c: s.toCharArray()) {
            if (c == 'p') {
                p++;
            }
            else if (c == 'y') {
                y++;
            }
        }

        return p == y;
    }
}

// str.chars(), IntStream.filter(), IntStream.count() 사용 (람다식)
class Solution5 {
    boolean solution(String s) {
        s = s.toLowerCase();

        return s.chars().filter(c -> c == 'p').count() == s.chars().filter(c -> c == 'y').count();
    }
}
