public class Zadanie2_3 {
  /**
   * GCD using Euclidean algorithm
   *
   * @param m first integer
   * @param n second integer
   * @return greatest common divisor of m and n; -1 if impossible
   */
  static int GCD(int m, int n) {
    if (m == 0){
      if (n == 0){
        System.out.print("blad w nwd(0, 0). Ktoras z wartosci musi byc niezerowa\n");
        return -1;
      }
      return n;
    }
    if (n == 0) return m;

    m = Math.abs(m);
    n = Math.abs(n);
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
    printTestCase(0, 0);  // Expected: blad - -1
    printTestCase(-5, 15);// Expected: 5
    printTestCase(-8, -4);// Expected: 4
    printTestCase(6, -4); // Expected: 2
  }
}
