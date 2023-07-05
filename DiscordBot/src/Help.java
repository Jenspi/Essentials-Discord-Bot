import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

public class Help extends ModuleBase {

	public Help(MessageReceivedEvent event) {
		super(event);
	}

	@Override
	public void process() {
		//queue needed to respond to commands

		//################// EMBED BUILDER //################//
		EmbedBuilder embedBuilder = new EmbedBuilder();
		embedBuilder.setTitle("***Essentials Commands***");// *** for bold italic
		//cmdString SYNTAX:	cmdString("!<command name>", "<command description>.")
		embedBuilder.setDescription(cmdString("!help", "brings up list of commands.")
									+ cmdString("!ping", "prints user's ping.")
									+ cmdString("!choose <option 1> || <option 2>", "chooses a choice between two or more options.")
									+ cmdString("!clear <number between 1-100>", "clears messages in the current channel. Cannot clear a.) more than 100 messages at a time and b.) messages older than two weeks old.") );
		embedBuilder.setColor(0x88C1B1);
		String footerImg = "https://images-ext-2.discordapp.net/external/jOe59kBVkkwEGSxVxvdc-2KhOricRg8NPcyg7ZqfvII/https/cdn.discordapp.com/avatars/159410114665644032/3801e97d6e21e528df68d26192ccda49.png";
		embedBuilder.setFooter("Created by Jenspi", footerImg);
		channel.sendTyping().queue();
		channel.sendMessageEmbeds(embedBuilder.build()).queue();
		//clear embed to save memory
		embedBuilder.clear();
		
	}
	
	/*public void send(String command, String description)
	{
		channel.sendMessageFormat("\n*`%s`* "+description,command).queue();
	}*/
	
	//AESTHETICS FORMATTING HELPER METHODS:
	public String ic(String code)
	{
		return "*`"+code+"`*";//return italic code block
	}//end ic method
	
	//return command as italic code block followed by its description
	public String cmdString(String command, String description)
	{
		return String.format("\n%s %s", ic(command), description);
	}//end cmdString method
}
