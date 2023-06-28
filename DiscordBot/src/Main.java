import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.requests.GatewayIntent;

public class Main
{
	private static final String TOKEN = "NTY1NDI1MzcyMjI5Nzk1ODUw.XK2Whw.uFPEMaguJeszxnNcV5jVfQG6PoU";
	
	public static void main(String[] args) throws Exception
	{
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