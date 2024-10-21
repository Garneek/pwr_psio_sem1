class Potega{
 /**
  * Returns x to the power of k 
  * 
  * @param x base - real number
  * @param k exponent - natural number
  * @returns x to the power of b
  */
  public static double power(double x, int k){
    if (k == 0) return 1f;
    if (k % 2 == 0) {
      double temp = power(x, k / 2);
      return temp * temp;
    } 
    return x * power(x, k - 1);
  }

  public static void main(String[] args){
    System.out.printf("Obliczanie potegi z x i k:\n");
    System.out.printf("> %f^%d = %f\n", 2f, 0, power(2f, 0));
    System.out.printf("> %f^%d = %f\n", 2f, 10, power(2f, 10));
    System.out.printf("> %f^%d = %f\n", 2f, 1, power(2f, 1));
    System.out.printf("> %f^%d = %f\n", 3f, 2, power(3f, 2));
    System.out.printf("> %f^%d = %f\n", 2.5f, 2, power(2.5f, 2));
  }
  
}

