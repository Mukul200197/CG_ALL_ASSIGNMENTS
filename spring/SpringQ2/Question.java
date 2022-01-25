import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Question {
	private int QuestionID;
	private String Question;
	private List<String> Answer;
	private Set<String> Answer1;
	private Map<Integer,String> Answer2;
	
	
	public Question(int questionID, String question, List<String> answer, Set<String> answer1, Map<Integer,String> answer2) {
		super();
		QuestionID = questionID;
		Question = question;
		Answer = answer;
		Answer1=answer1;
		Answer2=answer2;
	}
	
	
	public void showAnswer() {
		
		System.out.println(QuestionID+ " "+ Question);
		System.out.println("Answers from(List,Set, Map)");
		
		System.out.println("Answers from(List)");
		Iterator<String> i=Answer.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("Answers from(Set)");
		Iterator<String> iSet=Answer1.iterator();
		while(iSet.hasNext()) {
			System.out.println(iSet.next());
		}
		
		System.out.println("Answers from(Map)");
		for(Map.Entry<Integer, String> entry: Answer2.entrySet()) {
			System.out.println(entry.getKey()+ " "+ entry.getValue());
		}
		
		
	}
	
	

}
