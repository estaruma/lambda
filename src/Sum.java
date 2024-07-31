// Write a Java program to implement a lambda expression to find the sum of two integers.

public class Sum {

    //interface
    interface LambdaSum {
        int add(int a, int b);
    }
    public static void main(String[] args) {

        // create instance of LambdaSum and implement add method
        LambdaSum lambdaSum = (a, b) -> a + b;

        int num1 = 1;
        int num2 = 2;
        int result = lambdaSum.add(num1, num2);

        // Print the result
        System.out.println(num1 + " + " + num2 + " = " + result);
    }


}
