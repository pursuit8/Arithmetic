package projjkt;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class WidowPractice extends JFrame {//定义�?个画布内部类绘制背景图案
    int i = 0;
    String aarr[] = new String[20];
    double answer[] = new double[20];//定义�?个存储用户输入答案的数组
    public class MyCanvas extends Canvas{
        @Override
        public void paint(Graphics g) {
            Graphics2D g2 = (Graphics2D)g;


            //第一个正方体
            Stroke dash = new BasicStroke(2.5f,BasicStroke.CAP_BUTT,BasicStroke.JOIN_ROUND,3.5f,new float[]{15,10},0f);
            Stroke pen = new BasicStroke(8);
            Stroke initPen = new BasicStroke(5);
            //虚线画笔
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

            //左红�?
            g2.setStroke(pen);
            g2.drawLine(160,120,160,30);
            int []triangleX = {160,250,160};
            int []triangleY = {25,42,72};
            g2.setColor(Color.RED);
            g2.fillPolygon(triangleX,triangleY,3);
            //恢复初始画笔
            g2.setStroke(initPen);
            g2.setColor(Color.BLACK);


            //第二个正方体
            //g2.drawLine(100,100 + 150,250,100 + 150);
            g2.drawLine(50,180 + 150,200,180 + 150);
            //g2.drawLine(100,100 + 150,50,180 + 150);
            g2.drawLine(250,100 + 150,200,180 + 150);
            g2.drawLine(50,180 + 150,50,330 + 150);
            g2.drawLine(200,180 + 150,200,330 + 150);
            g2.drawLine(250,100 + 150,250,250+ 150);
            g2.drawLine(50,330 + 150,200,330 +150);
            g2.drawLine(200,330 + 150,250,250 + 150);

            //第三个正方体
            //g2.drawLine(100,100 + 300,250,100 + 300);
            g2.drawLine(50,180 + 300,200,180 + 300);
            //g2.drawLine(100,100 + 300,50,180 + 300);
            g2.drawLine(250,100 + 300,200,180 + 300);
            g2.drawLine(50,180 + 300,50,330 + 300);
            g2.drawLine(200,180 + 300,200,330 + 300);
            //g2.drawLine(250,100 + 300,250,250 + 300);
            g2.drawLine(50,330 + 300,200,330 + 300);
            //g2.drawLine(200,330 + 300,250,250 + 300);

            //第四个正方体
            g2.drawLine(100 + 150,100 + 300,250 + 150,100 + 300);
            g2.drawLine(50 + 150,180 + 300,200 + 150,180 + 300);
            g2.drawLine(100 + 150,100 + 300,50 + 150,180 + 300);
            g2.drawLine(250 + 150,100 + 300,200 + 150,180 + 300);
            g2.drawLine(50 + 150,180 + 300,50 + 150,330 + 300);
            g2.drawLine(200 + 150,180 + 300,200 + 150,330 + 300);
            //g2.drawLine(250 + 150,100 + 300,250 + 150,250 + 300);
            g2.drawLine(50 + 150,330 + 300,200 + 150,330 + 300);
            //g2.drawLine(200 + 150,330 + 300,250 + 150,250 + 300);

            //第五个正方体
            g2.drawLine(100 + 300,100 + 300,250 + 300,100 + 300);
            g2.drawLine(50 + 300,180 + 300,200 + 300,180 + 300);
            g2.drawLine(100 + 300,100 + 300,50 + 300,180 + 300);
            g2.drawLine(250 + 300,100 + 300,200 + 300,180 + 300);
            g2.drawLine(50 + 300,180 + 300,50 + 300,330 + 300);
            g2.drawLine(200 + 300,180 + 300,200 + 300,330 + 300);
            //g2.drawLine(250 + 300,100 + 300,250 + 300,250 + 300);
            g2.drawLine(50 + 300,330 + 300,200 + 300,330 + 300);
            //g2.drawLine(200 + 300,330 + 300,250 + 300,250 + 300);

            //第六个正方体
            g2.drawLine(100 + 450,100 + 300,250 + 450,100 + 300);
            g2.drawLine(50 + 450,180 + 300,200 + 450,180 + 300);
            g2.drawLine(100 + 450,100 + 300,50 + 450,180 + 300);
            g2.drawLine(250 + 450,100 + 300,200 + 450,180 + 300);
            g2.drawLine(50 + 450,180 + 300,50 + 450,330 + 300);
            g2.drawLine(200 + 450,180 + 300,200 + 450,330 + 300);
            //g2.drawLine(250 + 450,100 + 300,250 + 450,250 + 300);
            g2.drawLine(50 + 450,330 + 300,200 + 450,330 + 300);
           //g2.drawLine(200 + 450,330 + 300,250 + 450,250 + 300);

            //第七个正方体
            g2.drawLine(100 + 600,100 + 300,250 + 550,100 + 300);
            g2.drawLine(50 + 600,180 + 300,200 + 600,180 + 300);
            g2.drawLine(100 + 600,100 + 300,50 + 600,180 + 300);
            //g2.drawLine(250 + 600,100 + 300,200 + 600,180 + 300);
            g2.drawLine(50 + 600,180 + 300,50 + 600,330 + 300);
            g2.drawLine(200 + 600,180 + 300,200 + 600,330 + 300);
            //g2.drawLine(250 + 600,100 + 300,250 + 600,250 + 300);
            g2.drawLine(50 + 600,330 + 300,200 + 600,330 + 300);
            //g2.drawLine(200 + 600,330 + 300,250 + 600,250 + 300);

            //第八个正方体
            //g2.drawLine(100 + 750,100 + 300,250 + 750,100 + 300);
            g2.drawLine(50 + 750,180 + 300,200 + 750,180 + 300);
            //g2.drawLine(100 + 750,100 + 300,50 + 750,180 + 300);
            g2.drawLine(250 + 750,100 + 300,200 + 750,180 + 300);
            g2.drawLine(50 + 750,180 + 300,50 + 750,330 + 300);
            g2.drawLine(200 + 750,180 + 300,200 + 750,330 + 300);
            g2.drawLine(250 + 750,100 + 300,250 + 750,250 + 300);
            g2.drawLine(50 + 750,330 + 300,200 + 750,330 + 300);
            g2.drawLine(200 + 750,330 + 300,250 + 750,250 + 300);

            //第九个正方体
            //g2.drawLine(100 + 750,100 + 300 - 150,250 + 750,100 + 300 - 150);
            g2.drawLine(50 + 750,180 + 300 - 150,200 + 750,180 + 300 - 150);
            //g2.drawLine(100 + 750,100 + 300 - 150,50 + 750,180 + 300 - 150);
            g2.drawLine(250 + 750,100 + 300 - 150,200 + 750,180 + 300 - 150);
            g2.drawLine(50 + 750,180 + 300 - 150,50 + 750,330 + 300 - 150);
            g2.drawLine(200 + 750,180 + 300 - 150,200 + 750,330 + 300 - 150);
            g2.drawLine(250 + 750,100 + 300 - 150,250 + 750,250 + 300 - 150);
            g2.drawLine(50 + 750,330 + 300 - 150,200 + 750,330 + 300 - 150);
            g2.drawLine(200 + 750,330 + 300 - 150,250 + 750,250 + 300 - 150);

            //第十个正方体
            g2.drawLine(100 + 750,100 ,250 + 750,100 );
            g2.drawLine(50 + 750,180 ,200 + 750,180 );
            g2.drawLine(100 + 750,100 ,50 + 750,180 );
            g2.drawLine(250 + 750,100 ,200 + 750,180 );
            g2.drawLine(50 + 750,180 ,50 + 750,330 );
            g2.drawLine(200 + 750,180 ,200 + 750,330 );
            g2.drawLine(250 + 750,100 ,250 + 750,250 );
            g2.drawLine(50 + 750,330 ,200 + 750,330 );
            g2.drawLine(200 + 750,330 ,250 + 750,250 );

            //右红�?
            g2.setStroke(pen);
            g2.drawLine(900,120,900,30);
            int []secondTriangleX = {900,990,900};
            int []secondTriangleY = {25,42,72};
            g2.setColor(Color.RED);
            g2.fillPolygon(secondTriangleX,secondTriangleY,3);
            g2.setStroke(initPen);
            g2.setColor(Color.BLACK);


            //绘制答题边框
            Stroke stroke = new BasicStroke(15,BasicStroke.CAP_ROUND,BasicStroke.JOIN_ROUND);//设置画笔粗为8像素
            g2.setStroke(stroke);//加载画笔
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
        setTitle("--��ϰģʽ--");

        JLabel jlable1 = new JLabel("����Ŀ" + (i + 1) + "��" +generator.generateQuestion(i));
        jlable1.setBounds(430,30,250,30);
        jlable1.setFont(new Font("����",Font.BOLD,20));

        JTextField jtxt = new JTextField("��������");
        jtxt.setColumns(20);
        jtxt.setFont(new Font("����",Font.BOLD,20));

        JScrollPane js = new JScrollPane(jtxt);
        js.setBounds(450,150,200,100);

        JButton btn2 = new JButton("��һ��");
        JButton btn1 = new JButton("��һ��");
        JButton submit = new JButton("�ύ");

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
                    jlable1.setText("����Ŀ" + (i + 1) + "��" + generator.generateQuestion(i));
                }
                if (generator.arr[i] != null){
                    jlable1.setText("����Ŀ" + (i + 1) + "��" + generator.arr[i]);
                }

                if(i == 0){//当在第一题的面板中设置�?�上�?题�?�这个按钮不可用
                    btn2.setEnabled(false);
                }
                if (i != 0){
                    btn2.setEnabled(true);
                }

                if (i == 19){//�?后一题设置�?�下�?题�?�这个按钮不可用
                    btn1.setEnabled(false);
                    submit.setEnabled(true);
                }
                //将用户输入的答案存入到answer这个数组�?
                answer[i-1] = Integer.parseInt(jtxt.getText());
                jtxt.setText("");
                jtxt.requestFocus();//获取光标

            }
        });


        btn2.setBounds(425,270,80,30);
        if(i == 0){//当在第一题的面板中设置�?�上�?题�?�这个按钮不可用
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
                jlable1.setText("����Ŀ" + (i + 1) + "��" + generator.arr[i]);
                jtxt.setText("" + (int)(answer[i]));
            }

        });

        //“好”好学习
        JLabel jhao = new JLabel("��");
        jhao.setFont(new Font("����",Font.BOLD,45));
        jhao.setBounds(100,220,60,60);
        add(jhao);

        //好�?�好”学�?
        JLabel jhao2 = new JLabel("��");
        jhao2.setFont(new Font("����",Font.BOLD,45));
        jhao2.setBounds(100,370,60,60);
        add(jhao2);

        //"学�??
        JLabel jxue = new JLabel("ѧ");
        jxue.setFont(new Font("����",Font.BOLD,45));
        jxue.setBounds(100,520,60,60);
        add(jxue);

        //“习�?
        JLabel jxi = new JLabel("ϰ");
        jxi.setFont(new Font("����",Font.BOLD,45));
        jxi.setBounds(250,520,60,60);
        add(jxi);

        //“天”天向上
        JLabel jtian = new JLabel("��");
        jtian.setFont(new Font("����",Font.BOLD,45));
        jtian.setBounds(845,220,60,60);
        add(jtian);

        //天�?�天”向�?
        JLabel jtian2 = new JLabel("��");
        jtian2.setFont(new Font("����",Font.BOLD,45));
        jtian2.setBounds(845,370,60,60);
        add(jtian2);

        //�?
        JLabel jxiang = new JLabel("��");
        jxiang.setFont(new Font("����",Font.BOLD,45));
        jxiang.setBounds(845,520,60,60);
        add(jxiang);

        //�?
        JLabel jshang = new JLabel("��");
        jshang.setFont(new Font("����",Font.BOLD,45));
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
