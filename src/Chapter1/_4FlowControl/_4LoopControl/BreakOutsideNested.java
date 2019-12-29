package Chapter1._4FlowControl._4LoopControl;

public class BreakOutsideNested {
    public static void main(String[] args) {
        Loop: for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                if (j == 4) {
                    break Loop;
                }
                System.out.println("i=" + i + "j=" + j);
            }
        }
        //i=0j=0
        //i=0j=1
        //i=0j=2
        //i=0j=3
    }
}
