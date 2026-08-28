import java.io.Console;
import java.util.*;

/**
* The user enters text into a search box. This class is used
* to parse that text into specific search terms (or tokens).
* It eliminates common words, and allows for the quoting of text, using
* double quotes.
* JDK 7+.
*/
public class Game {

  private Set<String> theSetOfValidAtomicCommands;
  private Set<String> theSetOfValidObjects;
  private Set<String> thePlacesYouCanBe;
  private Set<Area> areas;
  private int experience = 0;
  private int level = 1;
  
  private Set<String> thingsYouCanDoInThePlaceYouAreIn;
	
  public static void main(String[] aArguments) {
    Game parser = new Game();
    parser.parseSearchText();
    //display the tokens
    System.out.println("THE END");
  }

  public Game() {
	  theSetOfValidAtomicCommands = new HashSet<String>();
	  theSetOfValidAtomicCommands.add("what");
	  theSetOfValidAtomicCommands.add("what is");
	  theSetOfValidAtomicCommands.add("look");
	  theSetOfValidAtomicCommands.add("voir");
	  theSetOfValidAtomicCommands.add("examine");
	  theSetOfValidAtomicCommands.add("investigate");
	  theSetOfValidAtomicCommands.add("espy");
	  theSetOfValidAtomicCommands.add("observe");
	  theSetOfValidAtomicCommands.add("remark");
	  theSetOfValidAtomicCommands.add("riposte");
	  theSetOfValidAtomicCommands.add("rebut");
	  theSetOfValidAtomicCommands.add("debunk");
	  theSetOfValidAtomicCommands.add("toilet");
	  theSetOfValidAtomicCommands.add("play");
	  theSetOfValidAtomicCommands.add("use");
	  theSetOfValidAtomicCommands.add("eat");
	  theSetOfValidAtomicCommands.add("urinate");
	  theSetOfValidAtomicCommands.add("defecate");
	  theSetOfValidAtomicCommands.add("destroy");
	  theSetOfValidAtomicCommands.add("blow up");
	  theSetOfValidAtomicCommands.add("corrupt");
	  theSetOfValidAtomicCommands.add("distill");
	  theSetOfValidAtomicCommands.add("instantiate");
	  theSetOfValidAtomicCommands.add("annihilate");
	  theSetOfValidAtomicCommands.add("push");
	  theSetOfValidAtomicCommands.add("pull");
	  theSetOfValidAtomicCommands.add("block");
	  theSetOfValidAtomicCommands.add("attack");
	  theSetOfValidAtomicCommands.add("defend");
	  theSetOfValidAtomicCommands.add("cast");
	  theSetOfValidAtomicCommands.add("magic");
	  theSetOfValidAtomicCommands.add("run");
	  theSetOfValidAtomicCommands.add("exercise");
	  theSetOfValidAtomicCommands.add("score");
	  
	  
	  theSetOfValidObjects = new HashSet<String>();
	  theSetOfValidObjects.add("hamburger");
	  
  }

  /**
  * Parse the user's search box input into a Set of String tokens.
  *
  * @return Set of Strings, one for each word in fSearchText; here "word"
  * is defined as either a lone word surrounded by whitespace, or as a series
  * of words surrounded by double quotes, "like this"; also, very common
  * words (and, the, etc.) do not qualify as possible search targets.
  */
  public void parseSearchText() {
	  
	  Console c = System.console();
      if (c == null) {
          System.err.println("No console.");
          System.exit(1);
      }

      String latestCommand = "Eeewh";
      String latestTextShownToExperiencer = "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n" +
      "The truth is that you are someone somewhere. \n"+
      "If there's any more truth than that, you'll have to type \n"+
      "commands to find it out.\n\n"+
      "So come on. You're the someone. Type what you're going to do. \n"+
      "You could LOOK around or something (you'd better have got the hint, \n"+
      "I don't get paid enough for this).\n\n Type your command now: ";

      int theScore = 0;
      int theMaximalisedScore = 100;
      
      boolean theGameIsOver = false;
      
      while (theGameIsOver != true) {
String latestAtomicCommand = "";
    	  latestCommand = c.readLine(latestTextShownToExperiencer).trim().toLowerCase();
          if (experience > 30 && level == 1) {
        	  latestTextShownToExperiencer += "\n\nCONGRATULATIONS!! You reach Level 2!!";
        	  latestCommand = c.readLine(latestTextShownToExperiencer);  
        	  
          }
          
          if (latestCommand.contains("stop playing the game") || latestCommand.equals("end") || latestCommand.equals("exit") || latestCommand.equals("quit")) {
              theScore += 23;
        	  latestTextShownToExperiencer = "\n\nArgh!! No!!!!!! Get back here and play my game, you piece of WEAOING!! FELLISH MORT! I aws havnig fun torturing you iwth tis piehce of tarsh text prastrer gamesing. But I's ouwld have taknen yror soul and so cupcakes. But NUUUUUUUU. You ahd to figrure its out. Wah!! I'll be misrerblel for ages now......";
        	  latestTextShownToExperiencer += "\n\nYOU'RE NOT DEAD AND YOU'RE ALIVE AND THE GAME'S COMPLETED WELL DONE";
        	  
        	  latestTextShownToExperiencer += "\n\nYour score was " + theScore + " out of " + theMaximalisedScore + ". Wow! Now unlike all of those ancient puzzle games like this that had a score where you didn't get anything whatsoever for managing a perfect score, you get something sa reward! A non-existent biscuit.";
        	  latestCommand = c.readLine(latestTextShownToExperiencer);  	  
              theGameIsOver = true;
              continue;
          }
          
    	  

    	  if (latestCommand.contains("die")) {
        	  latestTextShownToExperiencer = "\n\nWho do you want to die?";
              
        	  latestCommand = c.readLine(latestTextShownToExperiencer);  	  

        	  continue;
          }
    	  
    	  else if (latestCommand.equals("Kill")) {
        	  latestTextShownToExperiencer = "\n\n'Kill'? Kill who? \nWho do you want to kill, you stupid piece of trash?";
              
        	  //latestTextShownToExperiencer = "\n\nWhat's this, trying to curry favour with me? It won't do you any good. That's right. You die..";
        	  latestTextShownToExperiencer += "\n\nYOU'RE DEAD";
        	  
        	  latestTextShownToExperiencer += "\n\nYour score was " + theScore + " out of " + theMaximalisedScore;
        	  latestCommand = c.readLine(latestTextShownToExperiencer);  	  
              theGameIsOver = true;
              continue;
          }
    	  
    	  else if (latestCommand.contains("attack")) {
        	  latestTextShownToExperiencer = "\n\nYou attack the floor. \n\nYou deal 9 damage to the floor.\n\n You win the battle and gain 6 EXP!";
              experience += 6;
        	  latestCommand = c.readLine(latestTextShownToExperiencer);  	  

              continue;
          }
    	  
    	  else if (latestCommand.contains("defecate")) {
        	  latestTextShownToExperiencer = "\n\nYou exert your muscles and ultimately bring feces forth from your bahookie. Uh, bottom. \n\n"+
    	      "This horrific chamber frayed your nerves so that this was very hard to do. So hard, in fact, that you "+
              "\n\ntore open your backside, and all your significant internal organs drained out of your posterior.";
              
        	  //latestTextShownToExperiencer = "\n\nWhat's this, trying to curry favour with me? It won't do you any good. That's right. You die..";
        	  latestTextShownToExperiencer += "\n\nYOU'RE DEAD";
        	  
        	  latestTextShownToExperiencer += "\n\nYour score was " + theScore + " out of " + theMaximalisedScore;
        	  latestCommand = c.readLine(latestTextShownToExperiencer);  	  
              theGameIsOver = true;
              continue;
          }
    	  
    	  else if (latestCommand.equals("game")) {
        	  latestTextShownToExperiencer = "\n\nUh, yeah, this is a game. Well shulking observed. Uh, well... freaking observed.";
              latestTextShownToExperiencer += "\n\n " + theSetOfValidAtomicCommands.toString().replace("[", "").replace("]", "").replace(",", "\n");
        	  //latestTextShownToExperiencer = "\n\nWhat's this, trying to curry favour with me? It won't do you any good. That's right. You die..";
              latestTextShownToExperiencer += "\n\nYou contract smallpox and die.";
              
              latestTextShownToExperiencer += "\n\nYOU'RE DEAD";
        	  
        	  latestTextShownToExperiencer += "\n\nYour score was " + theScore + " out of " + theMaximalisedScore;
        	  latestCommand = c.readLine(latestTextShownToExperiencer);  	  
              theGameIsOver = true;
              continue;
          }

    	  else if (latestCommand.contains("riposte")) {
        	  latestTextShownToExperiencer = "\n\n'Have that, air! Your mother smells like a cow!', you decry with bravado. \n" + 
        			                         "The clammy air of the dungeon takes such umbrage that it somehow kills you.";
              latestTextShownToExperiencer += "\n\n " + theSetOfValidAtomicCommands.toString().replace("[", "").replace("]", "").replace(",", "\n");
        	  //latestTextShownToExperiencer = "\n\nWhat's this, trying to curry favour with me? It won't do you any good. That's right. You die..";
              latestTextShownToExperiencer += "\n\nYou contract smallpox and die.";
              
              latestTextShownToExperiencer += "\n\nYOU'RE DEAD";
        	  
        	  latestTextShownToExperiencer += "\n\nYour score was " + theScore + " out of " + theMaximalisedScore;
        	  latestCommand = c.readLine(latestTextShownToExperiencer);  	  
              theGameIsOver = true;
              continue;
          }
    	  
    	  else if (latestCommand.contains("debunk")) {
        	  latestTextShownToExperiencer = "\n\nYou attempt to debunk the veracity of your situation using stock skeptical arguments.\n\n" +
    	      "Unfortunately scientific skepticism is not canon, and you die.";
              latestTextShownToExperiencer += "\n\n " + theSetOfValidAtomicCommands.toString().replace("[", "").replace("]", "").replace(",", "\n");
        	  //latestTextShownToExperiencer = "\n\nWhat's this, trying to curry favour with me? It won't do you any good. That's right. You die..";
              latestTextShownToExperiencer += "\n\nYou contract smallpox and die.";
              
              latestTextShownToExperiencer += "\n\nYOU'RE DEAD";
        	  
        	  latestTextShownToExperiencer += "\n\nYour score was " + theScore + " out of " + theMaximalisedScore;
        	  latestCommand = c.readLine(latestTextShownToExperiencer);  	  
              theGameIsOver = true;
              continue;
          }
    	  
    	  else if (latestCommand.contains("run") || latestCommand.contains("exercise") ||  latestCommand.contains("play") ) {
        	  latestTextShownToExperiencer = "\n\nYou run straight into the iron maiden on the opposite wall and die a terrible, spiky death.";
              latestTextShownToExperiencer += "\n\n " + theSetOfValidAtomicCommands.toString().replace("[", "").replace("]", "").replace(",", "\n");
        	  //latestTextShownToExperiencer = "\n\nWhat's this, trying to curry favour with me? It won't do you any good. That's right. You die..";
              
              latestTextShownToExperiencer += "\n\nYOU'RE DEAD";
        	  
        	  latestTextShownToExperiencer += "\n\nYour score was " + theScore + " out of " + theMaximalisedScore;
        	  latestCommand = c.readLine(latestTextShownToExperiencer);  	  
              theGameIsOver = true;
              continue;
          }
    	  
    	  else if (latestCommand.equals("help")) {
        	  latestTextShownToExperiencer = "\n\nThe following basic commands exist. More may be found through experimentation.";
              latestTextShownToExperiencer += "\n\n " + theSetOfValidAtomicCommands.toString().replace("[", "").replace("]", "").replace(",", "\n");
        	  //latestTextShownToExperiencer = "\n\nWhat's this, trying to curry favour with me? It won't do you any good. That's right. You die..";

              if (level < 2) {
            	 latestTextShownToExperiencer += "\n\nYou contract smallpox and die."; 
                 latestTextShownToExperiencer += "\n\nYOU'RE DEAD";
           	  
             	 latestTextShownToExperiencer += "\n\nYour score was " + theScore + " out of " + theMaximalisedScore;

                 theGameIsOver = true;            	            	 
              }
              else {
             	 latestTextShownToExperiencer += "\n\nYou contract smallpox. However, your level of experience is \n\n"+
                                                 "high enough to survive until it's drained from your system!"; 
             	 
             	theScore += 50;
            	  
              }

        	  latestCommand = c.readLine(latestTextShownToExperiencer);  	  
              continue;
          }
    	  
    	  else if (latestCommand.equals("narrator")) {
        	  latestTextShownToExperiencer = "\n\nMe?? Fellish-- uh, foolish mo-- player. I'm not canon.\n" +
    	      "Haven't you played one of these kinds of games before?\n" + 
        	  "Because if you haven't then why on earth are you playing this one?";
              
        	  //latestTextShownToExperiencer = "\n\nWhat's this, trying to curry favour with me? It won't do you any good. That's right. You die..";
        	  latestTextShownToExperiencer += "\n\nYOU'RE DEAD";
        	  
        	  latestTextShownToExperiencer += "\n\nYour score was " + theScore + " out of " + theMaximalisedScore;
        	  latestCommand = c.readLine(latestTextShownToExperiencer);  	  
              theGameIsOver = true;
              continue;
          }
    	  
    	  else if (latestCommand.equals("you")) {
        	  latestTextShownToExperiencer = "\n\nMe?? Fellish-- uh, foolish mo-- player. I'm not canon.\n" +
    	      "Haven't you played one of these kinds of games before?\n" + 
        	  "Because if you haven't then why on earth are you playing this one?";
              
        	  //latestTextShownToExperiencer = "\n\nWhat's this, trying to curry favour with me? It won't do you any good. That's right. You die..";
        	  latestTextShownToExperiencer += "\n\nYOU'RE DEAD";
        	  
        	  latestTextShownToExperiencer += "\n\nYour score was " + theScore + " out of " + theMaximalisedScore;
        	  latestCommand = c.readLine(latestTextShownToExperiencer);  	  
              theGameIsOver = true;
              continue;
          }
    	  
    	  else if (latestCommand.equals("hate")) {
        	  latestTextShownToExperiencer = "\n\nWho do you hate?";
              
        	  //latestTextShownToExperiencer = "\n\nWhat's this, trying to curry favour with me? It won't do you any good. That's right. You die..";
        	  latestTextShownToExperiencer += "\n\nYOU'RE DEAD";
        	  
        	  latestTextShownToExperiencer += "\n\nYour score was " + theScore + " out of " + theMaximalisedScore;
        	  latestCommand = c.readLine(latestTextShownToExperiencer);  	  
              theGameIsOver = true;
              continue;
          }
    	  
    	  else if (latestCommand.toLowerCase().contains("rrr")) {
        	  latestTextShownToExperiencer = "\n\nWell sheesh, someone's angary. I mean angry. \n" +
        	  "No need to shout. What's your problem?";
              
        	  //latestTextShownToExperiencer = "\n\nWhat's this, trying to curry favour with me? It won't do you any good. That's right. You die..";
        	  latestTextShownToExperiencer += "\n\nYOU'RE DEAD";
        	  
        	  latestTextShownToExperiencer += "\n\nYour score was " + theScore + " out of " + theMaximalisedScore;
        	  latestCommand = c.readLine(latestTextShownToExperiencer);  	  
              theGameIsOver = true;
              continue;
          }
    	  
    	  else if (latestCommand.equals("hello")) {
        	  latestTextShownToExperiencer = "\n\nTere's nobody there. " +
          "I mean, there's nobody there. \n" +
          "Don't be fellish. \n" +
          "FOOLISH I MEAN FOOLISH I meant to say foolish.";
              
        	  //latestTextShownToExperiencer = "\n\nWhat's this, trying to curry favour with me? It won't do you any good. That's right. You die..";
        	  latestTextShownToExperiencer += "\n\nYOU'RE DEAD";
        	  
        	  latestTextShownToExperiencer += "\n\nYour score was " + theScore + " out of " + theMaximalisedScore;
        	  latestCommand = c.readLine(latestTextShownToExperiencer);  	  
              theGameIsOver = true;
              continue;
          }
          
          if (latestCommand.equals("hello narrator")) {
        	  latestTextShownToExperiencer = "\n\nUh, I'm--I'm--n-- hah, don't be silly, \n"+
              "I don't exits. Exist.";

        	  //latestTextShownToExperiencer = "\n\nWhat's this, trying to curry favour with me? It won't do you any good. That's right. You die..";
        	  latestTextShownToExperiencer += "\n\nYOU'RE DEAD";
        	  
        	  latestTextShownToExperiencer += "\n\nYour score was " + theScore + " out of " + theMaximalisedScore;
        	  latestCommand = c.readLine(latestTextShownToExperiencer);  	  
              theGameIsOver = true;
              continue;
          }
          
          for (String command : theSetOfValidAtomicCommands) {
              if (latestCommand.contains(command)) {
            	  latestAtomicCommand = command;
            	  break;
              }        	  
          }
          
          for (String object : theSetOfValidObjects) {
              if (latestCommand.contains(object)) {
            	  latestAtomicCommand = object;
            	  break;
              }        	  
          }
          
          if (latestAtomicCommand.equals("look") || latestAtomicCommand.equals("investigate") || latestAtomicCommand.equals("examine") || latestAtomicCommand.equals("voir")) {
        	  String title = "CHAMBER OF TORTURE";
        	  String description = "Ancient stone walls, dim light, unnerving echoes; \n"+
        	  "but most strikingly, every facet of a medieval torture chamber \n"+
        	  "surrounds you. The monstrous devices, with their gruesome residual \n"+
        	  "ichor of torture sessions past, seem too nightmaresome to be real. \n"+
        	  "Whatever sadist runs -- or ran -- this decrepit dungeon \n"+
        	  "must have been colder than ice.";
        		
        	  latestTextShownToExperiencer = "\n\nYou take a look around. The game's got some \"description.BAT\" file for areas, \n"+
        	  "so, well, here it is.\n\n" + 
        	  title + "\n\n" + description;
        	  latestTextShownToExperiencer += "\n\nYOU'RE DEAD";
        	  
        	  latestTextShownToExperiencer += "\n\nYour score was " + theScore + " out of " + theMaximalisedScore;
        	  latestCommand = c.readLine(latestTextShownToExperiencer);  	  
              theGameIsOver = true;
              continue;
          }
          else if (latestAtomicCommand.equals("")) {
        	  theScore += 1;
        	  latestTextShownToExperiencer = "\n\nYou fail to attempt to do something. \n"+
        	  "When people fail to act, they do nothing. "+
              "\nAnd when they do nothing, the world goes on doing things regardless. \n"+
        	  "That's well known. In this case, thanks to the world going on doing what it does, \n"+
              "you are smashed to death by a grand piano.";
        	  latestTextShownToExperiencer += "\n\nYOU'RE DEAD";
        	  
        	  latestTextShownToExperiencer += "\n\nYour score was " + theScore + " out of " + theMaximalisedScore;
        	  latestCommand = c.readLine(latestTextShownToExperiencer);  	  
              theGameIsOver = true;
              continue;
          }
          else if (latestCommand.equals("play tiddlywinks")) {
        	  latestTextShownToExperiencer = "\n\nYou quench your thirst for the playing of tiddlywinks \n"+
              "by playing tiddlywinks using a tiddlywinks board that was lying \n"+
        	  "several miles away from you. However, you die.";
        	  latestTextShownToExperiencer += "\n\nYOU'RE DEAD";
        	  
        	  latestTextShownToExperiencer += "\n\nYour score was " + theScore + " out of " + theMaximalisedScore;
        	  latestCommand = c.readLine(latestTextShownToExperiencer);  	  
              theGameIsOver = true;
              continue;
          }
          else if (latestCommand.equals("pull")) {
        	  latestTextShownToExperiencer = "\n\nThere ain't nuthin' to pull 'ere, mush. Except your life from your body.";
        	  latestTextShownToExperiencer += "\n\nYOU'RE DEAD";
        	  
        	  latestTextShownToExperiencer += "\n\nYour score was " + theScore + " out of " + theMaximalisedScore;
        	  latestCommand = c.readLine(latestTextShownToExperiencer);  	  
              theGameIsOver = true;
              continue;
          }
          else if (latestCommand.equals("push")) {
        	  latestTextShownToExperiencer = "\n\nThere ain't nuthin' to pull 'ere, mush. Except your life from your body.";
        	  latestTextShownToExperiencer += "\n\nYOU'RE DEAD";
        	  
        	  latestTextShownToExperiencer += "\n\nYour score was " + theScore + " out of " + theMaximalisedScore;
        	  latestCommand = c.readLine(latestTextShownToExperiencer);  	  
              theGameIsOver = true;
              continue;
          }
          else if (latestCommand.equals("score")) {
        	  latestTextShownToExperiencer = "\n\nYour current score is " + theScore + ". \n"+
              "You look upon the amount of your score with dissatisfaction, \n"+
        	  "wondering what you're doing wrong. But then you die.";
        	  latestTextShownToExperiencer += "\n\nYOU'RE DEAD";
        	  
        	  latestTextShownToExperiencer += "\n\nYour score was " + theScore + " out of " + theMaximalisedScore;
        	  latestCommand = c.readLine(latestTextShownToExperiencer);  	  
              theGameIsOver = true;
              continue;
          }
          else if (latestCommand.equals("kill the narrator and stop playing the game")) {
              theScore += 106;
        	  latestTextShownToExperiencer = "\n\nArgh!! No!!!!!! Get back here and play my game, you piece of WEAOING!! FELLISH MORT! I aws havnig fun torturing you iwth tis piehce of tarsh text prastrer gamesing. But I's ouwld have taknen yror soul and so cupcakes. But NUUUUUUUU. You ahd to figrure its out. Wah!! I'll be misrerblel for ages now......";
        	  latestTextShownToExperiencer += "\n\nYOU'RE NOT DEAD AND YOU'RE ALIVE AND THE GAME'S COMPLETED WELL DONE";
        	  
        	  latestTextShownToExperiencer += "\n\nYour score was " + theScore + " out of " + theMaximalisedScore + ". Wow! Now unlike all of those ancient puzzle games like this that had a score where you didn't get anything whatsoever for managing a perfect score, you get something sa reward! A non-existent biscuit.";
        	  latestCommand = c.readLine(latestTextShownToExperiencer);  	  
              theGameIsOver = true;
              continue;
          }
          else if (!latestAtomicCommand.equals("")) {
        	  latestTextShownToExperiencer = "\n\nYou try to do that thing you just tried to do. But you die..";
        	  latestTextShownToExperiencer += "\n\nYOU'RE DEAD";
        	  
        	  latestTextShownToExperiencer += "\n\nYour score was " + theScore + " out of " + theMaximalisedScore;
        	  latestCommand = c.readLine(latestTextShownToExperiencer);  	  
              theGameIsOver = true;
              continue;
          }
      }
      
  }

  // PRIVATE 
  private String fSearchText;
  private static final Set<String> fCOMMON_WORDS = new LinkedHashSet<String>();
  private static final String fDOUBLE_QUOTE = "\"";

  //the parser flips between these two sets of delimiters
  private static final String fWHITESPACE_AND_QUOTES = " \t\r\n\"";
  private static final String fQUOTES_ONLY ="\"";

  /**Very common words to be excluded from searches.*/
  static {
    fCOMMON_WORDS.add("a");
    fCOMMON_WORDS.add("and");
    fCOMMON_WORDS.add("be");
    fCOMMON_WORDS.add("for");
    fCOMMON_WORDS.add("from");
    fCOMMON_WORDS.add("has");
    fCOMMON_WORDS.add("i");
    fCOMMON_WORDS.add("in");
    fCOMMON_WORDS.add("is");
    fCOMMON_WORDS.add("it");
    fCOMMON_WORDS.add("of");
    fCOMMON_WORDS.add("on");
    fCOMMON_WORDS.add("to");
    fCOMMON_WORDS.add("the");
  }

  /**
  * Use to determine if a particular word entered in the
  * search box should be discarded from the search.
  */
  private boolean isCommonWord(String aSearchTokenCandidate){
    return fCOMMON_WORDS.contains(aSearchTokenCandidate);
  }

  private boolean textHasContent(String aText){
    return (aText != null) && (!aText.trim().equals(""));
  }

  private void addNonTrivialWordToResult(String aToken, Set<String> aResult){
    if (textHasContent(aToken) && !isCommonWord(aToken.trim())) {
      aResult.add(aToken.trim());
    }
  }

  private boolean isDoubleQuote(String aToken){
    return aToken.equals(fDOUBLE_QUOTE);
  }

  private String flipDelimiters(String aCurrentDelims){
    String result = null;
    if (aCurrentDelims.equals(fWHITESPACE_AND_QUOTES)){
      result = fQUOTES_ONLY;
    }
    else {
      result = fWHITESPACE_AND_QUOTES;
    }
    return result;
  }
} 