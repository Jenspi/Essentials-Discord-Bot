import java.util.List;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.Message;
//import net.dv8tion.jda.api.entities.channel.middleman.MessageChannel;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

public class Clear extends ModuleBase {

	public Clear(MessageReceivedEvent event) {
		super(event);
	}

	/*public Clear() {
		super(event);
		// TODO Auto-generated constructor stub
	}*/
	
	/* info:
	 * BOTS CAN'T DELETE MORE THAN 100 MESSAGES AT ONE TIME
	 * BOTS CAN'T DELETE MESSAGES OLDER THAN 2 WEEKS
	*/

	@Override
	public void process()
	{
		//MessageChannel channel = event.getChannel();
		Message message = event.getMessage();
		String content = message.getContentRaw();
		//"\\s+" counts all spaces as single break
		//split argument into its own elements, excluding spaces (ex. "!clear 5" will create String args = ["!clear", "5"]
		String[] args = content.toLowerCase().split(" ");
		String tryThis = "\nTry this: *`!clear <integer between 1-100>`*";
		
		//EDGE CASE NO. 1/3: if number is ≤0 or ≥101	//	OFs: -2147483649+ and 2147483648+ inclusive
		try {
			if(args.length > 1 && !(args[1].equals("test")) ) {
				if((Integer.parseInt(args[1]) <= 0) || (Integer.parseInt(args[1]) >= 101)){ throw new Exception("IllegalArgumentException"); }
			}
		} catch(Exception e) {
			channel.sendMessage("You gave me input that I can't use!" + tryThis).queue();	
		}//end check for ≤0 or ≥101
		
		//EDGE CASE NO. 2/3: !clear .. no params
		if(args.length < 2)
		{			
			channel.sendMessage("You didn't give me a number!" + tryThis).queue();
		}
		
		//EDGE CASE NO. 3/3: !clear param param .. too many params
		else if(!(args[1].equals("test")) && args.length > 2) {
			channel.sendMessage("You gave me too many parameters!" + tryThis).queue();
		}
		
		//################// TESTING //################//
		//for printing a certain number of numbers
		//SYNTAX::: !clear test number
		//!clear test number
		//TODO catch error index out of bounds
		if(args[1].equals("test")){
			//send number to test method
			testNumbers(Integer.parseInt(args[2]));
		}
		//#############// TESTING DONE //#############//

			//valid syntax
			else if(args.length == 2)
			{
				try {
					//clear messages
					List<Message> messages = channel.getHistory().retrievePast(Integer.parseInt(args[1])).complete();
					channel.purgeMessages(messages);
					
					//send embed confirming clear
					//################// EMBED BUILDER //################//
					EmbedBuilder embedBuilder = new EmbedBuilder();
					// *** for bold italic
					embedBuilder.setTitle("***clear successful!***");
					embedBuilder.setDescription("cleared " + (args[1]) + " messages.");
					embedBuilder.setColor(0x88C1B1);
					channel.sendTyping().queue();
					channel.sendMessageEmbeds(embedBuilder.build()).queue();
					
					//clear embed to save memory
					embedBuilder.clear();
				} catch(Exception e) {}
			}//end valid syntax code block
		
		//TODO add ability to double check clearing using user confirmation
		
	}//end process method
	
	
	
	//helper method
	public void testNumbers(int n) {
		//print out n elements; clearing 100 messages should leave you with the message "0"; clearing 101 should not be possible
		for(int i=1; i<n+1; i++) { channel.sendMessage(""+i).queue(); }
	}//end testNumbers

}//end class