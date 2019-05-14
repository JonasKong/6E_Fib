/** 
  Calculate Fibonacci number n
  3 implementations
  @precondition: n >= 1
  
  Use type "long" instead of "int", because rabbits.
 */

public class Fib {
    /** 
      @return the nth Fibonacci number
              by implementing the recurrence relation
     */
    public static long fib_recurrence( int n) {
		if (n == 2) {
			return 1;
		} else if (n == 1){
			return 1;
		} else {
			return fib_recurrence(n - 2) + fib_recurrence(n - 1);
		}
	}
     /* These are class / instance methods because...
    */


    /** 
      @return the nth Fibonacci number
              calculated via the 8th-grade algorithm
     */
    public static long fib_grade8( int n) {
        int termsCounted = 2;
		int currentTerm = 1;
		int lastTerm = 1;
		while (termsCounted <= n) {
			int placeholder = currentTerm + lastTerm;
			lastTerm = currentTerm;
			currentTerm = placeholder;
			termsCounted ++;
		}
		return currentTerm;
    }
    /* Time complexity:
       Consider the size of the problem to be ...
       
       As the proxy for the time required, count...
       
       Then cost of the the recurrence algorithm
       grows ?? 
       as the size of the problem increases,
       because ??
     */


    /** 
      @return the nth Fibonacci number
              calculated via Binet's formula.
              Type is double so that this exercise can
              ignore rounding issues.
     */
    public static double fib_Binet( int n) {
        double firstTerm = 1 / Math.sqrt(5);
		double secondTerm = Math.pow((1 + Math.sqrt(5)) / 2, n);
		double thirdTerm = Math.pow((1 - Math.sqrt(5)) / 2, n);
		return firstTerm * (secondTerm - thirdTerm);
	}
    /* Time complexity:
       Consider the size of the problem to be ...
       
       As the proxy for the time required, count...
		arithmetic operations
       Then cost of the the recurrence algorithm
       is constant
       as the size of the problem increases,
       because the same number of operations is 
	   performed regardless of the value of n.
     */
}
