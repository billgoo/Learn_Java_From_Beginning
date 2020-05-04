package Chapter2._13Swing._4Layout;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutPosition extends JFrame {
    String[] border = {BorderLayout.CENTER, BorderLayout.NORTH,
                BorderLayout.SOUTH, BorderLayout.WEST, BorderLayout.EAST};
    String[] buttonName = {BorderLayout.CENTER, BorderLayout.NORTH,
            BorderLayout.SOUTH, BorderLayout.WEST, BorderLayout.EAST};

    public BorderLayoutPosition() {
        setTitle("本窗体使用边界布局管理器");
        setLayout(new BorderLayout());
        Container c = getContentPane();
        for (int i = 0; i < border.length; i++) {
            c.add(border[i], new JButton(buttonName[i]));
        }
        setSize(350, 200);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }

    public static void main(String[] args) {
        new BorderLayoutPosition();
    }
}
