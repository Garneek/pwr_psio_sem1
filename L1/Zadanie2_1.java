public class Zadanie2_1 {
  /**
   * Finds and prints out solution/s of quadratic equation ax^2 + bx + c = 0
   *
   * @param a quadratic coefficient
   * @param b linear coefficient
   * @param c constant coefficient
   */
  public static void findSolutions(double a, double b, double c){
    System.out.printf("%.3fx^2 + %.3fx + %.3f -> ", a, b, c);
    if (a == 0f){
      if (b == 0f){
        if (c == 0f){
          System.out.printf("tozsamosc");     // Case: y = 0 -> all x values are solutions
        }else{
          System.out.printf("brak rozwiazan");// Case: y != 0 -> no x value is a solution
        }
      }else{
        System.out.printf("x = %.3f", -c / b);  // Case: linear equation -> one solution
      }
    }else{
      double discriminant = (b * b) - (4 * a * c);
      if (discriminant < 0){
        System.out.printf("brak rozwiazan");  // Case: discriminant < 0 -> no real x value is a solution
      }else if (discriminant == 0){
        System.out.printf("x = %.3f", -b / (2 * a));  // Case: discriminant = 0 -> one solution
      }else{
        double x1 = (-b - Math.sqrt(discriminant)) / (2 * a);
        double x2 = (-b + Math.sqrt(discriminant)) / (2 * a);
        System.out.printf("x = %.3f, x = %.3f", x1, x2);  // Case: discriminant > 0 -> two solutions
      }
    }
    System.out.print("\n");
  }

  public static void main(String[] args) {
    System.out.println("Znajdywanie pierwiastkow ax^2 + bx + c = 0:\n");
    findSolutions(1f, -3f, 2f);           // Expected: x = 1, x = 2
    findSolutions(1f, -2f, 1f);           // Expected: x = 1
    findSolutions(1f, 2f, 5f);            // Expected: brak rozwiazan
    findSolutions(0f, 2f, -4f);           // Expected: x = 2
    findSolutions(0f, 0f, 0f);            // Expected: tozsamosc
    findSolutions(0f, 0f, 1f);            // Expected: brak rozwiazan
    findSolutions(1000f, -5000f, 6000f);  // Expected: x = 2, x = 3
    findSolutions(-1f, -2f, -1f);         // Expected: x = -1
    findSolutions(1f, -5f, 0f);           // Expected: x = 0, x = 5
    findSolutions(0.5f, 1.5f, 1f);        // Expected: x = -2, -1
  }
}
