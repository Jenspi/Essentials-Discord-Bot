//import java.time.LocalDateTime;
//import net.dv8tion.jda.api.EmbedBuilder;
//import net.dv8tion.jda.api.entities.Member;
//import net.dv8tion.jda.api.entities.User;
//import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
//
//public class ServerAge extends ModuleBase {
//	
//	private int year;
//	private int month;
//	private int day;
//	private int hour;
//	private int minute;
//	private int second;
//
//	public ServerAge(MessageReceivedEvent event) {
//		super(event);
//	}
//
//	@Override
//	/*public void process()
//	{
//		//!sage:
//		Member member = event.getMember();
//		
//		//make sendMessageFormat
//		//create variables for member.getJoinDate() & member.getJoinDate().getMonth().toString()
//		channel.sendMessage(member.getAsMention()+
//		" joined this server in "+
//		//making Capitalized month
//		member.getJoinDate().getMonth().toString().substring(0,1).toUpperCase()+
//		member.getJoinDate().getMonth().toString().substring(1).toLowerCase()+
//		" of "+member.getJoinDate().getYear()+"!").queue();
//	}*/
//	
//	public void process()
//	{
//		Member member = event.getMember();
//		
//		//channel.sendMessage(member.getJoinDate().toString().replace("T","-").replace("Z","")).queue();
//		//channel.sendMessage(LocalDateTime.now().toString().replace("T","-")).queue();
//		
//		String joinTime = member.getJoinDate().toString().replace("T","-").replace(":","-").replace(".","-");
//		String[] join = joinTime.split("-");
//		
//		String currentTime = LocalDateTime.now().toString().replace("T","-").replace(":","-").replace(".","-");
//		String[] current = currentTime.split("-");
//		
//		/*
//		1st index: year
//		2nd index: month
//		3rd index: day
//		4th index: hour
//		5th index: minute
//		6th index: seconds
//		7th index: extra crap we don't need
//		*/
//		
//		/*
//		 * year: 0-4
//		 * month: 5-7
//		 * day: 8-10
//		 * hour: 11-13
//		 * minute: 14-16
//		 * second: 17-19
//		 */
//		
//		this.year = Math.abs((Integer.parseInt(joinTime.substring(0,4))-Integer.parseInt(currentTime.substring(0,4))));
//		
//		//MONTHS
//		if(Integer.parseInt(current[1]) < Integer.parseInt(join[1]))
//		{
//			this.month = (Integer.parseInt(currentTime.substring(5,7))-Integer.parseInt(joinTime.substring(5,7))+12);
//			this.year -= 1;
//		}
//			else if(Integer.parseInt(current[1]) > Integer.parseInt(join[1]))
//			{
//				this.month = Math.abs((Integer.parseInt(joinTime.substring(5,7))-Integer.parseInt(currentTime.substring(5,7))));
//			}
//		
//		//DAYS
//		if(Integer.parseInt(current[2]) < Integer.parseInt(join[2]))
//		{
//			//if year is leap year, year%4==0?
//			switch(Integer.parseInt(current[1]))
//			{
//			//31 days:
//			case 1:
//			case 3:
//			case 5:
//			case 7:
//			case 8:
//			case 10:
//			case 12: this.day = (Integer.parseInt(currentTime.substring(8,10))-Integer.parseInt(joinTime.substring(8,10))+31);
//				break;
//			//30 days:
//			case 4:
//			case 6:
//			case 9:
//			case 11: this.day = (Integer.parseInt(currentTime.substring(8,10))-Integer.parseInt(joinTime.substring(8,10))+30);
//				break;
//			//28 days:
//			case 2: this.day = (Integer.parseInt(currentTime.substring(8,10))-Integer.parseInt(joinTime.substring(8,10))+28);
//				break;
//			default: this.day = (Integer.parseInt(currentTime.substring(8,10))-Integer.parseInt(joinTime.substring(8,10))+10000000);
//				break;
//			}
//			this.month -= 1;
//			
//		}
//			else if(Integer.parseInt(current[2]) > Integer.parseInt(join[2]))
//			{
//				this.day = Math.abs((Integer.parseInt(joinTime.substring(8,10))-Integer.parseInt(currentTime.substring(8,10))));
//			}
//		
//		//HOURS
//		if(Integer.parseInt(current[3]) < Integer.parseInt(join[3]))
//		{
//			this.hour = ((Integer.parseInt(currentTime.substring(11,13))-Integer.parseInt(joinTime.substring(11,13))+24));
//			this.day -= 1;
//		}
//			else if(Integer.parseInt(current[3]) > Integer.parseInt(join[3]))
//			{
//				this.hour = Math.abs((Integer.parseInt(joinTime.substring(11,13))-Integer.parseInt(currentTime.substring(11,13))));
//			}
//		
//		//MINUTES
//		if(Integer.parseInt(current[4]) < Integer.parseInt(join[4]))
//		{
//			this.minute = ((Integer.parseInt(currentTime.substring(14,16))-Integer.parseInt(joinTime.substring(14,16))+60));
//			this.hour -= 1;
//		}
//			else if(Integer.parseInt(current[4]) > Integer.parseInt(join[4]))
//			{
//				this.minute = Math.abs((Integer.parseInt(joinTime.substring(14,16))-Integer.parseInt(currentTime.substring(14,16))));
//			}
//		
//		//SECONDS
//		if(Integer.parseInt(current[5]) < Integer.parseInt(join[5]))
//		{
//			this.second = ((Integer.parseInt(currentTime.substring(17,19))-Integer.parseInt(joinTime.substring(17,19))+60));
//			this.minute -= 1;
//		}
//			else if(Integer.parseInt(current[2]) > Integer.parseInt(join[2]))
//			{
//				this.second = Math.abs((Integer.parseInt(joinTime.substring(17,19))-Integer.parseInt(currentTime.substring(17,19))));
//			}
//		
//		age(year, month, day, hour, minute, second);
//		
//		//################// EMBED BUILDER //################//
//		
//		EmbedBuilder embedBuilder = new EmbedBuilder();
//		
//		
//	}//end process method
//	
//	public void age(int year, int month, int day, int hour, int minute, int second)
//	{
//		User user = event.getMember().getUser();
//		String joined = "%s, you joined this channel ";
//		
//		if(year == 0 && month == 0 && day == 0 && hour == 0 && minute == 0)
//		{
//			channel.sendMessageFormat(joined + "seconds ago.", user.getAsMention(), second).queue();
//		}
//		else if(year == 0 && month == 0 && day == 0 && hour == 0)
//		{
//			channel.sendMessageFormat(joined + "%s minute(s), and %s seconds ago.", user.getAsMention(), minute, second).queue();
//		}
//		else if(year == 0 && month == 0 && day == 0)
//		{
//			channel.sendMessageFormat(joined + "%s hour(s), %s minute(s), and %s seconds ago.", user.getAsMention(), hour, minute, second).queue();
//		}
//		else if(year == 0 && month == 0)
//		{
//			channel.sendMessageFormat(joined + "%s day(s), %s hour(s), %s minute(s), and %s seconds ago.", user.getAsMention(), day, hour, minute, second).queue();
//		}
//		else if(year == 0)
//		{
//			channel.sendMessageFormat(joined + "%s month(s), %s day(s), %s hour(s), %s minute(s), and %s seconds ago.", user.getAsMention(), month, day, hour, minute, second).queue();
//		}
//		else
//		{
//			channel.sendMessageFormat(joined + "%s year(s), %s month(s), %s day(s), %s hour(s), %s minute(s), and %s seconds ago.", user.getAsMention(), year, month, day, hour, minute, second).queue();
//		}
//	}//end age method
//}