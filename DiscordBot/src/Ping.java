import net.dv8tion.jda.core.EmbedBuilder;
import net.dv8tion.jda.core.entities.User;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

public class Ping extends ModuleBase {

	public Ping(MessageReceivedEvent event) {
		super(event);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void process() {
		channel.sendTyping().queue();
		//channel.sendMessage("Pong! Here's your ping: " + event.getJDA().getPing()).queue();
		
		User user = event.getMember().getUser();
		
		//################// EMBED BUILDER //################//
		EmbedBuilder embed = new EmbedBuilder();
		embed.setTitle("**Pong!**");
		embed.setDescription(user.getAsMention()+"'s ping is "+event.getJDA().getPing());
		embed.setColor(0x88C1B1);
		
		channel.sendMessage(embed.build()).queue();
		embed.clear();
	}

}