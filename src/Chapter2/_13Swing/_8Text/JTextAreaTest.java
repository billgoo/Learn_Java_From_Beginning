package Chapter2._13Swing._8Text;

import javax.swing.*;
import java.awt.*;

public class JTextAreaTest extends JFrame {
    public JTextAreaTest() {
        setSize(200, 100);
        setTitle("定义自动换行的文本域");
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        Container cp = getContentPane();

        JTextArea jt = new JTextArea("文本域", 6, 6);
        jt.setLineWrap(true);               // 可以自动换行
        cp.add(jt);

        setVisible(true);
    }

    public static void main(String[] args) {
        new JTextAreaTest();
    }
}
