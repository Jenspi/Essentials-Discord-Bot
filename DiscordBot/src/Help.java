import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

public class Help extends ModuleBase {

	public Help(MessageReceivedEvent event) {
		super(event);
	}

	@Override
	public void process() {
		//queue needed to respond to commands
		
//		channel.sendMessage(
//		"List of available commands:"
//		+ cmdString("!help", "brings up list of commands.")
//		+ cmdString("!ping", "prints user's ping.")
//		+ cmdString("!sage", "returns user's server age. ~Can only use with self!")
//		+ cmdString("!age", "returns user's Discord age. ~Can only use with self!")
//		+ cmdString("!choose <option 1> || <option 2>", "chooses a choice between two or more options.")
//		).queue();
		
		//channel.sendMessage("```Java\n TEXT HERE \n```").queue();//make methods for different languages in ModuleBase
		/*send("!help", "prints list of commands.");
		send("!ping", "prints user's ping.");
		send("!sage", "returns user's server age. ** Currently cannot use with users other than self **");
		send("!age", "returns user's Discord age. ** Currently cannot use with users other than self **");
		send("!choose <option 1> & <option 2>", "");*/
		
		//################// EMBED BUILDER //################//
		
		EmbedBuilder embedBuilder = new EmbedBuilder();
		// *** for bold italic
		embedBuilder.setTitle("***Essentials Commands***");
		embedBuilder.setDescription(cmdString("!help", "brings up list of commands.")
									+ cmdString("!ping", "prints user's ping.")/*
									//ADD: ability to use !age and !sage on someone else
									+ cmdString("!sage", "returns user's server age. ~Can only use with self for now!")
									+ cmdString("!age", "returns user's Discord age. ~Can only use with self for now!")*/
									+ cmdString("!choose <option 1> || <option 2>", "chooses a choice between two or more options."));
		embedBuilder.setColor(0x88C1B1);
		//;
		//https://images-ext-2.discordapp.net/external/jOe59kBVkkwEGSxVxvdc-2KhOricRg8NPcyg7ZqfvII/https/cdn.discordapp.com/avatars/159410114665644032/3801e97d6e21e528df68d26192ccda49.png
		embedBuilder.setFooter("Created by Jenspi", "https://images-ext-2.discordapp.net/external/jOe59kBVkkwEGSxVxvdc-2KhOricRg8NPcyg7ZqfvII/https/cdn.discordapp.com/avatars/159410114665644032/3801e97d6e21e528df68d26192ccda49.png");
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
	//return italic code block
	public String ic(String code)
	{
		return "*` "+code+"`*";
	}//end ic method
	
	//return command as italic code block followed by its description
	public String cmdString(String command, String description)
	{
		return String.format("\n%s %s", ic(command), description);
	}//end cmdString method
}
