import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.OnlineStatus;
import net.dv8tion.jda.core.entities.Game;

public class Main
{
	public static void main(String[] args) throws Exception
	{
		JDA api = new JDABuilder(AccountType.BOT).setToken("NTY1NDI1MzcyMjI5Nzk1ODUw.XK2Whw.uFPEMaguJeszxnNcV5jVfQG6PoU").build();
		try {
		//JDA api = new JDABuilder(AccountType.BOT).setToken("NTY1NDI1MzcyMjI5Nzk1ODUw.XK2Whw.uFPEMaguJeszxnNcV5jVfQG6PoU").build();
		//add event listener for bot to detect events happening (users join or message)
		api.addEventListener(new CommandHandler());
		}
		catch (Exception e){
			e.printStackTrace();
		}
		api.getPresence().setStatus(OnlineStatus.ONLINE);
		api.getPresence().setGame(Game.watching("Top 10 rappers Eminem was too afraid to diss"));
		
		//api.addEventListener(new Clear());
		
	}//end main
}//end class