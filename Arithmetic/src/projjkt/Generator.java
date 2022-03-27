package projjkt;

public class Generator {
    int numA;
    int numB;
    int numC;
    String operatorA;//定义�?个运算符
    String operatorB;
    String arr[] = new String[20];//定义�?个用于存储生成的随机题目的字符串数组
    double score[] = new double[20];//定义�?个存储生成的题目答案结果的数�?
    String generateQuestion(int index){//定义�?个可以随机生成题目的方法，返回�?�为�?个字符串为该题目
        String question = null;
        int flagA = 1 + (int)(Math.random()*4);//随机生成�?个属于区间[1,4]的flag值来判断是使用加减乘除中的哪�?�?
        int flagB = 1 + (int)(Math.random()*4);
        numA = 1 + (int)(Math.random()*100);//随机生成第一个运算数
        numB = 1 + (int)(Math.random()*100);//随机生成第二个运算数
        numC = 1 + (int)(Math.random()*100);//随机生成第二个运算数

        if ((flagA == 4) && (flagB == 4)){
            while ((numA % numB) != 0){
                numA = 1 + (int)(Math.random()*100);
                numB = 1 + (int)(Math.random()*100);
            }
            while (((numA / numB) % numC) != 0){
                numC = 1 + (int)(Math.random()*100);
            }
        }
        if ((flagA == 4) && (flagB != 4)){
            while ((numA % numB) != 0){
                numA = 1 + (int)(Math.random()*100);
                numB = 1 + (int)(Math.random()*100);
            }
        }
        if ((flagA != 4) && (flagB == 4)){
            while ((numB % numC) != 0){
                numB = 1 + (int)(Math.random()*100);
                numC = 1 + (int)(Math.random()*100);
            }
        }

        if (flagA == 1 && flagB == 1){
            operatorA = "+";
            operatorB = "+";
            question = (numA + operatorA + numB + operatorB + numC + "=");
            score[index] = numA + numB + numC;
            arr[index] = question;
        }
        if (flagA == 1 && flagB == 2){
            operatorA = "+";
            operatorB = "-";
            question = (numA + operatorA + numB + operatorB + numC + "=");
            score[index] = numA + numB - numC;
            arr[index] = question;
        }
        if (flagA == 1 && flagB == 3){
            operatorA = "+";
            operatorB = "��";
            question = (numA + operatorA + numB + operatorB + numC + "=");
            score[index] = numA + numB * numC;
            arr[index] = question;
        }
        if (flagA == 1 && flagB == 4){
            operatorA = "+";
            operatorB = "��";
            question = (numA + operatorA + numB + operatorB + numC + "=");
            score[index] = numA + numB / numC;
            arr[index] = question;
        }

        if (flagA == 2 && flagB == 1){
            operatorA = "-";
            operatorB = "+";
            question = (numA + operatorA + numB + operatorB + numC + "=");
            score[index] = numA - numB + numC;
            arr[index] = question;
        }
        if (flagA == 2 && flagB == 2){
            operatorA = "-";
            operatorB = "-";
            question = (numA + operatorA + numB + operatorB + numC + "=");
            score[index] = numA - numB - numC;
            arr[index] = question;
        }
        if (flagA == 2 && flagB == 3){
            operatorA = "-";
            operatorB = "��";
            question = (numA + operatorA + numB + operatorB + numC + "=");
            score[index] = numA - numB * numC;
            arr[index] = question;
        }
        if (flagA == 2 && flagB == 4){
            operatorA = "-";
            operatorB = "��";
            question = (numA + operatorA + numB + operatorB + numC + "=");
            score[index] = numA - numB / numC;
            arr[index] = question;
        }
        if (flagA == 3 && flagB == 1){
            operatorA = "��";
            operatorB = "+";
            question = (numA + operatorA + numB + operatorB + numC + "=");
            score[index] = numA * numB + numC;
            arr[index] = question;
        }
        if (flagA == 3 && flagB == 2){
            operatorA = "��";
            operatorB = "-";
            question = (numA + operatorA + numB + operatorB + numC + "=");
            score[index] = numA * numB - numC;
            arr[index] = question;
        }
        if (flagA == 3 && flagB == 3){
            operatorA = "��";
            operatorB = "��";
            question = (numA + operatorA + numB + operatorB + numC + "=");
            score[index] = numA * numB * numC;
            arr[index] = question;
        }
        if (flagA == 3 && flagB == 4){
            operatorA = "��";
            operatorB = "��";
            question = (numA + operatorA + numB + operatorB + numC + "=");
            score[index] = numA * numB / numC;
            arr[index] = question;
        }
        if (flagA == 4 && flagB == 1){
            operatorA = "��";
            operatorB = "+";
            question = (numA + operatorA + numB + operatorB + numC + "=");
            score[index] = numA / numB + numC;
            arr[index] = question;
        }
        if (flagA == 4 && flagB == 2){
            operatorA = "��";
            operatorB = "-";
            question = (numA + operatorA + numB + operatorB + numC + "=");
            score[index] = numA / numB - numC;
            arr[index] = question;
        }
        if (flagA == 4 && flagB == 3){
            operatorA = "��";
            operatorB = "��";
            question = (numA + operatorA + numB + operatorB + numC + "=");
            score[index] = numA / numB * numC;
            arr[index] = question;
        }
        if (flagA == 4 && flagB == 4){
            operatorA = "��";
            operatorB = "��";
            question = (numA + operatorA + numB + operatorB + numC + "=");
            score[index] = numA / numB / numC;
            arr[index] = question;
        }
        return question;
    }
}
