package Chapter2._13Swing._3LabelAndIcon;

import javax.swing.*;
import java.awt.*;

public class DrawIcon implements Icon {
    private int width;
    private int height;

    public DrawIcon(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        g.fillOval(x, y, width, height);    // 绘制一个图形
    }

    @Override
    public int getIconWidth() {
        return this.width;
    }

    @Override
    public int getIconHeight() {
        return this.height;
    }

    public static void main(String[] args) {
        DrawIcon icon = new DrawIcon(15, 15);
        JLabel j = new JLabel("测试", icon, SwingConstants.CENTER);
        JFrame jf = new JFrame();
        Container c = jf.getContentPane();
        c.add(j);
        c.setBackground(Color.WHITE);
        jf.setVisible(true);
        jf.setSize(200, 150);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
