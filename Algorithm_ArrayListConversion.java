import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Algorithm_ArrayListConversion {
    public static void main(String[] args) {
        // 문자열 배열을 List로 변환
        String[] tempStrArray = {"apple", "banana", "lemon"};
        List<String> stringList = new ArrayList<>(Arrays.asList(tempStrArray));

        // List를 문자열 배열로 변환
        String[] tempStrArray2 = stringList.toArray(new String[stringList.size()]);

        // 정수 배열을 List로 변환 (기본 타입 처리)
        int[] tempIntArray = {1, 2, 3, 4};
        List<Integer> intList = Arrays.stream(tempIntArray)
                                    .boxed() // Integer로 박싱
                                    .collect(Collectors.toList());

        // List를 정수 배열로 변환
        List<Integer> intList2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        int[] tempIntArray2 = intList2.stream()
                                    .mapToInt(x -> x)
                                    .toArray();
    }
}
