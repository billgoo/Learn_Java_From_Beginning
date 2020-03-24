package Chapter1._9NumberProcess._4BigNumber;

import java.math.BigInteger;

public class BigIntegerDemo {
    public static void main(String[] args) {
        BigInteger bigInstance = new BigInteger("4");

        System.out.println(bigInstance.add(new BigInteger("2")));
        System.out.println(bigInstance.subtract(new BigInteger("2")));
        System.out.println(bigInstance.multiply(new BigInteger("2")));
        System.out.println(bigInstance.divide(new BigInteger("2")));

        System.out.print("4除以3的商和余数：");
        System.out.println(bigInstance.divideAndRemainder(new BigInteger("3"))[0]);
        System.out.println(bigInstance.divideAndRemainder(new BigInteger("3"))[1]);

        System.out.println(bigInstance.pow(2));
        System.out.println(bigInstance.negate());

        System.out.println(bigInstance.shiftLeft(2));   // 作为二进制进行shift，结果是16

        System.out.println(bigInstance.equals(new BigInteger("4")));
    }
}
