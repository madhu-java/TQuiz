import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Instructor {
	
	Scanner scanner = new Scanner(System.in);
	List<Question> questionsList = new ArrayList<>();
	
	public List<Question> addQuestions(int noOfQuestions) {
		
		for (int i = 1; i <= noOfQuestions; i++) {
			Question q = new Question();
			String options[] = new String[4];
			
			System.out.println("Entering Question:" + i);
			q.setId(i);
			//System.out.println("Enter the Question no. " + i);
               String qs =scanner.nextLine();
			q.setQuestion(qs);
			for (int j = 0; j < 4; j++) {
				System.out.println("Option " + (j+1)+" : ");
				options[j] = scanner.nextLine();
				
			}
			q.setOptions(options);
			System.out.println("Enter the correct option number: ");
			q.setAnswer(scanner.nextInt());
			scanner.nextLine();
			System.out.println();
            questionsList.add(q);
		}
		
		System.out.println("Questiona added are: ");
		Iterator<Question> iterator = questionsList.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
      return questionsList;
	}

}
