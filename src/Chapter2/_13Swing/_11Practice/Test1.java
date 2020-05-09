package Chapter2._13Swing._11Practice;

import javax.swing.*;
import java.awt.*;

public class Test1 extends JFrame {
    private JComboBox<String> comboBox;

    public Test1() {
        setSize(400, 300);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout());

        Container cp = getContentPane();

        final JPanel jPanelCenter = new JPanel();
        final JPanel jPanelSouth = new JPanel();
        cp.add(jPanelCenter, BorderLayout.CENTER);
        cp.add(jPanelSouth, BorderLayout.SOUTH);

        // north
        comboBox = new JComboBox<>();
        comboBox.addItem("红");
        comboBox.addItem("黄");
        comboBox.addItem("蓝");
        comboBox.addItem("绿");
        cp.add(comboBox, BorderLayout.NORTH);

        // center
        final JCheckBox checkBoxMale = new JCheckBox("男");
        final JCheckBox checkBoxFemale = new JCheckBox("女");
        jPanelCenter.add(checkBoxMale);
        jPanelCenter.add(checkBoxFemale);

        // south
        final JButton jButtonOk = new JButton("确定");
        final JButton jButtonCancel = new JButton("取消");
        jPanelSouth.add(jButtonOk);
        jPanelSouth.add(jButtonCancel);
    }

    public static void main(String[] args) {
        new Test1();
    }
}
