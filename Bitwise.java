public class Bitwise {
  public static void main(String[] args) {
      int a = 6; // 00000110
      int b = 3; // 00000011
      
      // AND (&)
      int andResult = a & b; // 00000010 (2진수)
      System.out.println("AND (&): " + andResult); // 출력: 2
      
      // OR (|)
      int orResult = a | b; // 00000111 (2진수)
      System.out.println("OR (|): " + orResult); // 출력: 7
      
      // XOR (^)
      int xorResult = a ^ b; // 00000101 (2진수)
      System.out.println("XOR (^): " + xorResult); // 출력: 5
      
      // NOT (~)
      int notResult = ~a; // 11111001 (2진수) = -7 (2의 보수)
      System.out.println("NOT (~): " + notResult); // 출력: -7
      
      // Left Shift (<<)
      int leftShiftResult = a << 1; // 00001100 (2진수)
      System.out.println("Left Shift (<<): " + leftShiftResult); // 출력: 12
      
      // Right Shift (>>)
      int rightShiftResult = a >> 1; // 00000011 (2진수)
      System.out.println("Right Shift (>>): " + rightShiftResult); // 출력: 3
      
      // Unsigned Right Shift (>>>)
      int negativeNum = -6; // 11111010 (2진수)
      int unsignedRightShiftResult = negativeNum >>> 1; // 01111101 (2진수)
      System.out.println("Unsigned Right Shift (>>>): " + unsignedRightShiftResult); // 출력: 2147483645
  }
}
