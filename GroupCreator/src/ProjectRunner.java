import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ProjectRunner
	{
		// Array list
		public static ArrayList<String> StudentList = new ArrayList<String>();
		// New Scanner
		public static Scanner userStringInput = new Scanner(System.in);
		static int countGroup = 0;
		
		public static void main(String[] args) throws IOException
			{
				fillArrayList();
				promptUser();
			}
		
		public static void fillArrayList() throws IOException
			{
				// filling array list
				Scanner myFile = new Scanner(new File("StudentList.txt"));
				//int numberOfLines = myFile.nextInt();
				
				while(myFile.hasNextLine())
					{
						//String tempArray = myFile.nextLine();
						//String[] filler = tempArray.split(" ");

						StudentList.add(myFile.nextLine());

					}
<<<<<<< HEAD
								System.out.println(StudentList);
=======
				

>>>>>>> upstream/master
				
			}
		public static void promptUser()
		{
			//Question
			System.out.println("How many groups would you like to create?");
			//UserInput
			String numberOfGroups = userStringInput.nextLine();
			

		}

	}
