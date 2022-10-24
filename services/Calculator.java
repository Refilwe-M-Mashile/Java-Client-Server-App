package services;

public class Calculator {

    public static int generateRandomNumber() {
        return (int) (Math.round(Math.random() * 100) + 1);
    }

    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    public static int difference(int num1, int num2) {
        return num1 - num2;
    }

    public static int product(int num1, int num2) {
        return num1 * num2;
    }

    public static int quotient(int num1, int num2) {
        int quotient = 1;
        try {
            quotient = num1 / num2;
        } catch (Exception e) {
            System.err.println("Can't divide by 0");
        }
        return quotient;
    }

    public static void printResults(String operator, int result) {
        switch (operator.toLowerCase()) {
            case "sum":
                System.out.println("The Sum is:" + result);
                break;
            case "product":
                System.out.println("The Product is:" + result);
                break;
            case "quotient":
                System.out.println("The Quotient is:" + result);
                break;
            case "difference":
                System.out.println("The Difference is:" + result);
                break;
            default:
                System.err.println("Invalid operator use [ sum | difference | quotient | product ]");
                break;
        }
    }

}
