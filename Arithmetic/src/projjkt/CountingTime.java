package projjkt;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CountingTime extends JFrame{
    boolean flag = false;
    int hour = 1;
    int minute = 0;
    int second = 0;
    JButton btn = new JButton("Start");
    JLabel jtimeshow = new JLabel("00:00:00");
    public CountingTime(int h,int m,int s){
    	hour = h;
    	minute = m;
    	second = s;
        setVisible(true);
        setBounds(100,30,250,200);
        setResizable(false);
        setLayout(new GridLayout(2,1));
        JPanel jp1 = new JPanel();
        JPanel jp2 = new JPanel();



        jtimeshow.setBounds(200,10,80,40);
        jtimeshow.setFont(new Font("ËÎÌו",Font.BOLD,20));
        jp2.add(jtimeshow);


        btn.setBounds(80,140,80,20);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                flag = true;

            }
        });
        jp1.add(btn);


        add(jp2);
        add(jp1);

        new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jtimeshow.setText(hour + ":" + minute + ":" + second);
                second --;
                if (second < 0){
                    second = 59;
                    minute --;
                    if (minute < 0){
                        minute = 59;
                        hour --;
                        if (hour < 0){
                            flag = false;
                        }
                    }
                }
            }
        }).start();




    }

}
