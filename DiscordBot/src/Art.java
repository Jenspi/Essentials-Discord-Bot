import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

public class Art extends ModuleBase {

	public Art(MessageReceivedEvent event)
	{
		super(event);
	}

	@Override
	public void process()
	{
		@SuppressWarnings("unused")
		Member mem = event.getMember();
		
	}

}
