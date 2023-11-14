import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LaunchQuiz {

	public static void main(String[] args) {
		System.out.println("Welcome to Quiz");
		System.out.println("Are you a Instructor or Plyer?"+"\n press 1.Instructor  2.Player");
		Scanner scanner = new Scanner(System.in);
		List<Question> questionsList = new ArrayList<>();
		int user = scanner.nextInt();
		if(user==1) {
			Instructor instructor = new Instructor();
			System.out.println("How many questions do you want to add?");
			int questionsToAdd = scanner.nextInt();
			questionsList= instructor.addQuestions(questionsToAdd);
		//}else {
			System.out.println("******************************************");
			System.out.println("player are you ready....");
		Player p1 = new Player();
		QuizService quizService = new QuizService();
		
		
		System.out.println("For every Correct answer you'll get 1+2 marks and\n"+
		                    "For every worng answer you'll get -1 marks\n ");
		System.out.println("Please enter your name");
		
		
		p1.setName(scanner.next());
		quizService.playQuiz(p1,questionsList);
		System.out.println("\n"+p1.getName().toUpperCase()+" your final score is ="+p1.getScore());
		System.out.println("Welldone!!");
		}
		else {
			System.out.println("Instructor needs to add questions ...");
		}

	}

}
