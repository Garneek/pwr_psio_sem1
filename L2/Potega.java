import java.math.BigDecimal;

class Potega{
 /**
  * Returns x to the power of k 
  * 
  * @param x base - real number
  * @param k exponent - natural number
  * @return x to the power of k
  */
  public static double power(double x, int k){
    if (k == 0) return 1f;
    if (k % 2 == 0) {
      double temp = power(x, k / 2);
      return temp * temp;
    } 
    return x * power(x, k - 1);
  }

 /**
  * Returns x to the power of k both x and k can be big numbers
  * 
  * @param x base - real number 
  * @param k exponent - natural number
  * @return x to the power of k
  * */
  public static BigDecimal powerBD(BigDecimal x, int k){
	if (k == 0) return BigDecimal.valueOf(1f);
	if (k % 2 == 0) {
	  BigDecimal temp = powerBD(x, k / 2);
	  return temp.multiply(temp);
	} 
    return x.multiply(powerBD(x, k - 1));
  }
  
  public static void main(String[] args){
    System.out.printf("Obliczanie potegi z x i k:\n");
    System.out.printf("> %f^%d = %f\n", 2f, 0, power(2f, 0));
    System.out.printf("> %f^%d = %f\n", 2f, 10, power(2f, 10));
    System.out.printf("> %f^%d = %f\n", 2f, 1, power(2f, 1));
    System.out.printf("> %f^%d = %f\n", 3f, 2, power(3f, 2));
    System.out.printf("> %f^%d = %f\n", 2.5f, 2, power(2.5f, 2));
    int i = 0;
    while(power(10f, i) != Double.POSITIVE_INFINITY) {
    	i++;
    }
    System.out.printf("Maksymalna potega 10 dla double: 10^%d\n", i - 1);
    System.out.println("Typ danych o duzo wiekszym zakresie dla liczb rzeczywistych to BigDecimal");
    System.out.println("Obliczanie potegi z x i k za pomoca BigDecimal:");
    System.out.printf("> %f^%d = %f\n", 2f, 0, powerBD(BigDecimal.valueOf(2f), 0));
    System.out.printf("> %f^%d = %f\n", 2f, 10, powerBD(BigDecimal.valueOf(2), 10));
    System.out.printf("> %f^%d = %f\n", 2f, 1, powerBD(BigDecimal.valueOf(2), 1));
    System.out.printf("> %f^%d = %f\n", 3f, 2, powerBD(BigDecimal.valueOf(3), 2));
    System.out.printf("> %f^%d = %f\n", 2.5f, 2, powerBD(BigDecimal.valueOf(2.5), 2));
    System.out.printf("> %f^%d = %f\n", 2f, 500, powerBD(BigDecimal.valueOf(2), 500));
  }
 
}

