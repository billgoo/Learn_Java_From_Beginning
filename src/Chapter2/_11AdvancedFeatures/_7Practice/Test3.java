package Chapter2._11AdvancedFeatures._7Practice;

public class Test3 {
    static class a{
        void f(){
            System.out.println("f()");
        }
    }
    public static void main(String[] args){
        Test3.a a=new a();
        a.f();
    }

}
