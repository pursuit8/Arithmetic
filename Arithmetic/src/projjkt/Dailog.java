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

        JLabel jLabel = new JLabel("��ȷ��Ҫ�ύ�㣡��");
        jLabel.setFont(new Font("����",Font.BOLD,25));

        JPanel jp1 = new JPanel();
        JPanel jp2 = new JPanel();
        jp1.setLayout(new FlowLayout(1));
        jp2.setLayout(new FlowLayout(1));
        jp1.add(jLabel);

        JButton btn1 = new JButton("�����ҵ���ˣ�");
        JButton btn2 = new JButton("�ǵģ���ȷ����");
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
