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

}

