import net.dv8tion.jda.core.entities.*;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

//our event listener extends a class within the java discord api
public class CommandHandler extends ListenerAdapter
{
	//To handle "message received" event
	public void onMessageReceived(MessageReceivedEvent event)
	{
		//if the user of the message received is a bot, ignore
		if(event.getAuthor().isBot()) return;
		
		Message message = event.getMessage();
		String content = message.getContentRaw();
		content = content.toLowerCase();
		//be able to respond in the same channel that message was received in
		MessageChannel channel = event.getChannel();
		
		if(content.equals("!ping"))
		{
			//create ping object
			new Ping(event);
		}
			else if(content.equals("!help"))
			{
				new Help(event);
			}
			
			else if(content.equals("!age"))
			{
				new Age(event);
			}
			else if(content.equals("!sage"))
			{
				new ServerAge(event);
			}
			else if(content.equals("!roles"))
			{
				new Roles(event);
			}
			else if(content.startsWith("!clear!"))
			{
				new Clear(event);
			}
			else if(content.startsWith("!choose"))
			{
				new Choose(event);
			}
	}
}