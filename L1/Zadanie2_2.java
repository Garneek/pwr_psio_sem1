public class Zadanie2_2 {
  /**
   * Prints three numbers in non-descending order
   *
   * @param a first number
   * @param b second number
   * @param c third number
   */
  public static void printSorted(double a, double b, double c){
    System.out.printf("A: %f, B: %f, C: %f ->\n", a, b, c);
    double temp;
    if (a > b){
      temp = a;
      a = b;
      b = temp;
    }
    if (b > c){
      temp = b;
      b = c;
      c = temp;
    }
    if (a > b){
      temp = a;
      a = b;
      b = temp;
    }
    System.out.printf("A: %f, B: %f, C: %f\n\n", a, b, c);
  }

  public static void main(String[] args) {
    System.out.println("Sortowanie liczb A, B i C:");
    printSorted(1f, 2f, 3f);            // Expected: 1f, 2f, 3f
    printSorted(-1.555f, 0f, -500.1f);  // Expected: -500.1f, -1.555f, 0f
    printSorted(3f, 2f, 1f);            // Expected: 1f, 2f, 3f
    printSorted(1.5f, 1.4999f, 1.5001f);// Expected: 1.4999f, 1.5f, 1.5001f



  }
}
