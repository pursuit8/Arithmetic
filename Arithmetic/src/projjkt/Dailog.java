package projjkt;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dailog extends JDialog {
    public Dailog(String []arr,double []userAnswer,double []rightAnswer){
        setVisible(true);
        setBounds(700,150,500,250);
        setLayout(new GridLayout(2,1));
        Container c = getContentPane();

        JLabel jLabel = new JLabel("您确定要提交咩！？");
        jLabel.setFont(new Font("宋体",Font.BOLD,25));

        JPanel jp1 = new JPanel();
        JPanel jp2 = new JPanel();
        jp1.setLayout(new FlowLayout(1));
        jp2.setLayout(new FlowLayout(1));
        jp1.add(jLabel);

        JButton btn1 = new JButton("不！我点错了！");
        JButton btn2 = new JButton("是的！我确定！");
        jp2.add(btn1);
        jp2.add(btn2);

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });

        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new FinalShit(arr,userAnswer,rightAnswer);
                setVisible(false);
            }
        });

        c.add(jp1);
        c.add(jp2);

    }

}
