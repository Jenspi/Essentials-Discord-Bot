import java.util.List;

import net.dv8tion.jda.core.entities.Message;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.core.requests.RestAction;

public class Clear extends ModuleBase {

	public Clear(MessageReceivedEvent event) {
		super(event);
	}

	/*public Clear() {
		super(event);
		// TODO Auto-generated constructor stub
	}*/

	@Override
	public void process()
	{
		
	}//end process method
	
	public void onGuildMessageReceived(GuildMessageReceivedEvent event)
	{
		//"\\s+" counts all spaces as single break
		String[] args = command.toLowerCase().split(" ");
		
		if(args[0].equals("!clear"))
		{
			if(args.length < 2)
			{
				//TODO error
			}
				else
				{
					//try {
						List<Message> messages = channel.getHistory().retrievePast(Integer.parseInt(args[1])).complete();
						//((RestAction<List<Message>>) channel.purgeMessages(messages)).queue();
						((RestAction<List<Message>>) channel.purgeMessages(messages)).queue();
						
					/*}
					catch(Exception e)
					{
						
					}*/
					//retrieve messages sent in past; retrievePast parameter list is number of messages
					
				}
			//CAN'T DELETE MORE THAN 100 MESSAGES AT ONE TIME
			//CAN'T DELETE MESSAGES OLDER THAN 2 WEEKS
		}
	}

}//end class