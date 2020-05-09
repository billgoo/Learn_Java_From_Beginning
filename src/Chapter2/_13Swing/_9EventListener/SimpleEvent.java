package Chapter2._13Swing._9EventListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleEvent extends JFrame {
    private JButton jb = new JButton("我是按钮，单击我");

    public SimpleEvent() {
        setLayout(null);
        setSize(200, 100);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        Container cp = getContentPane();
        cp.add(jb);
        jb.setBounds(10, 10, 100, 30);

        jb.addActionListener(new jbAction());

        setVisible(true);
    }

    // 定义内部类实现ActionListener接口
    class jbAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            jb.setText("我被单击了");
        }
    }

    public static void main(String[] args) {
        new SimpleEvent();
    }
}
