package Chapter2._13Swing._4Layout;

import javax.swing.*;
import java.awt.*;

public class GridLayoutPosition extends JFrame {
    public GridLayoutPosition() {
        setTitle("本窗体使用网格布局管理器");
        setLayout(new GridLayout(7, 3, 5, 5));  // 7行3列横竖gap5
        Container c = getContentPane();
        for (int i = 0; i < 20; i++) {
            c.add(new JButton("button" + i));
        }
        setSize(400, 300);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new GridLayoutPosition();
        /**
         * 从左至右，从上到下摆放
         */
    }
}
