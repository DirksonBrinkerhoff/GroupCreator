import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ProjectRunner
	{
		// Array list
		public static ArrayList<Student> StudentList = new ArrayList<Student>();
		// New Scanner
		public static Scanner userStringInput = new Scanner(System.in);
		
		public static void main(String[] args) throws IOException
			{
				fillArrayList();
				promptUser();
			}
		
		public static void fillArrayList() throws IOException
			{
				// filling array list
				Scanner myFile = new Scanner(new File("StudentList.txt"));
				while (myFile.hasNext())
					{
						String tempArray = myFile.nextLine();
						String[] filler = tempArray.split(" ");
						//System.out.println(filler[0]);
						StudentList.add(new Student(filler[0], filler[1]));
						
					}
				// hetyyy
				
			}
		public static void promptUser()
		{
			//Question
			System.out.println("How many groups would you like to create?");
			
			//Userinput
			String numberOfGroups = userStringInput.nextLine();
			
		}

	}
