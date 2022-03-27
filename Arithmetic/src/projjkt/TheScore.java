package projjkt;

/**
 * 这里定义了一个算�?终成绩的方法
 */
public class TheScore {
    public int getScore(WidowPractice w,Generator g,int []flag){
        int grade = 0;
        for (int i = 0;i < 20;i++){
            if (w.answer[i] == g.score[i]){
                grade = grade + 5;
            }
        }

        return grade;
    }
}
