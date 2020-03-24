package Chapter1._9NumberProcess._1NumberFormat;

import java.text.DecimalFormat;

public class DecimalFormatSimpleDemo {

    // 使用实例化对象格式化
    static public void SingleFormat(String pattern, double value) {
        DecimalFormat myFormat = new DecimalFormat(pattern);
        String output = myFormat.format(value);
        System.out.println(value + " " + pattern + " " + output);
    }

    // 使用applyPattern()方法格式化
    static public void UseApplyPatternMethodFormat(String pattern, double value) {
        DecimalFormat myFormat = new DecimalFormat();
        myFormat.applyPattern(pattern);
        String output = myFormat.format(value);
        System.out.println(value + " " + pattern + " " + output);
    }


    public static void main(String[] args) {
        SingleFormat("###,###.###", 123456.789);
        SingleFormat("00000000.###kg", 123456.789);
        SingleFormat("000000.000", 123.78);
        SingleFormat("#.###%", 0.789);
        SingleFormat("###.##", 123456.789);
        SingleFormat("0.00\u2030", 0.789);

        System.out.println();

        UseApplyPatternMethodFormat("###,###.###", 123456.789);
        UseApplyPatternMethodFormat("00000000.###kg", 123456.789);
        UseApplyPatternMethodFormat("000000.000", 123.78);
        UseApplyPatternMethodFormat("#.###%", 0.789);
        UseApplyPatternMethodFormat("###.##", 123456.789);
        UseApplyPatternMethodFormat("0.00\u2030", 0.789);

        /**
         * 123456.789 ###,###.### 123,456.789
         * 123456.789 00000000.###kg 00123456.789kg
         * 123.78 000000.000 000123.780
         * 0.789 #.###% 78.9%
         * 123456.789 ###.## 123456.79
         * 0.789 0.00‰ 789.00‰
         *
         * 123456.789 ###,###.### 123,456.789
         * 123456.789 00000000.###kg 00123456.789kg
         * 123.78 000000.000 000123.780
         * 0.789 #.###% 78.9%
         * 123456.789 ###.## 123456.79
         * 0.789 0.00‰ 789.00‰
         */
    }
}
