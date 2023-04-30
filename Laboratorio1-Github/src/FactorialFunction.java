public class FactorialFunction {
    public static double Factorial(int number){
        double factorial = 1;
        for (int i = number; i > 0; i--) {
            factorial = factorial*i;
        }
        return factorial;
    }
}
