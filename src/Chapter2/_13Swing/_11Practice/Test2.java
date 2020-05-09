package Chapter2._13Swing._11Practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test2 extends JFrame {
    private JComboBox<Integer> jcb = new JComboBox<>();
    private int[] comboArray;
    private JButton jb = new JButton("添加");
    private int count = 0;

    public Test2(int n) {
        if (n < 1) {
            n = 100;
        }

        comboArray = new int[n];
        for (int i = 0; i < n; i++) {
            comboArray[i] = i;
        }

        setSize(200, 150);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setLayout(new GridLayout(2, 1, 10, 10));

        Container cp = getContentPane();
        final JPanel jp1 = new JPanel();
        final JPanel jp2 = new JPanel();
        cp.add(jp1);
        cp.add(jp2);
        jp1.add(jcb);
        jp2.add(jb);

        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    jcb.addItem(comboArray[count++]);
                } catch (Exception exception) {
                    jcb.addItem(comboArray[0]);
                }
            }
        });
    }

    public static void main(String[] args) {
        new Test2(100);
    }
}
