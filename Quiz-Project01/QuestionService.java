import java.util.Scanner;

public class QuestionService {

    // we have total of 5 question for now
    QuestionStructure[] Q = new QuestionStructure[5];

    public void setQuestion() {
        // first : create objects
        // for (int i = 0; i < 5; i++) {
        // Q[i] = new QuestionStructure();
        // }

        // second : hardcoding question
        Q[0] = new QuestionStructure(101, "Value of pi", new String[] { "1", "2", "2.17", "3.14" }, "3.14");
        Q[1] = new QuestionStructure(102, "Value of 2+3", new String[] { "1", "2", "5", "4" }, "5");
        Q[2] = new QuestionStructure(103, "Value of 2*3", new String[] { "6", "2", "5", "4" }, "6");
        Q[3] = new QuestionStructure(104, "Value of 4/2", new String[] { "6", "2", "5", "4" }, "2");
        Q[4] = new QuestionStructure(105, "Value of 2-3", new String[] { "6", "2", "-1", "4" }, "-1");
    }

    public void printQuestion() {
        setQuestion();
        int score = 0;

        for (QuestionStructure quest : Q) {
            System.out.println(quest.getQ());
            String[] opt = quest.getOpt();
            for (int i = 0; i < opt.length; i++) {
                System.out.println((char) ('a' + i) + " : " + opt[i]);
            }

            Scanner sc = new Scanner(System.in);
            String userAns = sc.nextLine();

            // System.out.println(userAns + " and " + quest.getAns());
            if (userAns.equals(quest.getAns())) {
                // System.out.println("+1");
                score++;
            }
        }

        System.out.println("Your Score : " + score);
    }

}
