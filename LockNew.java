import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class LockNew
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String filename;                   
		int ch, fch;
		//File f = new File("D:\\Project Locker\\"+filename);

		do
		{
			System.out.println("1. Display all files");
			System.out.println("2. Other File Operations");
			System.out.println("3. Exit");
			System.out.println("Make your choice");


			
			ch = sc.nextInt();
			switch(ch)
			{
			case 1: 
				try
				{
				File f = new File("D:\\Project Locker\\");
				File[] files = f.listFiles();
				Arrays.sort(files,(f1,f2) ->f1.compareTo(f2));
				for(File file:files)
				{
					if(!file.isHidden())
					{
						if(file.isDirectory())
						{
							System.out.println("DIR \t" + file.getName());
						}
						else
						{
				           System.out.println("FILE\t" + file.getName());

						}
					}
				}
				}
				catch(Exception e)
				{
					System.out.println("An error occurred");		
				}
				break;
			case 2:
					do
					{
					System.out.println("1. Add File");
					System.out.println("2. Delete File");
					System.out.println("3. Search File");
					System.out.println("4. Return to main menu");
					System.out.println("Make your choice");
					fch = sc.nextInt();
					switch(fch)
					{
					case 1:try
	 				{
	 					System.out.println("Enter the file name\n");
	 					filename = sc.next();
	 					File f = new File("D:\\Project Locker\\"+filename);
	 					if(f.createNewFile())
	 					{
	 						System.out.println("File created successfully  " + f.getName());
	 					}
	 					else
	 					{
	 						System.out.println("File already exist " + f.getCanonicalPath());
	 					}

	 				}
	 				catch(Exception e)
	 				{
	 					System.out.println("An error occurred");		
	 				}
					break;
					case 2: try
		 			{
		 				System.out.println("Enter the file name to delete");
		 				filename = sc.next();
		 				File f = new File("D:\\Project Locker\\"+filename);
		 				if(f.exists())
		 				{
		 					f.delete();
		 					System.out.println(filename+"  File deleted successfully");
		 				}
		 				else
		 				{
		 					System.out.println("File not found");
		 				}		
		 			}
		 			catch(Exception e)
		 			{
		 				System.out.println("An error occurred");		
		 			}
		 					break;
					
		 				
		 		case 3: 
		 				System.out.println("Enter the filename to search\n");
						filename = sc.next();
					File f = new File("D:\\Project Locker\\"+filename);
					if(f.exists())
					{
							System.out.println(filename +" File exist");
					}			
					else
					{
							System.out.println("File does not exist");
					}
		 					//break;
					}
					}while(fch!=4);
		 			break;
		case 3:  System.exit(0);
		 				break;
			
	default:
				System.out.println("Invalid choice!!!!!!!");
			
		}
	}while(ch!=3);
}
}
