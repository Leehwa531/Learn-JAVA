import java.util.*;
import java.util.stream.Collectors;

public class Algorithm_Collections {
    public static void main(String[] args) {
        // int 배열 -> List<Integer> 변환
        int[] temp = {1, 2, 3, 10, 20};
        List<Integer> list = Arrays.stream(temp)
                                  .boxed()
                                  .collect(Collectors.toList());

        // 정수형 List 원소 중 최대값, 최소값
        Integer max = Collections.max(list);
        Integer min = Collections.min(list);

        // List 정렬
        Collections.sort(list);                             // 오름차순 정렬
        Collections.sort(list, Collections.reverseOrder()); // 내림차순 정렬

        // List 뒤집기
        Collections.reverse(list);

        // List 내 원소의 개수 반환
        int count = Collections.frequency(list, 3); // 3의 개수 반환

        // List 내 원소를 이진 탐색으로 찾기 (정렬 필수)
        Collections.sort(list); // 이진 탐색 전에 반드시 정렬
        int index = Collections.binarySearch(list, 10); // 10의 위치 반환

        // 최종 결과 확인용 출력 (필요 시 사용)
        System.out.println("최대값: " + max);
        System.out.println("최소값: " + min);
        System.out.println("3의 개수: " + count);
        System.out.println("10의 위치: " + index);
    }
}
