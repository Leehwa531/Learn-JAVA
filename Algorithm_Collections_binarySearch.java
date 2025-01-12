import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Algorithm_Collections_binarySearch {
    public static void main(String[] args) {
        // 정수 리스트 선언 및 초기화
        List<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(10);
        al.add(20);

        // 리스트를 정렬 (binarySearch는 정렬된 리스트에서만 동작)
        Collections.sort(al);

        // 이진 탐색: 값 10은 현재 3번 인덱스에 존재
        int index = Collections.binarySearch(al, 10);
        System.out.println(index); // 출력: 3

        // 이진 탐색: 값 13은 리스트에 없음
        // 값 13은 4번 인덱스에 위치했을 것이다. 따라서 반환값은 -4-1 = -5
        index = Collections.binarySearch(al, 13);
        System.out.println(index); // 출력: -5
    }
}
