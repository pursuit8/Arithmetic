package projjkt;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FinalShit extends JFrame {
    int grade = 0;
    int []flag = new int[20];
    public FinalShit(String arr[],double users[],double right[]){
        setBounds(550,95,1300,800);
        setLayout(new GridLayout(2,1));

        for (int x = 0;x < 20;x++){
            if (users[x] == right[x]){
                grade = grade + 5;
                flag[x] = 1;
            }
            else {
                flag[x] =0;
            }
        }

        JPanel jp1 = new JPanel();
        jp1.setLayout(new GridLayout(2,1));
        jp1.setBorder(BorderFactory.createTitledBorder("����"));
        JPanel jp11 = new JPanel();
        jp11.setLayout(new FlowLayout(1));
        JLabel jl = new JLabel("���ĵ÷�Ϊ��"+grade );
        jl.setFont(new Font("����",Font.BOLD,30));
        jp11.add(jl);
        JPanel jp3 = new JPanel();
        jp3.setLayout(new FlowLayout(1));
        JButton btnx = new JButton("������ҳ");
        btnx.setBounds(100,100,80,30);
        jp3.add(btnx);
        btnx.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new Window();
				setVisible(false);
				
			}
		});
        jp1.add(jp11);
        jp1.add(jp3);


        JPanel jp2 = new JPanel();
        jp2.setLayout(new GridLayout(5,4));
        jp2.setBorder(BorderFactory.createTitledBorder("�������"));
        for (int y = 0;y < 20;y++){
            JLabel jLabel = new JLabel("����" + (y + 1) + "�⡿" + arr[y] + right[y] +"��Ĵ𰸣�" + users[y] );
            if (flag[y] == 0){
                jLabel.setForeground(Color.RED);
            }
            else if (flag[y] == 1){
                jLabel.setForeground(Color.BLACK);
            }
            jp2.add(jLabel);
        }

        


        add(jp1);
        add(jp2);

        setVisible(true);









    }

}
