import java.util.*;

public class List_Ex {
    public static void main(String[] args) {
        // List 인터페이스로 선언
        List<String> fruits = new ArrayList<>();

        // 값 추가
        fruits.add("Apple");
        fruits.add("Banana");

        // LinkedList로 변경
        fruits = new LinkedList<>(fruits);
        fruits.add("Cherry");

        // 결과 출력
        System.out.println(fruits); // 출력: [Apple, Banana, Cherry]
    }
}
