package RegexProblem;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegexMethods {
		public void validname() {
			String line="Himanshu";
			   String pattern= "[A-Z][a-z]+";
			   Pattern pat= Pattern.compile(pattern);
			   Matcher matcher=pat.matcher(line);
			   if(matcher.matches()) {
				   System.out.println("Pattern matches");
			   }else {
				   System.out.println("No Match");
			   }
			   
		}
		
		//  Match the Mo No
		
		public void  MobileFormat(){
		String line="91 8551934902";
		   String pattern= "[0-9]{2} [89]{1}[0-9]{9}";
		   Pattern pat= Pattern.compile(pattern);
		   Matcher matcher=pat.matcher(line);{
		   if(matcher.matches()) {
			   System.out.println("Pattern matches");
		   }else {
			   System.out.println("No Match");
		   } 
}
}
		// Valid Email id
		 public void ValideEmail() {
			 String line="himanshu12@gmail.com";
			   String pattern= "^[a-z  0-9_\\-\\.]+[@][a-z]+[\\.][a-z]{2,3}$";
			   Pattern pat= Pattern.compile(pattern);
			   Matcher matcher=pat.matcher(line);
			   if(matcher.matches()) {
				   System.out.println("Pattern matches");
			   }else {
				   System.out.println("No Match");
			   }
   }
		 
		 // Valid Name Last Name
		 public void ValideLastName() {

				String line="himanshu";
			   String pattern= "[a-z]+[A-Z]";
				   Pattern pat= Pattern.compile(pattern);
				   Matcher matcher=pat.matcher(line);
				   if(matcher.matches()) {
					   System.out.println("Pattern matches");
				   }else {
					   System.out.println("No Match");
				   }

		
}			// Rule 1 Minimum 8 character
		 public void Rule1 (){
				
				String line="himanshu";
				   String pattern= "[a-z]+";
				   Pattern pat= Pattern.compile(pattern);
				   Matcher matcher=pat.matcher(line);
				   if(matcher.matches()) {
					   System.out.println("Pattern matches");
				   }else {
					   System.out.println("No Match");
				   }
	   }
		 // Rule 2 One Upper Case
		 public void Rule2() {
		 String line="Himanshu";
		   String pattern= "[A-Z]{1}[a-z]+";
		   Pattern pat= Pattern.compile(pattern);
		   Matcher matcher=pat.matcher(line);{
		   if(matcher.matches()) {
			   System.out.println("Pattern matches");
		   }else {
			   System.out.println("No Match");
		   }
}		 
}
		 public void Rule3() {
			 String line="Himanshu12";
			   String pattern= "[A-z]{1}[a-z]+[0-9]";
			   Pattern pat= Pattern.compile(pattern);
			   Matcher matcher=pat.matcher(line);{
			   if(matcher.matches()) {
				   System.out.println("Pattern matches");
			   }else {
				   System.out.println("No Match");
			   }
		 
}
	 }
		 public void Rule4() {
			 String line="Himanshu12$";
			   String pattern= "[A-z]{1}[a-z]+[0-9]+[$]";
			   Pattern pat= Pattern.compile(pattern);
			   Matcher matcher=pat.matcher(line);{
			   if(matcher.matches()) {
				   System.out.println("Pattern matches");
			   }else {
				   System.out.println("No Match");
			   }
}
		 }
}

