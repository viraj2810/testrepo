package String;
public class StringClassMethods 
{
	public static void main(String[] args)
	{	String S1="velocity";
		String S2="";
		String S3="ABCD";
		String S4="VELOCITY";
		String S5="city";
		String S6="abcabab";
		String S7="Classes";
		String S8="Manual classes";
		
		System.out.println(S1.length());//8             //To find length/Size of String
		System.out.println(S1.isEmpty());//false        // To verify String is empty or not
		System.out.println(S2.isEmpty());//true         // To verify String is empty or not
		System.out.println(S1.toUpperCase());//VELOCITY  //To print string in upper case
		System.out.println(S3.toLowerCase());//abcd     //To print string in lower case	
		// Compare 2 Strings
		System.out.println(S1.equals(S4));//false         // To compare two Strings(String S1 & String S4) with case sensitive
		System.out.println(S1.equalsIgnoreCase(S4));//true	// To compare two Strings(String S1 & String S4) without case sensitive
		System.out.println(S1.contains(S5));//true	 // To compare two Strings(String S1 & String S5)
		System.out.println(S4.contains(S5));//false  // To compare two Strings(String S4 & String S5) 	
		System.out.println(S1.charAt(1));//e              //To get single character
		System.out.println(S1.startsWith("ve"));//true    // to verify String s1 starts with 've'  with case sensitive
		System.out.println(S3.startsWith("ABC"));//true // to verify String s3 starts with 'ABC'  with case sensitive
		System.out.println(S1.endsWith("city"));//true  // to verify String s1 ends with 'city' with case sensitive	
		System.out.println(S6.indexOf('b')); //1
		System.out.println(S6.indexOf('a')); //0
		System.out.println(S6.lastIndexOf('a'));//5
		System.out.println(S1.substring(4));//city
		System.out.println(S1.substring(4,7));//cit
		System.out.println(S1.substring(2,6));//loci
		System.out.println(S1+S7);//velocity classes
		System.out.println(S1.concat(S7)); //velocity classes	
		System.out.println(S8.replace("Manual", "Automation"));//Automation Classes
		
		
	}
	
	
	
	
	
	
}
