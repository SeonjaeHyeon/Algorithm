/*
https://programmers.co.kr/learn/courses/30/lessons/12910
연습문제
나누어 떨어지는 숫자 배열

[문제설명]
array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수, solution을 작성해주세요.
divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.

[제한사항]
arr은 자연수를 담은 배열입니다.
정수 i, j에 대해 i ≠ j 이면 arr[i] ≠ arr[j] 입니다.
divisor는 자연수입니다.
array는 길이 1 이상인 배열입니다.
*/

import java.util.*;

// Enhanced for문, ArrayList, Collections.sort(), ArrayList.size(), ArrayList.toArray(), new 연산자, 삼항연산자 사용 (더 빠른 풀이)
// Integer 타입의 배열을 반환하므로 올바른 풀이는 아니다.
class Solution {
    public Integer[] solution(int[] arr, int divisor) {
        var list = new ArrayList<Integer>();

        for (int i: arr) {
            if (i % divisor == 0) {
                list.add(i);
            }
        }
        Collections.sort(list);
        
        return list.size() > 0 ? list.toArray(new Integer[0]) : new Integer[] {-1};
    }
}

// Arrays.stream(), IntStream.filter(), IntStream.sorted(), InStream.toArray(), int[].length, new 연산자, 삼항연산자 사용 (람다식 풀이)
class Solution2 {
    public int[] solution(int[] arr, int divisor) {
        int [] answer = Arrays.stream(arr).filter(i -> i % divisor == 0)
            .sorted()
            .toArray();
        
        return answer.length > 0 ? answer : new int[] {-1};
    }
}

// ArrayList, Collections.sort(), ArrayList.size(), Collections.stream(), InStream.mapToInt(), InStream.toArray(), new 연산자, 삼항연산자 사용 (람다식 풀이)
class Solution3 {
    public int[] solution(int[] arr, int divisor) {
        var list = new ArrayList<Integer>();

        for (int i: arr) {
            if (i % divisor == 0) {
                list.add(i);
            }
        }
        Collections.sort(list);
        
        return list.size() > 0 ? list.stream().mapToInt(i -> i).toArray() : new int[] {-1};
    }
}
