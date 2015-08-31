import java.io.*;
import static java.lang.System.*;
public class bash_commands {
	public String executeCommand(String command){
		StringBuffer output = new StringBuffer();
		
		Process p;
		try {
			p = Runtime.getRuntime().exec(command);
			p.waitFor();
			BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
			String line = "";
			while ((line = reader.readLine()) != null) {
				output.append(line + "\n");
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return output.toString();
	}

public static void main(String args[]) {
	
	bash_commands com = new bash_commands();
	System.out.println(com.executeCommand("ls"));
	System.out.println(com.executeCommand("curl http://www.google.com | tidy -i"));
	System.out.println(com.executeCommand("curl http://www.google.com >> -/google.txt"));
	System.out.println(com.executeCommand("curl http://www.google.com | grep '<title>'"));
	System.out.println(com.executeCommand(args[0]));
	}
}

