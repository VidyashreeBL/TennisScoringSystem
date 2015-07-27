
public class TennisScoreCalculatorClient {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        TennisScoreCalculator tsc = new TennisScoreCalculator(input);
        tsc.showScoreboard();
    }    
}
