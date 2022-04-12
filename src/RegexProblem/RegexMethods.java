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

		
}
}

