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

  public static void main(String[] args){
    System.out.printf("Obliczanie silni z n:\n");
    System.out.printf("> %d! = %d\n", 0, factorial(0));
    System.out.printf("> %d! = %d\n", 1, factorial(1));
    System.out.printf("> %d! = %d\n", 2, factorial(2));
    System.out.printf("> %d! = %d\n", 5, factorial(5));
  }
  
}

