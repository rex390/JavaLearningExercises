package RockPaperScissors;

class Choices
{
	private int rock = 0;
	private int scissors = 0;
	private int paper = 0;
	public void setRock()
	{
		rock++;
	}
	public void setScissors()
	{
		scissors++; 
	}
	public void setPaper()
	{
		paper++;
	}
	public int getRock()
	{
		return rock;
	}
	public int getPaper()
	{
		return paper;
	}
	public int getScissors()
	{
		return scissors;
	}
	public String mostCommon()
	{
		String most = "Rock";
		if(rock > scissors & rock > paper)
		{ 
			most = "Rock";
		}
		if(scissors > rock & scissors > paper)
		{ 
			most = "Scissors";
		}
		if(paper > scissors & paper > rock)
		{ 
			most = "Paper";
		}
		return most;
	}
}
public class RPSStats 
{
	private int playerScore = 0;
	private int computerScore = 0;
	private int drawScore = 0;
	private int roundsPlayed = 0;
	private Choices choice = new Choices();
	public Choices getChoice()
	{
		return choice;
	}
	public void setPScore()
	{
		playerScore++;
	}
	public void setCScore()
	{
		computerScore++; 
	}
	public void setDScore()
	{
		drawScore++;
	}
	public void setRoundPlayed()
	{
		roundsPlayed++;
	}
	public int getPScore()
	{
		return playerScore;
	}
	public int getCScore()
	{
		return computerScore;
	}
	public int getDScore()
	{
		return drawScore;
	}
	public int getGamesPlayed()
	{
		return roundsPlayed;
	}
}
