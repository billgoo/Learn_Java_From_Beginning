package Chapter2._13Swing._11Practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class Test3 extends JFrame {
    private JLabel jLabelName = new JLabel("用户名: ");
    private JLabel jLabelPass = new JLabel("密码: ");
    private JTextField name = new JTextField();
    private JPasswordField password = new JPasswordField();
    private JButton jbOk = new JButton("确定");
    private JButton jbReset = new JButton("重置");

    public Test3() {
        setBounds(300, 200, 300, 150);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setVisible(true);
        // setLayout(new GridLayout(3, 1, 10, 10));
        setLayout(null);

        Container cp = getContentPane();
        cp.add(jLabelName);
        cp.add(jLabelPass);
        cp.add(name);
        cp.add(password);
        cp.add(jbOk);
        cp.add(jbReset);

        jLabelName.setBounds(10, 10, 200, 18);
        jLabelPass.setBounds(10, 50, 200, 18);
        name.setBounds(80, 10, 150, 18);
        password.setBounds(80, 50, 150, 18);

        jbOk.setBounds(80, 80, 60, 18);
        jbReset.setBounds(150, 80, 60, 18);

        jbOk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (name.getText().trim().length() == 0 ||
                        new String(password.getPassword()).trim().length() == 0) {
                    JOptionPane.showMessageDialog(null, "用户名密码不允许为空");
                    return;
                }

                if (name.getText().trim().equals("mr") &&
                        new String(password.getPassword()).trim().equals("mrsoft")) {
                    JOptionPane.showMessageDialog(null, "登录成功");
                } else {
                    JOptionPane.showMessageDialog(null, "用户名或密码错误");
                }
            }
        });

        jbReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                name.setText("");
                password.setText("");
            }
        });
    }

    public static void main(String[] args) {
        new Test3();
    }
}
