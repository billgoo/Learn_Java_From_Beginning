package Chapter1._9NumberProcess._4BigNumber;

import java.math.BigDecimal;

public class BigDecimalDemo {
    static final int scale = 10;

    /**
     * @param value1
     * @param value2
     * @return 两数之和
     */
    public BigDecimal add(double value1, double value2) {
        BigDecimal b1 = new BigDecimal(Double.toString(value1));
        BigDecimal b2 = new BigDecimal(Double.toString(value2));
        return b1.add(b2);
    }

    /**
     * @param value1
     * @param value2
     * @return 两数之差
     */
    public BigDecimal sub(double value1, double value2) {
        BigDecimal b1 = new BigDecimal(Double.toString(value1));
        BigDecimal b2 = new BigDecimal(Double.toString(value2));
        return b1.subtract(b2);
    }

    /**
     * @param value1
     * @param value2
     * @return 两数之积
     */
    public BigDecimal mul(double value1, double value2) {
        BigDecimal b1 = new BigDecimal(Double.toString(value1));
        BigDecimal b2 = new BigDecimal(Double.toString(value2));
        return b1.multiply(b2);
    }

    /**
     * @param value1
     * @param value2
     * @return 两数之商
     */
    public BigDecimal div(double value1, double value2) {
        return div(value1, value2, scale);
    }

    private BigDecimal div(double value1, double value2, int scale) {
        if (scale < 0) {
            System.out.println("scale必须大于0");
            return null;
        }
        BigDecimal b1 = new BigDecimal(Double.toString(value1));
        BigDecimal b2 = new BigDecimal(Double.toString(value2));
        return b1.divide(b2, scale, BigDecimal.ROUND_HALF_UP);
    }

    public static void main(String[] args) {
        BigDecimalDemo b = new BigDecimalDemo();
        System.out.println(b.add(-7.5, 8.9));
        System.out.println(b.sub(-7.5, 8.9));
        System.out.println(b.mul(-7.5, 8.9));
        System.out.println(b.div(10, 2));
        System.out.println(b.div(-7.5, 8.9, 5));
    }
}
