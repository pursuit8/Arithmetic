package projjkt;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class WidowPractice extends JFrame {//å®šä¹‰ä¸?ä¸ªç”»å¸ƒå†…éƒ¨ç±»ç»˜åˆ¶èƒŒæ™¯å›¾æ¡ˆ
    int i = 0;
    String aarr[] = new String[20];
    double answer[] = new double[20];//å®šä¹‰ä¸?ä¸ªå­˜å‚¨ç”¨æˆ·è¾“å…¥ç­”æ¡ˆçš„æ•°ç»„
    public class MyCanvas extends Canvas{
        @Override
        public void paint(Graphics g) {
            Graphics2D g2 = (Graphics2D)g;


            //ç¬¬ä¸€ä¸ªæ­£æ–¹ä½“
            Stroke dash = new BasicStroke(2.5f,BasicStroke.CAP_BUTT,BasicStroke.JOIN_ROUND,3.5f,new float[]{15,10},0f);
            Stroke pen = new BasicStroke(8);
            Stroke initPen = new BasicStroke(5);
            //è™šçº¿ç”»ç¬”
            g2.setStroke(initPen);
            g2.drawLine(100,100,250,100);
            g2.drawLine(50,180,200,180);
            g2.drawLine(100,100,50,180);
            g2.drawLine(250,100,200,180);
            g2.drawLine(50,180,50,330);
            g2.drawLine(200,180,200,330);
            g2.drawLine(250,100,250,250);
            g2.drawLine(50,330,200,330);
            g2.drawLine(200,330,250,250);

            //å·¦çº¢æ—?
            g2.setStroke(pen);
            g2.drawLine(160,120,160,30);
            int []triangleX = {160,250,160};
            int []triangleY = {25,42,72};
            g2.setColor(Color.RED);
            g2.fillPolygon(triangleX,triangleY,3);
            //æ¢å¤åˆå§‹ç”»ç¬”
            g2.setStroke(initPen);
            g2.setColor(Color.BLACK);


            //ç¬¬äºŒä¸ªæ­£æ–¹ä½“
            //g2.drawLine(100,100 + 150,250,100 + 150);
            g2.drawLine(50,180 + 150,200,180 + 150);
            //g2.drawLine(100,100 + 150,50,180 + 150);
            g2.drawLine(250,100 + 150,200,180 + 150);
            g2.drawLine(50,180 + 150,50,330 + 150);
            g2.drawLine(200,180 + 150,200,330 + 150);
            g2.drawLine(250,100 + 150,250,250+ 150);
            g2.drawLine(50,330 + 150,200,330 +150);
            g2.drawLine(200,330 + 150,250,250 + 150);

            //ç¬¬ä¸‰ä¸ªæ­£æ–¹ä½“
            //g2.drawLine(100,100 + 300,250,100 + 300);
            g2.drawLine(50,180 + 300,200,180 + 300);
            //g2.drawLine(100,100 + 300,50,180 + 300);
            g2.drawLine(250,100 + 300,200,180 + 300);
            g2.drawLine(50,180 + 300,50,330 + 300);
            g2.drawLine(200,180 + 300,200,330 + 300);
            //g2.drawLine(250,100 + 300,250,250 + 300);
            g2.drawLine(50,330 + 300,200,330 + 300);
            //g2.drawLine(200,330 + 300,250,250 + 300);

            //ç¬¬å››ä¸ªæ­£æ–¹ä½“
            g2.drawLine(100 + 150,100 + 300,250 + 150,100 + 300);
            g2.drawLine(50 + 150,180 + 300,200 + 150,180 + 300);
            g2.drawLine(100 + 150,100 + 300,50 + 150,180 + 300);
            g2.drawLine(250 + 150,100 + 300,200 + 150,180 + 300);
            g2.drawLine(50 + 150,180 + 300,50 + 150,330 + 300);
            g2.drawLine(200 + 150,180 + 300,200 + 150,330 + 300);
            //g2.drawLine(250 + 150,100 + 300,250 + 150,250 + 300);
            g2.drawLine(50 + 150,330 + 300,200 + 150,330 + 300);
            //g2.drawLine(200 + 150,330 + 300,250 + 150,250 + 300);

            //ç¬¬äº”ä¸ªæ­£æ–¹ä½“
            g2.drawLine(100 + 300,100 + 300,250 + 300,100 + 300);
            g2.drawLine(50 + 300,180 + 300,200 + 300,180 + 300);
            g2.drawLine(100 + 300,100 + 300,50 + 300,180 + 300);
            g2.drawLine(250 + 300,100 + 300,200 + 300,180 + 300);
            g2.drawLine(50 + 300,180 + 300,50 + 300,330 + 300);
            g2.drawLine(200 + 300,180 + 300,200 + 300,330 + 300);
            //g2.drawLine(250 + 300,100 + 300,250 + 300,250 + 300);
            g2.drawLine(50 + 300,330 + 300,200 + 300,330 + 300);
            //g2.drawLine(200 + 300,330 + 300,250 + 300,250 + 300);

            //ç¬¬å…­ä¸ªæ­£æ–¹ä½“
            g2.drawLine(100 + 450,100 + 300,250 + 450,100 + 300);
            g2.drawLine(50 + 450,180 + 300,200 + 450,180 + 300);
            g2.drawLine(100 + 450,100 + 300,50 + 450,180 + 300);
            g2.drawLine(250 + 450,100 + 300,200 + 450,180 + 300);
            g2.drawLine(50 + 450,180 + 300,50 + 450,330 + 300);
            g2.drawLine(200 + 450,180 + 300,200 + 450,330 + 300);
            //g2.drawLine(250 + 450,100 + 300,250 + 450,250 + 300);
            g2.drawLine(50 + 450,330 + 300,200 + 450,330 + 300);
           //g2.drawLine(200 + 450,330 + 300,250 + 450,250 + 300);

            //ç¬¬ä¸ƒä¸ªæ­£æ–¹ä½“
            g2.drawLine(100 + 600,100 + 300,250 + 550,100 + 300);
            g2.drawLine(50 + 600,180 + 300,200 + 600,180 + 300);
            g2.drawLine(100 + 600,100 + 300,50 + 600,180 + 300);
            //g2.drawLine(250 + 600,100 + 300,200 + 600,180 + 300);
            g2.drawLine(50 + 600,180 + 300,50 + 600,330 + 300);
            g2.drawLine(200 + 600,180 + 300,200 + 600,330 + 300);
            //g2.drawLine(250 + 600,100 + 300,250 + 600,250 + 300);
            g2.drawLine(50 + 600,330 + 300,200 + 600,330 + 300);
            //g2.drawLine(200 + 600,330 + 300,250 + 600,250 + 300);

            //ç¬¬å…«ä¸ªæ­£æ–¹ä½“
            //g2.drawLine(100 + 750,100 + 300,250 + 750,100 + 300);
            g2.drawLine(50 + 750,180 + 300,200 + 750,180 + 300);
            //g2.drawLine(100 + 750,100 + 300,50 + 750,180 + 300);
            g2.drawLine(250 + 750,100 + 300,200 + 750,180 + 300);
            g2.drawLine(50 + 750,180 + 300,50 + 750,330 + 300);
            g2.drawLine(200 + 750,180 + 300,200 + 750,330 + 300);
            g2.drawLine(250 + 750,100 + 300,250 + 750,250 + 300);
            g2.drawLine(50 + 750,330 + 300,200 + 750,330 + 300);
            g2.drawLine(200 + 750,330 + 300,250 + 750,250 + 300);

            //ç¬¬ä¹ä¸ªæ­£æ–¹ä½“
            //g2.drawLine(100 + 750,100 + 300 - 150,250 + 750,100 + 300 - 150);
            g2.drawLine(50 + 750,180 + 300 - 150,200 + 750,180 + 300 - 150);
            //g2.drawLine(100 + 750,100 + 300 - 150,50 + 750,180 + 300 - 150);
            g2.drawLine(250 + 750,100 + 300 - 150,200 + 750,180 + 300 - 150);
            g2.drawLine(50 + 750,180 + 300 - 150,50 + 750,330 + 300 - 150);
            g2.drawLine(200 + 750,180 + 300 - 150,200 + 750,330 + 300 - 150);
            g2.drawLine(250 + 750,100 + 300 - 150,250 + 750,250 + 300 - 150);
            g2.drawLine(50 + 750,330 + 300 - 150,200 + 750,330 + 300 - 150);
            g2.drawLine(200 + 750,330 + 300 - 150,250 + 750,250 + 300 - 150);

            //ç¬¬åä¸ªæ­£æ–¹ä½“
            g2.drawLine(100 + 750,100 ,250 + 750,100 );
            g2.drawLine(50 + 750,180 ,200 + 750,180 );
            g2.drawLine(100 + 750,100 ,50 + 750,180 );
            g2.drawLine(250 + 750,100 ,200 + 750,180 );
            g2.drawLine(50 + 750,180 ,50 + 750,330 );
            g2.drawLine(200 + 750,180 ,200 + 750,330 );
            g2.drawLine(250 + 750,100 ,250 + 750,250 );
            g2.drawLine(50 + 750,330 ,200 + 750,330 );
            g2.drawLine(200 + 750,330 ,250 + 750,250 );

            //å³çº¢æ—?
            g2.setStroke(pen);
            g2.drawLine(900,120,900,30);
            int []secondTriangleX = {900,990,900};
            int []secondTriangleY = {25,42,72};
            g2.setColor(Color.RED);
            g2.fillPolygon(secondTriangleX,secondTriangleY,3);
            g2.setStroke(initPen);
            g2.setColor(Color.BLACK);


            //ç»˜åˆ¶ç­”é¢˜è¾¹æ¡†
            Stroke stroke = new BasicStroke(15,BasicStroke.CAP_ROUND,BasicStroke.JOIN_ROUND);//è®¾ç½®ç”»ç¬”ç²—ä¸º8åƒç´ 
            g2.setStroke(stroke);//åŠ è½½ç”»ç¬”
            g2.setColor(Color.PINK);
            g2.drawLine(448,150,448,250);
            g2.drawLine(448,150,652,150);
            g2.drawLine(652,150,652,250);
            g2.drawLine(652,250,448,250);
            g2.drawLine(550,150,600,120);
            g2.drawLine(550,150,500,120);



        }
    }
    public WidowPractice(){

    }
    public WidowPractice(int nothing){
        MyCanvas canvas = new MyCanvas();
        Generator generator = new Generator();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        setBounds(550,50,1100,800);
        setTitle("--Á·Ï°Ä£Ê½--");

        JLabel jlable1 = new JLabel("¡¾ÌâÄ¿" + (i + 1) + "¡¿" +generator.generateQuestion(i));
        jlable1.setBounds(430,30,250,30);
        jlable1.setFont(new Font("ËÎÌå",Font.BOLD,20));

        JTextField jtxt = new JTextField("´ğÌâÇøÓò");
        jtxt.setColumns(20);
        jtxt.setFont(new Font("ËÎÌå",Font.BOLD,20));

        JScrollPane js = new JScrollPane(jtxt);
        js.setBounds(450,150,200,100);

        JButton btn2 = new JButton("ÉÏÒ»Ìâ");
        JButton btn1 = new JButton("ÏÂÒ»Ìâ");
        JButton submit = new JButton("Ìá½»");

        submit.setEnabled(false);
        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Dailog(generator.arr,answer,generator.score);
                answer[i] = Integer.parseInt(jtxt.getText());
            }
        });

        btn1.setBounds(600,270,80,30);
        submit.setBounds(500,700,80,30);
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                i++;
                if (generator.arr[i] == null){
                    jlable1.setText("¡¾ÌâÄ¿" + (i + 1) + "¡¿" + generator.generateQuestion(i));
                }
                if (generator.arr[i] != null){
                    jlable1.setText("¡¾ÌâÄ¿" + (i + 1) + "¡¿" + generator.arr[i]);
                }

                if(i == 0){//å½“åœ¨ç¬¬ä¸€é¢˜çš„é¢æ¿ä¸­è®¾ç½®â?œä¸Šä¸?é¢˜â?è¿™ä¸ªæŒ‰é’®ä¸å¯ç”¨
                    btn2.setEnabled(false);
                }
                if (i != 0){
                    btn2.setEnabled(true);
                }

                if (i == 19){//æœ?åä¸€é¢˜è®¾ç½®â?œä¸‹ä¸?é¢˜â?è¿™ä¸ªæŒ‰é’®ä¸å¯ç”¨
                    btn1.setEnabled(false);
                    submit.setEnabled(true);
                }
                //å°†ç”¨æˆ·è¾“å…¥çš„ç­”æ¡ˆå­˜å…¥åˆ°answerè¿™ä¸ªæ•°ç»„ä¸?
                answer[i-1] = Integer.parseInt(jtxt.getText());
                jtxt.setText("");
                jtxt.requestFocus();//è·å–å…‰æ ‡

            }
        });


        btn2.setBounds(425,270,80,30);
        if(i == 0){//å½“åœ¨ç¬¬ä¸€é¢˜çš„é¢æ¿ä¸­è®¾ç½®â?œä¸Šä¸?é¢˜â?è¿™ä¸ªæŒ‰é’®ä¸å¯ç”¨
            btn2.setEnabled(false);
        }
        if (i != 0){
            btn2.setEnabled(true);
        }
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (i == 1){
                    btn2.setEnabled(false);
                }
                if (i != 20){
                    btn1.setEnabled(true);
                }
                i--;
                jlable1.setText("¡¾ÌâÄ¿" + (i + 1) + "¡¿" + generator.arr[i]);
                jtxt.setText("" + (int)(answer[i]));
            }

        });

        //â€œå¥½â€å¥½å­¦ä¹ 
        JLabel jhao = new JLabel("ºÃ");
        jhao.setFont(new Font("¿¬Ìå",Font.BOLD,45));
        jhao.setBounds(100,220,60,60);
        add(jhao);

        //å¥½â?œå¥½â€å­¦ä¹?
        JLabel jhao2 = new JLabel("ºÃ");
        jhao2.setFont(new Font("¿¬Ìå",Font.BOLD,45));
        jhao2.setBounds(100,370,60,60);
        add(jhao2);

        //"å­¦â??
        JLabel jxue = new JLabel("Ñ§");
        jxue.setFont(new Font("¿¬Ìå",Font.BOLD,45));
        jxue.setBounds(100,520,60,60);
        add(jxue);

        //â€œä¹ â€?
        JLabel jxi = new JLabel("Ï°");
        jxi.setFont(new Font("¿¬Ìå",Font.BOLD,45));
        jxi.setBounds(250,520,60,60);
        add(jxi);

        //â€œå¤©â€å¤©å‘ä¸Š
        JLabel jtian = new JLabel("Ìì");
        jtian.setFont(new Font("¿¬Ìå",Font.BOLD,45));
        jtian.setBounds(845,220,60,60);
        add(jtian);

        //å¤©â?œå¤©â€å‘ä¸?
        JLabel jtian2 = new JLabel("Ìì");
        jtian2.setFont(new Font("¿¬Ìå",Font.BOLD,45));
        jtian2.setBounds(845,370,60,60);
        add(jtian2);

        //å?
        JLabel jxiang = new JLabel("Ïò");
        jxiang.setFont(new Font("¿¬Ìå",Font.BOLD,45));
        jxiang.setBounds(845,520,60,60);
        add(jxiang);

        //ä¸?
        JLabel jshang = new JLabel("ÉÏ");
        jshang.setFont(new Font("¿¬Ìå",Font.BOLD,45));
        jshang.setBounds(700,520,60,60);
        add(jshang);




        add(submit);
        add(jlable1);
        //add(jl);
        add(js);
        add(btn1);
        add(btn2);
        add(canvas);

    }
}
