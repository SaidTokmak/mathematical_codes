import java.util.HashMap;

public class Fibonacci {

    static HashMap<Integer, Integer> fibonacciHash = new HashMap<>();
    private static final Integer FIRST_NUMBER = 4;
    private static final Integer LAST_INDEX = 10;

    public static void main(String[] args) {

        setFirstValueOfFibonacci(FIRST_NUMBER);
        getFibonacciValueByLastIndex(LAST_INDEX);

        for(int i=0; i<=LAST_INDEX; i++) {
            System.out.println(i + ". fibonacci degeri : " + fibonacciHash.get(i));
        }
    }

    public static Integer getFibonacciValueByLastIndex(int indexNumber) {

        if (indexNumber == 0 || indexNumber == 1) {
            return fibonacciHash.get(indexNumber);
        }

        fibonacciHash.put(indexNumber, getFibonacciValueByLastIndex(indexNumber-1) + getFibonacciValueByLastIndex(indexNumber - 2));

        return fibonacciHash.get(indexNumber);
    }

    // set first and second index same value, ex: 4,4,8,12,...
    private static void setFirstValueOfFibonacci(int firstValue) {
        fibonacciHash.put(0, firstValue);
        fibonacciHash.put(1, firstValue);
    }
}