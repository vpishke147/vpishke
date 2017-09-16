import java.util.*;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 *
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;

	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}


	public Student[] getStudents() {
		// Add your implementation here
		return students;
	}


	public void setStudents(Student[] students) {
		this.students=students;

	}


	public Student getStudent(int index) {
		// Add your implementation here
		return students[index];
	}


	public void setStudent(Student student, int index) {
		// Add your implementation here
	}


	public void addFirst(Student student) {
    // Add your implementation here
	}

	public void addLast(Student student) {
		// Add your implementation here
	}


	public void add(Student student, int index) {
		// Add your implementation here
	}


	public void remove(int index) {
		// Add your implementation here
	}

	public void remove(Student student) {
		// Add your implementation here
	}


	public void removeFromIndex(int index) {
		// Add your implementation here
	}


	public void removeFromElement(Student student) {
		// Add your implementation here
	}


	public void removeToIndex(int index) {
		// Add your implementation here
	}


	public void removeToElement(Student student) {
		// Add your implementation here
	}

	public void bubbleSort() {
		// Add your implementation here
	}


	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}


	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}


	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}


	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}


	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}


	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}
