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
				int numberOfLines = myFile.nextInt();
				
				for(int i = 0; i < numberOfLines; i++)
					{
						String tempArray = myFile.nextLine();
						String[] filler = tempArray.split(" ");

						StudentList.add(new Student(filler[i], filler[i + 1]));

					}
				

				
			}
		public static void promptUser()
		{
			//Question
			System.out.println("How many groups would you like to create?");
			//UserInput
			String numberOfGroups = userStringInput.nextLine();
			

		}

	}
