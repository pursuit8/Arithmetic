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
        setTitle("��������");
        setResizable(false);

        String items[] = {"��ѡ��","����","English"};
        JComboBox<String> jComboBox = new JComboBox<>(items);
        jComboBox.setBounds(50,20,80,30);

        JLabel jLabel = new JLabel();
        URL url = Window.class.getResource("background.jpg");
        Icon icon = new ImageIcon(url);
        jLabel.setIcon(icon);
        jLabel.setBounds(0,0,1000,400);

        JLabel jLabel2 = new JLabel("����:");
        jLabel2.setBounds(10,20,50,30);

        JButton btn = new JButton("��ʼ��ս");
        btn.setBounds(500,20,100,50);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (jComboBox.getSelectedItem() == "����"){
                    new WidowPractice(0);//点击”开始挑战�?�这个按钮之后跳转到练习界面
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
