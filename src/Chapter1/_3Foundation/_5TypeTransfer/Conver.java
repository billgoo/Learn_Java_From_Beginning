package Chapter1._3Foundation._5TypeTransfer;

public class Conver {
    public static void main(String[] args) {
        byte mybyte = 127;
        int myint = 150;
        float myfloat = 452.12f;
        char mychar = 10;
        double mydouble = 45.46546;
        System.out.println(mybyte + myfloat);
        System.out.println(mybyte * myint);
        System.out.println(mybyte / mychar);
        System.out.println(mydouble + mychar);
        //579.12
        //19050
        //12
        //55.46546
        /*
        * 强制类型转换
        * byte b = (byte)129
        * int b = (int)'d'
        * */
    }
}
