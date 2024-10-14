public class Zadanie2_3 {
  /**
   * GCD using Euclidean algorithm
   *
   * @param m first integer
   * @param n second integer
   * @return greatest common divisor of m and n
   */
  static int GCD(int m, int n) {
    int temp;
    while(n != 0){
      temp = n;
      n = m % n;
      m = temp;
    }
    return m;
  }

  /**
   * Prints given test case
   *
   * @param m first integer
   * @param n second integer
   */
  public static void printTestCase(int m, int n){
    System.out.printf("M: %d, N: %d -> rezultat: %d\n", m, n, GCD(m, n));
  }

  public static void main(String[] args) {
    System.out.println("Obliczanie NWD liczb M i N:");
    printTestCase(1, 5);  // Expected: 1
    printTestCase(12, 4); // Expected: 4
    printTestCase(14, 35);// Expected: 7
    printTestCase(12, 49);// Expected: 1
  }
}
