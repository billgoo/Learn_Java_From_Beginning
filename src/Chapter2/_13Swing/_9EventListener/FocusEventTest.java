package Chapter2._13Swing._9EventListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class FocusEventTest extends JFrame {
    public FocusEventTest() {
        setSize(250, 100);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());

        final JLabel jl = new JLabel();
        cp.add(jl);

        JTextField jt = new JTextField("请单击其他文本框", 10);
        JTextField jt2 = new JTextField("请单击我", 10);
        cp.add(jt);
        cp.add(jt2);

        jt.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {

            }

            @Override
            public void focusLost(FocusEvent e) {
                JOptionPane.showMessageDialog(null, "文本框失去焦点");
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new FocusEventTest();
    }
}
