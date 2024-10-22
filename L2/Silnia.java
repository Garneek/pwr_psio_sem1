import java.math.BigInteger;

class Silnia{
 /**
  * Returns factorial of a natural number x
  * 
  * @param x factorial argument
  * @returns factorial of x
  */
  public static int factorial(int x){
    int ans = 1;
    for (int i = 1; i <= x; i++){
      ans *= i;
    }
    return ans;
  }
  
  /**
   * Returns factorial of a big natural number x
   * 
   * @param x factorial argument
   * @returns factorial of x
   */
   public static BigInteger factorialBI(int x){
     BigInteger ans = BigInteger.ONE;
     for (int i = 1; i <= x; i++){
       ans = ans.multiply(BigInteger.valueOf(i));
     }
     return ans;
   }

  public static void main(String[] args){
    System.out.printf("Obliczanie silni z n:\n");
    System.out.printf("> %d! = %d\n", 0, factorial(0));
    System.out.printf("> %d! = %d\n", 1, factorial(1));
    System.out.printf("> %d! = %d\n", 2, factorial(2));
    System.out.printf("> %d! = %d\n", 5, factorial(5));
    int i = 0;
    while (factorial(i) > 0) {
      i++;
    }
    System.out.printf("Maksymalna wartosc dla int: %d\n", i - 1);
    System.out.println("Typ danych o duzo wiekszym zakresie dla liczb calkowity to BigInteger");
    System.out.printf("Obliczanie silni z n za pomoca BigInteger:\n");
    System.out.printf("> %d! = %d\n", 0, factorialBI(0));
    System.out.printf("> %d! = %d\n", 1, factorialBI(1));
    System.out.printf("> %d! = %d\n", 5, factorialBI(5));
    System.out.printf("> %d! = %d\n", 50, factorialBI(50));
  }
  
}

