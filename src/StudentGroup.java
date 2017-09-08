import java.util.Date;
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
	Student str=new Student();
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		try{
			if(str==NULL)
			{
				throws IllegalArgumentException;
			}
		}
			catch(Exception e)
		{
			System.out.println(e);
		}
		
		// Add your implementation here
		return null;
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
		
		try{
		if (student.birthDate==NULL)
		{
			throws IllegalArgumentException;
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	@Override
	public Student getStudent(int index) {
		try{
			if(Student==NULL)
			{
				throws IllegalArgumentException;
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		// Add your implementation here
		return null;
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
		try{
		if (student.birthDate==NULL)
		{
			throws IllegalArgumentException;
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
		try{
			if(Student==NULL)
			{
				throws IllegalArgumentException;
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
		try{
			if(Student==NULL)
			{
				throws IllegalArgumentException;
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	@Override
	public void add(Student student, int index) {
		add.First()
		try{
			if(Student==NULL)
			{
				throws IllegalArgumentException;
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		// Add your implementation here
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
		try{
		if (student.birthDate==NULL)
		{
			throws IllegalArgumentException;
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
		try{
		if (student.birthDate==NULL)
		{
			throws IllegalArgumentException;
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
		try{
		if (student.birthDate==NULL)
		{
			throws IllegalArgumentException;
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
		try{
		if (student.birthDate==NULL)
		{
			throws IllegalArgumentException;
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
		try{
		if (student.birthDate==NULL)
		{
			throws IllegalArgumentException;
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
		try{
		if (student.birthDate==NULL)
		{
			throws IllegalArgumentException;
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	@Override
	public void bubbleSort() {
		try{
		if (student.birthDate==NULL)
		{
			throws IllegalArgumentException;
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		for(int i = 1; i < Student.length; i++) {
    for(int j = 0; j < Student.length - 1; j++) {
        if(((Student[j].getByBirthDate()).compareTo((Student[j+1].getByBirthDate()))) > 0) {
            StudentGroup temp = Student[j];
            Student[j] = Student[j+1];
            Student[j+1] = temp;
        }
    }
}
    for(int g = 0; g < Student.length; g++)

		{
         System.out.println(Student[g].getSurname());
        }


		
		// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		try{
		if (student.birthDate==NULL)
		{
			throws IllegalArgumentException;
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		try{
		if (student.birthDate==NULL)
		{
			throws IllegalArgumentException;
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		try{
		if (student.birthDate==NULL)
		{
			throws IllegalArgumentException;
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		try{
		if (student.birthDate==NULL)
		{
			throws IllegalArgumentException;
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		try{
		if (student.birthDate==NULL)
		{
			throws IllegalArgumentException;
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		try{
		if (student.birthDate==NULL)
		{
			throws IllegalArgumentException;
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		try{
		if (student.birthDate==NULL)
		{
			throws IllegalArgumentException;
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		// Add your implementation here
		return null;
	}
}
