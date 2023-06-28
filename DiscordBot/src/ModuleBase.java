import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.entities.channel.middleman.MessageChannel;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

public abstract class ModuleBase
{
	String command;
	MessageReceivedEvent event;
	MessageChannel channel;
	User user;
	Member member;
	Guild guild;
	
	public ModuleBase(MessageReceivedEvent event)
	{
		this.command = event.getMessage().getContentRaw();
		this.event = event;
		this.channel = event.getChannel();
		this.user = event.getAuthor();
		this.member = event.getMember();
		this.guild = event.getGuild();
		process();
	}
	
	//store all actions that are performed when commands are ran in discord
	public abstract void process();
}
