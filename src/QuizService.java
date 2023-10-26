import java.util.Scanner;

public class QuizService {
	private Question q1,q2,q3,q4,q5;
	private Question[] questionsArr=new Question[5];
	private  String[] q1Options={"1.Java Volatile Machine","2.Java Volume Machine","3.Java Virtual Machine","4.Java Viral Machine"};
	private  String[] q2Options={"1.Dennis Richie","2.Steve","3.Alex","4.James Hoshling"};
	private  String[] q3Options={"1.int","2.float","3.double","4.long"};
	private  String[] q4Options={"1.int","2.float","3.double","4.long"};
	private  String[] q5Options={"1.Yes","2.No"};
	
	 public QuizService() {
		 q1= new Question(1,"JVM stands for",q1Options,3);
		q2= new Question(2,"Java was developed by",q2Options,4);
		
		q3= new Question(3,"Default datatype of number in Java",q3Options,1);
		q4= new Question(4,"Default datatype of real number in Java",q4Options,3);
		q5= new Question(5,"Boolean can store only 2 values Y/N",q5Options,1);
		questionsArr[0] = q1;
		questionsArr[1] = q2;
		questionsArr[2] = q3;
		questionsArr[3] = q4;
		questionsArr[4] = q5;
		
	}
	 public void askQuestion(Question q) {
		 System.out.println();
		 System.out.println(q.getQuestion());
		 for(String options:q.getOptions())
			 System.out.println(options);
		 
	 }
	 
	 
	public void playQuiz(Player p1) {
		for(Question q :questionsArr) {
			//System.out.println(q);
				askQuestion(q);
				Scanner scanner = new Scanner(System.in);
				//System.out.println();
				int playerAnswer = scanner.nextInt();
				//System.out.println("player answer::"+playerAnswer);
				if(q.getAnswer()==(playerAnswer)) {
					System.out.println("Correct..");
					p1.setScore(p1.getScore()+2);
					System.out.println("score = "+p1.getScore());
					
				}else {
					System.out.println(" OOPs It's Wrong..");
					p1.setScore(p1.getScore()-1);
					System.out.println("score = "+p1.getScore());
				}
				System.out.println();	
			
		}
	 }
	
	}


