import java.io.*;

public class filesinputoutput {

	public static void main(String[] args) {
		PrintWriter fos = null;
	//#21
		//Collin c=new Collin();
		/* cannot instantiate an object of abstract class. 
		 * we have constructors in abstract classes so that the children
		 * that inherit the parent abstract class can all use the same 
		 * constructor such with an employee abstract class
		 * you might have a constructor for name and age which both 
		 * part time and full time workers would use because they have both.
		 * 
		 * 
		 */
		//#22
		/*
		 * it is because they used FileOutputStream when they should be using
		 * FileInputStream instead.
		 */
		//#23
	    try
	    {
	    	fos = new PrintWriter(new FileOutputStream("statistics.txt"));
	    	
	    }
	    catch(Exception e)
	    {
	    	fos.println(24);
	    }
	    //#24
	    try {
		 PrintWriter pw=new PrintWriter(new FileOutputStream("autos.txt",true));
		pw.println((" hey "));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
