package Chapter2._13Swing._6Button;

import Chapter2._13Swing._3LabelAndIcon.MyImageIcon;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class JButtonTest extends JFrame {
    public JButtonTest() {
        URL url = MyImageIcon.class.getResource("imageButton.jpg");
        Icon icon = new ImageIcon(url);
        setLayout(new GridLayout(3, 2, 5, 5));
        Container c = getContentPane();
        for (int i = 0; i < 5; i++) {
            JButton J = new JButton("button" + i, icon);
            c.add(J);
            if (i % 2 == 0) {
                J.setEnabled(false);            // 设置其中一些按钮不可用
            }
        }
        JButton jb = new JButton();
        jb.setMaximumSize(new Dimension(90, 30));
        jb.setIcon(icon);
        jb.setHideActionText(true);
        jb.setToolTipText("图片按钮");          // 设置提示文字
        jb.setBorderPainted(false);

        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 弹出确认对话框
                JOptionPane.showMessageDialog(null, "弹出对话框");
            }
        });
        c.add(jb);

        // setTitle("");
        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }

    public static void main(String[] args) {
        new JButtonTest();
    }
}
