package projjkt;

import javax.print.DocFlavor;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class Window extends JFrame {
    public Window(){
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setBounds(550,50,640,400);
        setTitle("四则运算");
        setResizable(false);

        String items[] = {"请选择","中文","English"};
        JComboBox<String> jComboBox = new JComboBox<>(items);
        jComboBox.setBounds(50,20,80,30);

        JLabel jLabel = new JLabel();
        URL url = Window.class.getResource("background.jpg");
        Icon icon = new ImageIcon(url);
        jLabel.setIcon(icon);
        jLabel.setBounds(0,0,1000,400);

        JLabel jLabel2 = new JLabel("语言:");
        jLabel2.setBounds(10,20,50,30);

        JButton btn = new JButton("开始挑战");
        btn.setBounds(500,20,100,50);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (jComboBox.getSelectedItem() == "中文"){
                    new WidowPractice(0);//鐐瑰嚮鈥濆紑濮嬫寫鎴樷?滆繖涓寜閽箣鍚庤烦杞埌缁冧範鐣岄潰
                }
                else if (jComboBox.getSelectedItem() == "English"){
                    new EnglishWindowPractice(0);
                }

                new CountingDailog();


            }
        });

        Container c = getContentPane();

        c.add(jLabel2);
        c.add(jComboBox);
        c.add(btn);
        c.add(jLabel);
        c.setLayout(null);

    }

    public static void main(String[] args) {
       
    }
}
