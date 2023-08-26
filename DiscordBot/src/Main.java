import java.io.File;
import java.util.Scanner;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.requests.GatewayIntent;

public class Main
{
	//private static final String TOKEN = "<token here>";
	private static final String TOKEN="";
	public static void main(String[] args) throws Exception{
		
		//Get token:
		try {
	        File input = new File("../../keys.txt");
	        Scanner tokenFile = new Scanner(input);
	        if(tokenFile.hasNextLine()){
	            TOKEN = tokenFile.nextLine();
	            tokenFile.close();
	        }
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
        // ############################################################################################### //
		
		//explicitly allow access to message content with .enableIntents()
		JDA jda = JDABuilder.createDefault(TOKEN).enableIntents(GatewayIntent.MESSAGE_CONTENT).build();
		
		try {
			//add event listener for bot to detect events happening (users join or message)
			jda.addEventListener(new CommandHandler());
		}
		catch (Exception e){
			e.printStackTrace();
		}
		
		//jda.getPresence().setStatus(OnlineStatus.ONLINE);
		jda.getPresence().setActivity(Activity.watching("Top 10 rappers Eminem was too afraid to diss"));
		//api.addEventListener(new Clear()); //? what is this lol
		
	}//end main
}//end class