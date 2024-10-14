package develhope.java.finalcouse.finalweek;

public enum Operator {
    ADD("+") {
        @Override
        public double calculate(double a, double b) {
            return a + b;
        }
    },
    SUBTRACT("-") {
        @Override
        public double calculate(double a, double b) {
            return a - b;
        }
    },
    MULTIPLY("*") {
        @Override
        public double calculate(double a, double b) {
            return a * b;
        }
    },
    DIVIDE("/") {
        @Override
        public double calculate(double a, double b) {
            try {
                return  a / b;
            }catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                return 0;
            }
        }
    };

    private String op;
    Operator(String op) {
        this.op = op;
    }

    public abstract double calculate(double a, double b);
}

class OperatorDemo {
    public static void main(String[] args) {
        double add = Operator.ADD.calculate(4, 5);
        double subtract = Operator.SUBTRACT.calculate(4, 5);
        double multiply = Operator.MULTIPLY.calculate(4, 5);
        double divide = Operator.DIVIDE.calculate(4, 5);

        System.out.println("Add: " + add);
        System.out.println("Subtract: " + subtract);
        System.out.println("Multiply: " + multiply);
        System.out.println("Divide: " + divide);

    }
}
