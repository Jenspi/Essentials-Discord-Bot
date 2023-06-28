import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

public class Choose extends ModuleBase {

	public Choose(MessageReceivedEvent event) {
		super(event);
	}

	@Override
	public void process() {
		Message input = event.getMessage();
		String content = input.getContentRaw();
		String isThisValid = content.toLowerCase();
		
		if(!isThisValid.equals("!choose")){
			channel.sendTyping().queue();
			String message = content.replace("!choose ", "");
			String[] options = message.split("||");
			
			//FIX:
			//################// EMBED BUILDER //################//
			EmbedBuilder embedBuilder = new EmbedBuilder();
			embedBuilder.setTitle("**!choose:**");
			embedBuilder.setDescription(options[(int) Math.floor(Math.random()*options.length)]);
			embedBuilder.setColor(0x88C1B1);
			
			channel.sendMessageEmbeds(embedBuilder.build()).queue();
			embedBuilder.clear();
			channel.sendMessage( options[(int) Math.floor(Math.random()*options.length)] ).queue();
		}
			else if(content.equals("!choose"))
			{
				channel.sendMessage("You didn't give me two or more choices to choose from! Try this:\n*`!choose <option 1> & <option 2>`*").queue();
			}
	}
}
