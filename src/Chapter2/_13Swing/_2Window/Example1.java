package Chapter2._13Swing._2Window;

import java.awt.*;
import javax.swing.*;

public class Example1 extends JFrame {
    public void CreateJFrame(String title) {
        JFrame jf = new JFrame(title);
        Container container = jf.getContentPane();          // 获取一个容器

        JLabel jl = new JLabel("这是一个JFrame窗体");    // 创建标签
        jl.setHorizontalAlignment(SwingConstants.CENTER);   // 文字居中
        container.add(jl);                                  // 添加到容器中
        container.setBackground(Color.WHITE);               // 背景色

        jf.setVisible(true);
        jf.setSize(200, 150);

        // 设置窗体关闭方式
        // 点关闭没有用，什么都不做将窗体关闭
        // jf.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        // 点关闭有用，任何注册监听程序对象后会释放窗体
        // jf.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        // 点关闭或隐藏窗体但是不会关闭，隐藏窗口的默认窗体关闭
        // jf.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
        // 点关闭就关闭窗体，退出应用程序默认窗体关闭
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Example1().CreateJFrame("创建一个JFrame窗体");
    }
}
