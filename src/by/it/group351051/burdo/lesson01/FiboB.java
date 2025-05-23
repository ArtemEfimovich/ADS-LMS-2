package by.it.group351051.burdo.lesson01;

import java.math.BigInteger;

/*
 * Вам необходимо выполнить способ вычисления чисел Фибоначчи с вспомогательным массивом
 * без ограничений на размер результата (BigInteger)
 */

public class FiboB {

    private long startTime = System.currentTimeMillis();

    private long time() {
        return System.currentTimeMillis() - startTime;
    }

    public static void main(String[] args) {

        //вычисление чисел простым быстрым методом
        FiboB fibo = new FiboB();
        int n = 55555;
        System.out.printf("fastB(%d)=%d \n\t time=%d \n\n", n, fibo.fastB(n), fibo.time());
    }

    BigInteger fastB(Integer n) {
        //здесь реализован вариант с временем O(n) и памятью O(n)
        if (n == 1) return BigInteger.ONE;
        else if (n == 0) return BigInteger.ZERO;
        else {
            BigInteger[] fibArray;
            fibArray = new BigInteger[n+1];
            fibArray[0] = BigInteger.ZERO;
            fibArray[1] = BigInteger.ONE;
            for (int i = 2; i <= n; i++) {
                fibArray[i] = fibArray[i-1].add(fibArray[i-2]);
                //System.out.println(i);
            }
            //System.out.println(fibArray[n]);
            //System.out.println(Arrays.toString(fibArray));
            return fibArray[n];
        }
    }

}

