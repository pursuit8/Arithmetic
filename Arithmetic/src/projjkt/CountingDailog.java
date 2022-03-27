package projjkt;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class CountingDailog extends JDialog{
	int hour = 0;
    int minute = 0;
    int second = 0;
    public CountingDailog(){
        setVisible(true);
        setLayout(new GridLayout(3,1));
        setBounds(500,200,500,200);
        JPanel jp1 = new JPanel();
        jp1.setLayout(null);
        JTextField jTextFieldHour = new JTextField();
        jTextFieldHour.setBounds(150,10,50,20);
        jTextFieldHour.setFont(new Font("宋体",Font.BOLD,12));
        JTextField jTextFieldMinute = new JTextField();
        jTextFieldMinute.setBounds(210,10,50,20);
        jTextFieldMinute.setFont(new Font("宋体",Font.BOLD,12));
        JTextField jTextFieldSecond = new JTextField();
        jTextFieldSecond.setBounds(270,10,50,20);
        jTextFieldSecond.setFont(new Font("宋体",Font.BOLD,12));
        jp1.add(jTextFieldHour);
        jp1.add(jTextFieldMinute);
        jp1.add(jTextFieldSecond);

        JPanel jp2 = new JPanel();
        jp2.setLayout(new FlowLayout(1));
        JLabel jl = new JLabel("请输入限制的：时-分-秒");
        jl.setBounds(100,100,100,20);
        jp2.add(jl);

        JPanel jp3 = new JPanel();
        jp3.setLayout(new FlowLayout(1));
        JButton btn1 = new JButton("确定");
        btn1.setBounds(100,100,80,20);
        jp3.add(btn1);

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                hour = Integer.parseInt(jTextFieldHour.getText());
                minute = Integer.parseInt(jTextFieldMinute.getText());
                second = Integer.parseInt(jTextFieldSecond.getText());
                if ((hour == 0)&&(minute == 0)&&(second == 0)){

                	setVisible(false);
                }
                else {
                    new CountingTime(hour,minute,second);
                    setVisible(false);
                }
            }
        });
        add(jp2);
        add(jp1);
        add(jp3);
    }

}
