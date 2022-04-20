import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ProjectRunner
	{
		// Array list
		public static ArrayList<String> StudentList = new ArrayList<String>();
		public static ArrayList<ArrayList<String>> Groups = new ArrayList<ArrayList<String>>();
		// New Scanner
		public static Scanner userIntInput = new Scanner(System.in);
		static int numberOfGroups;
		
		public static void main(String[] args) throws IOException
			{
				fillArrayList();
				promptUser();
				newGroups();
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
				

				
			}
		public static void promptUser()
		{
			//Question
			System.out.println("How many groups would you like to create?");
			//UserInput
			int numberOfGroups = userIntInput.nextInt();
			int groupMembers = StudentList.size() / numberOfGroups;
			
			for(int i = 0; i < numberOfGroups; i++)
				{
					ArrayList<String> TempArray = new ArrayList<String>();
					for(int j = 0; j < groupMembers; j++)
						{
							TempArray.add(StudentList.get(0));
							StudentList.remove(0);
						}
					Groups.add(TempArray);
					
				}
			
			for(int i = 0; i < StudentList.size(); i++)
				{
					for(int j = 0; j < Groups.size() && StudentList.size() > 0; j++)
						{
							Groups.get(j).add(StudentList.get(0));
							StudentList.remove(0);
						}
				}
			
			for(int i = 0; i < Groups.size(); i++)
				{
					for(int j = 0; j < Groups.get(i).size(); j++)
						{
							System.out.println(Groups.get(i).get(j));
							//System.out.print(", ");
						}
					
					System.out.println();
					
				}
			

		}
		
		public static void newGroups()
			{
				
			}

	}
