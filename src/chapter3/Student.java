/**
 * 
 */
package chapter3;

/**
 * @author mahfuzs
 *
 */
public class Student {

	private String name;
	private double totalScore;
	private int numQuiz;
	
	/**
	 * Constructor that takes in the student's name
	 * @param name
	 */
	public Student(String name) {
		this.name = name;
		this.totalScore = 0;
		this.numQuiz = 0;
	}

	/**
	 * @return Student's name
	 */
	public String getName() {
		return name;
	}


	/**
	 * Returns the student's total score.
	 * @return total score
	 */
	public double getTotalScore() {
		return totalScore;
	}

	/**
	 * Enter the score from a quiz.
	 * @param score
	 */
	public void addQuiz(int score) {
		this.totalScore = this.totalScore + score;
		this.numQuiz ++;
	}
	
	/**
	 * Returns the student's average score.
	 * @return average score
	 */
	public double getAverageScore() {
		return this.totalScore / this.numQuiz;
	}
	
	
}
