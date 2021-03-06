package Chapter1._9NumberProcess._6Practice;

import java.math.*;

public class Test3 {

	/**
	 * @param args
	 */
	public static BigDecimal div(double value1, double value2, int b, int r) {
		if(b < 0) {
			System.out.println("bֵ值必须大于等于0");
		}
		BigDecimal b1 = new BigDecimal(Double.toString(value1));
		BigDecimal b2 = new BigDecimal(Double.toString(value2));
		return b1.divide(b2, b, r);
	}

	public static void main(String[] args) {
		// TODO 自动生成方法存根
		Test3 u = new Test3();
		System.out.println(u.div(-7.5, 8.9, 5, BigDecimal.ROUND_CEILING));
		System.out.println(u.div(-7.5, 8.9, 5, BigDecimal.ROUND_DOWN));
		System.out.println(u.div(-7.5, 8.9, 5, BigDecimal.ROUND_FLOOR));
		System.out.println(u.div(-7.5, 8.9, 5, BigDecimal.ROUND_HALF_DOWN));
		System.out.println(u.div(-7.5, 8.9, 5, BigDecimal.ROUND_HALF_EVEN));
		System.out.println(u.div(-7.5, 8.9, 5, BigDecimal.ROUND_HALF_UP));
		System.out.println(u.div(-7.5, 8.9, 5, BigDecimal.ROUND_UP));
	}
}
