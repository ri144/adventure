package adventure;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("WELCOME TO ROB'S TINY ADVENTURE!");
		System.out.println("You're on a quest for the holy grail when suddenly your path is blocked by a fearsome knight.\n"
				+ " He tells you to find him a shrubbery back in 'town'.  If you don't want to go back, you can try going on\n"
						+ "a different path towards what seems to lead to a 'fortress' in the distance.  Where would you like\n"
						+ "to go? (fortress or town)");
		if (s.next().equals("town")){
			System.out.println("You go to the town and find that the townsfolk are yelling about burning what seems to be a\n"
					+ "quite nice young lady.  You can try to save her by appealing to their logic of 'ducks' and then try\n"
					+ "asking someone for a shrubbery afterwards, or just go to another part of town where people\n"
					+ "might be more 'sensible'.  What would you like to do? (ducks or sensible)");
			if(s.next().equals("ducks")){
				System.out.println("You inform the townspeople that if the woman was a witch then to burn she would need to\n"
						+ " be made of wood.  And if she were made of wood, she would be able to float.  And if she could\n"
						+ "float then she would be a duck.  The people murmur in agreeement to put her on a scale to compare\n"
						+ "with a duck.  While they are distracted in setting this up, you ask someone where to find a shrubbery,\n"
						+ "and they tell you that you can find one at the castle 'anthrax' or by killing the killer 'rabbit'.\n"
						+ "Which would you like to try? (anthrax or rabbit)");
				if(s.next().equals("anthrax")){
					System.out.println("You decide to go to a castle rather than risk your life to a killer rabbit.  Once there,\n"
							+ "you are let in by a beautiful maid who leads you to a room.  You ask her about a shrubbery, but\n"
							+ "she tells you to ask another beautiful girl who has now entered the room.  She massages your feet\n"
							+ "while dodging your question, so after a while (It's hard to leave at first as it is pretty soothing)\n"
							+ "you go back to the entrance to find it's locked.  In fact there are many barely-clothed woman all\n"
							+ "around the area and one walks up to you and brushes softly against your chest. Locked in a tower with\n"
							+ "many women you're not sure whether you're in a nightmare or dream- one thing's for certain- there'll\n"
							+ "be no holy grail for you. THE END");
				}
				else{
					System.out.println("You figure how scary can a rabbit be, so you decide to confront it.  You get to the place the\n"
							+ "townsperson told you of and dismount your horse.  As you look around you see bones scattered everywhere.\n"
							+ "You start to get scared when suddenly the rabbit appears.  You realize that you left your sword with your\n"
							+ "horse and with a piercing cry the rabbit lunges up to your neck and bites you.  As the small mammal mauls\n"
							+ "you, you realize that maybe if you had heeded the townsperson more cautiously you wouldn't be at . . . THE END");
				}
			}
			else{
				System.out.println("You decide these people must be all crazy and saving one of them would not really help you, so it would\n"
						+ "so it would be much better to be sensible and go somewhere else in town.  You walk into another part of town where\n"
						+ "there are 'monks' banging wood against their head while chanting something.  Meanwhile 'someone' else is yelling, 'Bring\n"
						+ "out your dead' while banging a gong.  You don't really see anybody else, so who would you like to approach for"
						+ " help? (monks or someone)");
				if(s.next().equals("monks")){
					System.out.println("You decide that even if they may be a little crazy, monks are generally good people and would probably\n"
							+ "be more helpful.  You ask one about a shrubbery and he throws you a robe and plank of wood without stopping his\n"
							+ "chanting.  You figure that maybe joining them, they will help you with your cause so you join in.  After a while\n"
							+ "you realize that this is futile and your head is starting to hurt, but when you try to stop you don't seem to\n"
							+ "be able to control your actions anymore and have indeed become one with the cult of monks.  It seems that despite your\n"
							+ "efforts, you too have gone crazy in THE END");
				}
				else{
					System.out.println("You choose to approach the guy banging a gong rather than deal with more crazies, so you ask him what\n"
							+ "he's doing.  He tells you that he's warns you that this part of town is infected with the plague and he is collecting\n"
							+ "the dead to take them away to be burned elsewhere.  He suddenly makes a face of horror and points to the back of your\n"
							+ "hand which has a black spot on it. Wait a second, this isn't a pirate story?!  Well, I suppose not, which must mean that\n"
							+ "you have caught the plague, and that your adventure has come to THE END");
				}
			}
		}
		else{
			System.out.println("You decide to ignore the knight and walk towards the path leading to the fortress.\n"
					+ "When you get there you see a lone soldier at the top, so you ask him where you might find the holy\n"
					+ " grail.  Instead of telling you, he says that your mother is a hamster and that your father smells of\n"
					+ "elderberries.  While taking in this nonsensical reply, you notice that the guard to the castle has now\n"
					+ "started throwing cows of all things over the walls and that you must run away.  You can either run\n"
					+ "towards a precarious 'bridge' or back towards where the 'knight' was.  Which do you choose? (bridge or knight)");
			if(s.next().equals("knight")){
				System.out.println("Tired of the nonsense of this world, you run back to where the black knight was to confront him.\n"
						+ "He says nothing this time probably assuming you have not completed your quest to find him a shrubbery.  You\n"
						+ "consider your options now- 'fight' him, or perhaps 'asking' him where one might find a shrubbery could be helpful\n"
						+ "Which do you want to do? (fight or asking)");
				if(s.next().equals("fight")){
					System.out.println("This guy has pissed you off a lot with his stupid request for a shrubbery, getting insulted and then getting\n"
							+ "cows thrown at you as a result.  You tell him to draw his weapon and as you fight, it is clear that he is the better\n"
							+ "swordsman and he thrusts his sword through you.  As you lay bleeding out, another group comes up the path led by someone\n"
							+ "claiming to be 'Arthur, king of the Brits'.  When the black knight doesn't let him pass either, Arthur dismembers the\n"
							+ "knight in battle and continues on.  Too bad you weren't more patient to reach THE END");
				}
				else{
					System.out.println("You decide to hold in your angry emotions, and instead tell the knight, 'I have been having trouble\n"
							+ "finding the shrubbery.  Could you help me find it?'  As you say the last word, he starts to cry and falls to the ground\n"
							+ "Confused you step over him and continue along the path.  You see the grail hovering in the sky in the distant, so you\n"
							+ " head in that direction.  But when you're almost there.  Police officers (You read that correctly) arrest you for \n"
							+ "disturbing the peace and you're taken away to jail.  Guess you'll never get the grail now.  THE END");
				}
			}
			else{
				System.out.println("You figure it would be better to try going somewhere new, so you run towards the bridge.\n"
						+ "You see a sign along the way that says 'Caution, Bridge of Death'.  You keep walking more carefully\n"
						+ "and see a cloaked figure.  You approach and the figure croaks, 'If you wish to pass, answer me these\n"
						+ "'questions' 3.'  You also notice another 'path' which you have no idea where it leads.  So what will you\n"
						+ "do? (questions or path)");
				if(s.next().equals("questions")){
					System.out.println("You tell the mysterious figure to ask his questions.  He asks you for your name which \n"
							+ "you easily give.  Then he asks you for your quest to which you respond that it is to seek the holy\n"
							+ "grail.  Finally, he asks you, 'What is the capital of Assyria?' You've never heard of that place so\n"
							+ "when you inevitably get it wrong because you don't know that, you are sent flying from the aptly named\n"
							+ "Bridge of Death.  You may not have known the answer, but you must surely know that for you this is THE END");
				}
				else{
					System.out.println("You decide to steer clear of the Bridge of Death and the mysterious person, and follow the\n"
							+ "other path.  The path ends at a cliff where you see a wizard randomly blasting rocks with fire.  You\n"
							+ "call out to him and ask him his name to which he pauses and responds, 'I am an enchanter that goes by\n"
							+ "many names, but most call me Tim'.  He continues to randomly blast large boulders with fire, so you decide to\n"
							+ "sit down and wait for him to finish since he's probably a pretty knowledgable guy.  It gets dark and with\n"
							+ "that, his vision gets worse and he accidentally blasts you to smithereens.  You can't really blame him\n"
							+ "though, you were just sitting around like a rock.  THE END");
				}
			}
		}
	}
	
}
