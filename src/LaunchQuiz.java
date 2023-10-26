import java.util.Scanner;

public class LaunchQuiz {

	public static void main(String[] args) {
		Player p1 = new Player();
		QuizService quizService = new QuizService();
		
		System.out.println("Welcome to Quiz");
		System.out.println("For every Correct answer you'll get +2 marks and\n"+
		                    "For every worng answer you'll get -1 marks\n ");
		System.out.println("Please enter your name");
		Scanner scanner = new Scanner(System.in);
		
		p1.setName(scanner.next());
		quizService.playQuiz(p1);
		System.out.println("\n"+p1.getName().toUpperCase()+" your final score is ="+p1.getScore());
		System.out.println("Welldone!!");
		

	}

}
