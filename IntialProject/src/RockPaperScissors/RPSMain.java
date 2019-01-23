package RockPaperScissors;

import java.util.Scanner;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Random;

public class RPSMain {

	public static void main(String[] args) 
	{
		 Dictionary combo = new Hashtable();
		 combo.put("Rock","Scissors");
		 combo.put("Paper","Rock");
		 combo.put("Scissors","Paper");
		 int maxRounds =5 ;
		 gameTracker(maxRounds,combo);
	}
	
	private static void gameTracker(int maxRounds,Dictionary combo)
	{
		RPSStats stats = new RPSStats();
		int[] choiceMade = new int[3];
		Boolean games= true;
		for(int rounds = 0; rounds <maxRounds ;rounds++)
		{
			stats.setRoundPlayed();
			System.out.println(stats.getGamesPlayed());
			String playerMove = inputChecker();
			String computerMove = computerMove();
			

			statCounter(stats,playerMove);
			statCounter(stats,computerMove);
			
			System.out.println("Player:" + playerMove + " vs AI: "+ computerMove);	
			String winner = playGame(playerMove,computerMove,combo);
			if(winner == "Player")
			{
				stats.setPScore();
			}
			else if(winner == "Computer")
			{
				stats.setCScore();
			}
			else
			{
				stats.setDScore();
			}
			if(rounds < maxRounds-1)
			{
				if(!continueGame())
				{
					rounds = maxRounds;
				}
			}
		}	
		printStats(stats);

	}
	private static void statCounter(RPSStats stat, String move)
	{
		switch(move)
		{
			case "Rock": stat.getChoice().setRock();
				break;
			case "Paper": stat.getChoice().setPaper();
				break;
			case "Scissors":stat.getChoice().setScissors();
				break;
		}
	}
	private static void printStats(RPSStats stats)
	{
		System.out.println("Game ended stats below.");
		System.out.println("Rounds played: " +stats.getGamesPlayed());
		System.out.println("Player won: " + stats.getPScore() + " times. Win % is " + (((float)stats.getPScore() / (float)stats.getGamesPlayed())*100) + "%");
		System.out.println("Computer won: " +stats.getCScore() + " times. Win % is " + ((float)stats.getCScore() / (float)stats.getGamesPlayed())*100 + "%");
		System.out.println("Draws : " +stats.getDScore() + ".  Tie % is " + ((float)stats.getDScore()/ (float)stats.getGamesPlayed())*100 + "%");
		System.out.println("rock was " + stats.getChoice().getRock() + " scissors was " + stats.getChoice().getScissors() + " paper was " + stats.getChoice().getPaper());
		System.out.println("the most common is " + stats.getChoice().mostCommon());
	}
	private static Boolean continueGame()
	{
		int input = 0;
		boolean badInput = true;
		Scanner inputScanner = new Scanner(System.in);
		do
		{
			System.out.println("Do you want to continue:");
			System.out.println("1 = Yes, 2 = No ");
			
			try 
			{
				input = Integer.parseInt(inputScanner.nextLine());
				if(input>0 & input<=2)
				{
					badInput = false;
				}
				else
				{
					System.out.println("incorrect range must be between 1 and 2");
				}			
			}	
			catch (Exception ex) 
			{
				System.out.println("Please enter a number");
			} 

		} while (badInput);
		return (input ==1? true: false);
	}
	private static String playGame(String playerMove,String computerMove,Dictionary combo)
	{
		if(playerMove.equals(computerMove))
		{			
			System.out.println("Draw");
			return "Draw";
		}
		else if(combo.get(playerMove)==computerMove)
		{
			System.out.println("Player Wins");
			return "Player";
		}
		else
		{
			System.out.println("AI Wins");
			return "Computer";
		}
		
	}
	
	private static String computerMove()
	{
		Random randomVal = new Random();
		int moveValue = randomVal.nextInt(3)+1;
		switch(moveValue)
		{
			case 1: return "Rock";
			case 2: return "Paper";
			case 3: return "Scissors";	
		}
		return null;
	}
	private static String inputChecker()
	{
		int input = 0;
		boolean badInput = true;
		Scanner inputScanner = new Scanner(System.in);
		do
		{
			System.out.println("Enter your move:");
			System.out.println("1 = Rock, 2= Paper 3 = Scissors");
			
			try 
			{
				input = Integer.parseInt(inputScanner.nextLine());
				if(input>0 & input<=3)
				{
					badInput = false;
				}
				else
				{
					System.out.println("incorrect range must be between 1 and 3");
				}			
			}	
			catch (Exception ex) 
			{
				System.out.println("Please enter a number");
			} 

		} while (badInput);
		switch(input)
		{
		case 1: return "Rock";
		case 2: return "Paper";
		case 3: return "Scissor";
		}
		return null;
	}
	
	
}
