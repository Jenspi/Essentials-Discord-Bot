import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

public class Ping extends ModuleBase {

	public Ping(MessageReceivedEvent event) {
		super(event);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void process() {
		channel.sendTyping().queue();
		
		User user = event.getMember().getUser();
		
		//################// EMBED BUILDER //################//
		EmbedBuilder embed = new EmbedBuilder();
		embed.setTitle("**Pong!**");
		embed.setDescription(user.getAsMention()+"'s ping is "+event.getJDA().getGatewayPing());
		embed.setColor(0x88C1B1);
		
		channel.sendMessageEmbeds(embed.build()).queue();
		embed.clear();
	}

}