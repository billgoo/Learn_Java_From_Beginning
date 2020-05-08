package Chapter2._13Swing._7List;

import javax.swing.*;
import java.awt.*;

public class JListTest extends JFrame {
    public JListTest() {
        Container cp = getContentPane();
        cp.setLayout(null);
        // JList<String> jl = new JList<>(new MyListModel());
        final String[] flavors = {"列表1", "列表2", "列表3", "列表4", "列表5", "列表6" };
        final DefaultListModel items = new DefaultListModel();
        final JList jl = new JList(items);
        for (int i = 0; i < 6; i++) {
            items.addElement(flavors[i]);
        }

        JScrollPane js = new JScrollPane(jl);
        js.setBounds(10, 10, 100, 100);
        cp.add(js);
        setTitle("在这个窗体中使用了列表框");
        setSize(200, 150);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }

    public static void main(String[] args) {
        new JListTest();
    }
}

class MyListModel extends AbstractListModel<String> {
    private String[] contents = { "列表1", "列表2", "列表3", "列表4", "列表5", "列表6" };

    @Override
    public int getSize() {
        return contents.length;
    }

    @Override
    public String getElementAt(int index) {
        if (index < contents.length) {
            return contents[index++];
        } else {
            return null;
        }
    }
}
