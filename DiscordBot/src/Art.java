import net.dv8tion.jda.core.entities.Member;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

public class Art extends ModuleBase {

	public Art(MessageReceivedEvent event)
	{
		super(event);
	}

	@Override
	public void process()
	{
		Member mem = event.getMember();
		
	}

}
