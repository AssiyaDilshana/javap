package noora;
/*

public class sportsStudentResult {

	public sportsStudentResult() {
		// TODO Auto-generated constructor stub
	}

}


*/




import noora.Result;
import noora.sports;
import noora.student;

interface student{
	int score=10;
	void displayscore();
}
interface sports{
	int score=25;
	 ;
}
class Result implements student,sports{
	public void displayscore() {
		System.out.println("Academic Score is:"+student.score);
		
	}
	public void displaysportsscore() {
		System.out.println("Sports Score is:"+sports.score);
	}
	
}
public class sportsStudentResult {

	public static void main(String[] args) {
		Result r=new Result();
		r.displayscore();
		r.displaysportsscore();
	}

}
