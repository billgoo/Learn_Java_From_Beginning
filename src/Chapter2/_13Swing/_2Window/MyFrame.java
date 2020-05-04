package Chapter2._13Swing._2Window;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyJDialog extends JDialog {
    public MyJDialog(MyFrame frame) {
        // 实例化父类对象，指定父窗体，标题和对象
        super(frame, "第一个JDialog窗体", true);

        // 创建一个容器
        Container container = getContentPane();
        container.add(new JLabel("这是一个对话框"));
        setBounds(120, 120, 100, 100);  // 设置窗体大小
    }
}

public class MyFrame extends JFrame {
    public MyFrame() {
        Container container = getContentPane();
        container.setLayout(null);
        JLabel jl = new JLabel("这是一个JFrame窗体");    // 创建标签
        jl.setHorizontalAlignment(SwingConstants.CENTER);   // 文字居中
        container.add(jl);                                  // 添加到容器中
        container.setBackground(Color.WHITE);

        JButton bl = new JButton("弹出对话框");
        bl.setBounds(10, 10, 100, 21);
        // 添加鼠标按钮事件
        bl.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 使Dialog可见
                new MyJDialog(MyFrame.this).setVisible(true);
            }
        });
        container.add(bl);

        setVisible(true);
        setSize(200, 150);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new MyFrame();
    }
}
