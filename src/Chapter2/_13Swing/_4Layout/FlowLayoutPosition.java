package Chapter2._13Swing._4Layout;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutPosition extends JFrame {
    public FlowLayoutPosition() {
        setTitle("本窗体使用流布局管理器");
        setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 10));
        Container c = getContentPane();
        for (int i = 0; i < 10; i++) {
            c.add(new JButton("button" + i));
        }
        setSize(300, 200);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }

    public static void main(String[] args) {
        new FlowLayoutPosition();
        /**
         * 从左至右，从上到下摆放
         */
    }
}
