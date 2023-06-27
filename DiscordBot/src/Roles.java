import net.dv8tion.jda.core.EmbedBuilder;
import net.dv8tion.jda.core.entities.Message;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

public class Roles extends ModuleBase {

	public Roles(MessageReceivedEvent event) {
		super(event);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void process() {
		channel.sendMessage("React for a role:").queue();
		//event.getMessage().;
		//message.addReaction();
		//channel.sendMessage().queue();
		
		//################// EMBED BUILDER //################//
		
		EmbedBuilder embedBuilder = new EmbedBuilder();
		
	}//end process method
	
}//end class