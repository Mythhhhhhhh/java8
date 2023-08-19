package lambda;

import java.util.function.IntBinaryOperator;

public class LambdaTest2 {

    public static void main(String[] args) {
        int cal = cal(new IntBinaryOperator() {
            @Override
            public int applyAsInt(int left, int right) {
                return left + right;
            }
        });
        System.out.println(cal);

        int cal1 = cal((int left, int right) -> {
            return left + right;
        });
        System.out.println(cal1);

        int cal2 = cal((int left, int right) -> left + right);
    }

    public static int cal(IntBinaryOperator operator) {
        int a = 10;
        int b = 20;
        return operator.applyAsInt(a, b);
    }
}
