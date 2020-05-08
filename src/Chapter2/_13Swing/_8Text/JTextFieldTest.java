package Chapter2._13Swing._8Text;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JTextFieldTest extends JFrame {
    public JTextFieldTest() {
        setSize(250, 150);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());

        final JTextField jt = new JTextField("aaa", 20);
        final JPasswordField jp = new JPasswordField("bbb", 20);
        jp.setEchoChar('#');
        final JButton jb = new JButton("清除");

        cp.add(jt);
        cp.add(jp);
        cp.add(jb);

        jt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 按回车则触发事件
                jt.setText("触发事件");
            }
        });

        jp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 按回车则触发事件
                jt.setText("设置密码");
                jp.setText("ccccc");
                jp.setEchoChar('*');
            }
        });

        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jt.setText("");
                jp.setText("");
                jt.requestFocus();                      // 焦点回到文本框
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new JTextFieldTest();
    }
}
