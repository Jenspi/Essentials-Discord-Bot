Essentials // Jennifer Spicer // May 2019

⋆ ˚。⋆୨୧˚ ˚୨୧⋆。˚ ⋆⋆ ˚。⋆୨୧˚　˚୨୧⋆。˚ ⋆⋆ ˚。⋆୨୧˚　˚୨୧⋆。˚ ⋆⋆ ˚。⋆୨୧˚　˚୨୧⋆。˚ ⋆⋆ ˚。⋆୨୧˚　˚୨୧⋆。˚ ⋆

Description:
This is the "essentials" discord bot made April 10, 2019.

⋆ ˚。⋆୨୧˚ ˚୨୧⋆。˚ ⋆⋆ ˚。⋆୨୧˚　˚୨୧⋆。˚ ⋆⋆ ˚。⋆୨୧˚　˚୨୧⋆。˚ ⋆⋆ ˚。⋆୨୧˚　˚୨୧⋆。˚ ⋆⋆ ˚。⋆୨୧˚　˚୨୧⋆。˚ ⋆

Code issues:
Returning to the project in 2023, here are all the issues discovered:
1.

⋆ ˚。⋆୨୧˚ ˚୨୧⋆。˚ ⋆⋆ ˚。⋆୨୧˚　˚୨୧⋆。˚ ⋆⋆ ˚。⋆୨୧˚　˚୨୧⋆。˚ ⋆⋆ ˚。⋆୨୧˚　˚୨୧⋆。˚ ⋆⋆ ˚。⋆୨୧˚　˚୨୧⋆。˚ ⋆

RUN in Eclipse:
>> Open projects from file system

⋆ ˚。⋆୨୧˚ ˚୨୧⋆。˚ ⋆⋆ ˚。⋆୨୧˚　˚୨୧⋆。˚ ⋆⋆ ˚。⋆୨୧˚　˚୨୧⋆。˚ ⋆⋆ ˚。⋆୨୧˚　˚୨୧⋆。˚ ⋆⋆ ˚。⋆୨୧˚　˚୨୧⋆。˚ ⋆

Fix common IDE issues:
>> Project 'DiscordBot' is missing required library: './JDA-3.8.3_463-withDependencies-no-opus.jar'
	> go to https://github.com/discord-jda/JDA/releases > download newest withDependencies-no-opus.jar file
	> right click DiscordBot in eclipse > properties > java build path
	> libraries tab > add external jars > (add newest one) > apply

⋆ ˚。⋆୨୧˚ ˚୨୧⋆。˚ ⋆⋆ ˚。⋆୨୧˚　˚୨୧⋆。˚ ⋆⋆ ˚。⋆୨୧˚　˚୨୧⋆。˚ ⋆⋆ ˚。⋆୨୧˚　˚୨୧⋆。˚ ⋆⋆ ˚。⋆୨୧˚　˚୨୧⋆。˚ ⋆

Patch notes:
6/28/23:
	CHANGES– REMOVED online status of bot; REMOVED Age.java and ServerAge.java for outdated commands !age and !sage, respectively, that showed the user's account creation date and their server join date, which are now permanent features on Discord.
	QUESTIONS–
		1. How to set bot status to DND?
		2. Difference between Rest Ping and Gateway Ping?
		3. Difference between sendMessageEmbeds and sendMessageComponents?
		4. What was I doing with Art and Draw classes?

		5. Can I share my code on GitHub without my token exposed? Should I even share it publicly?
		6. Do I need bin file? What else do I not need to upload? Is there a perms file to include? Can someone run this without adding it to the discord dev portal? How exactly would someone run this if they had/did not have the code?
		7. When do I do version releases? How do I keep track of all of these updates/patch notes? Do I do all of these only with official releases? How do I know when to do an official release? What is industry standard to number the versions?
		8. Shard info? Rest actions?
	//TODO
		1. Find new bot picture/give credit
		2. Figure out token situation
		3. Figure out how to host bot
		4. Update front page README.md for overall project

		5. Roles class (react for roles; not started)
		6. Link GitHub, credits and whatnot in Discord and code
		7. Figure out why I have unused lines of code... what was I going to do with them?
		8. Figure out what I was going to do with Art and Draw classes
		9. Fix !choose
		10. Fix !clear



6/29/23:
	CHANGES– !clear now works.
	//TODO
		1. Update missing image on !help image



6/30/23:
	CHANGES– ADDED !clear edge cases and their error messages; FIXED !clear embed; REMOVED and organized testing/debugging code; 
	QUESTIONS–
		1. Is it possible to do clear all?
		2. Can I add an admin only option for !clear command?
		3. Should I include "created by Jenspi" on every single embed or just on !help?
	//TODO
		1. Fix embeds for !clear, !clear edge cases, !choose edge cases, !choose output.
		2. Add embed for !clear output
		3. Save color palette somewhere
		4. Change !choose separator from ||
		5. Replace if/elses with switch cases



7/1/23:
	CHANGES– ADDED !clear command info to !help; FIXED !choose logic; CHANGED !choose separator from || to ?.

⋆ ˚。⋆୨୧˚ ˚୨୧⋆。˚ ⋆⋆ ˚。⋆୨୧˚　˚୨୧⋆。˚ ⋆⋆ ˚。⋆୨୧˚　˚୨୧⋆。˚ ⋆⋆ ˚。⋆୨୧˚　˚୨୧⋆。˚ ⋆⋆ ˚。⋆୨୧˚　˚୨୧⋆。˚ ⋆