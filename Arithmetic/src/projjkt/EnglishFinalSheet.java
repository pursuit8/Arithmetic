package projjkt;

import javax.swing.*;
import java.awt.*;

public class EnglishFinalSheet extends JFrame {
    int grade = 0;
    int []flag = new int[20];
    public EnglishFinalSheet(String arr[],double users[],double right[]){
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
        jp1.setLayout(new FlowLayout(1));
        jp1.setBorder(BorderFactory.createTitledBorder("Score"));
        JLabel jl = new JLabel("Your final score£º"+grade );
        jl.setFont(new Font("ËÎÌå",Font.BOLD,30));
        jp1.add(jl);


        JPanel jp2 = new JPanel();
        jp2.setLayout(new GridLayout(5,4));
        jp2.setBorder(BorderFactory.createTitledBorder("Your answer sheet"));
        for (int y = 0;y < 20;y++){
            JLabel jLabel = new JLabel("¡¾Q" + (y + 1) + "¡¿:" + arr[y] + right[y] +"  your answer:" + users[y] );
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
