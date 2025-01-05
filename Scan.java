import java.util.Scanner;

public class Scan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner 객체 생성

        // 문자열 입력받기
        System.out.print("이름을 입력하세요: ");
        String name = scanner.nextLine(); // nextLine()을 사용하여 문자열 입력 받기
        System.out.println("안녕하세요, " + name + "님!");

        // 정수 입력받기
        System.out.print("나이를 입력하세요: ");
        int age = scanner.nextInt(); // nextInt()를 사용하여 정수 입력 받기
        System.out.println("당신의 나이는 " + age + "살입니다.");

        // 실수 입력받기
        System.out.print("키를 입력하세요: ");
        double height = scanner.nextDouble(); // nextDouble()을 사용하여 실수 입력 받기
        System.out.println("당신의 키는 " + height + "cm입니다.");

        scanner.close(); // 입력이 끝난 후 scanner 닫기
    }
}
