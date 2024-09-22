package A11_QuizGame;

import java.util.Scanner;

public class QuestionService {
    Scanner sc = new Scanner(System.in);

    Questions[] questions = new Questions[5];

    QuestionService(){
        questions[0] = new Questions(1, "size of int", "2", "4", "8", "12", "4");
        questions[1] = new Questions(2, "size of bool", "2", "4", "8", "12", "1");
        questions[2] = new Questions(3, "size of float", "2", "4", "8", "12", "4");
        questions[3] = new Questions(4, "size of double", "2", "4", "8", "12", "8");
        questions[4] = new Questions(5, "size of char", "2", "4", "8", "12", "2");
    }

    int score = 0;
    void playQuiz(){
       for(Questions q : questions){
           System.out.println("Question "+ q.getId() + " :" +q.getQuestion() + " ?");
           System.out.println("A :" + q.getOpt1() + ", B :" + q.getOpt2() + ", C :" + q.getOpt3() + ", D :" + q.getOpt4());

           System.out.print("Ans ==> : ");
           String x = sc.nextLine();

           if(x.equals(q.getAns())){
               System.out.println("Ans is correct");
               score++;
           }
           else{
               System.out.println("Ans is wrong");
           }
           System.out.println();

       }
        System.out.println("Total Score : " + score);
    }

}
