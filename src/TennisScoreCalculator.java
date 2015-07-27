/**
 * Created by test on 7/27/2015.
 */
import java.util.*;
import java.lang.Math;

public class TennisScoreCalculator {
	private String playerScoreSequence;
	private int player1TotalPoints;
	private int player2TotalPoints;
	private static String[] scoreMapping = {"love", "15", "30", "40", "game"};
	private String player1Score;
	private String player2Score;
	public static char PLAYER_1_SYMBOL = 'D';
	public static char PLAYER_2_SYMBOL = 'F';  
	
	TennisScoreCalculator(String input){
		playerScoreSequence = input;
		player1TotalPoints = characterCount(PLAYER_1_SYMBOL);
		player2TotalPoints = characterCount(PLAYER_2_SYMBOL);
	}
	
private void calculateScores(){
		
		if (isDeuceEncountered(player1TotalPoints,player2TotalPoints)) {
			
			player1TotalPoints -= Math.min(player1TotalPoints,player2TotalPoints);
			player2TotalPoints -= Math.min(player1TotalPoints,player2TotalPoints);	
			
		}
		
	
	}

	public void displayScores(){
		
	}
	
	private boolean isDeuceEncountered(int a,int b){
		
		if(a >= 3 && b >= 3)
			return true;
		return false;
	}
	
	private int characterCount(char ch){
		int count = 0;
    		for (int i=0; i < playerScoreSequence.length(); i++)
    		{
        		if (playerScoreSequence.charAt(i) == ch)
        		{
             			count++;
        		}
    		}
    		return count;	
	}
	
	public void setPlayerScoreSequence(String input){
		playerScoreSequence = input;
	}
	
	private boolean isGameOver(){
        	return (Math.max(player1TotalPoints, player2TotalPoints) > 3 && Math.abs(player1TotalPoints - player2TotalPoints) >= 2 );
	}

	public String getPlayer1Score(){
		return player1Score;
	}

	public String getPlayer2Score(){
		return player1Score;
	}
	
	
}
