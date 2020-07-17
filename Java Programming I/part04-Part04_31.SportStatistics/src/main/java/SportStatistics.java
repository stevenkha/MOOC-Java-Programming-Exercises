
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("File: ");
        String fileName = scan.nextLine();
        System.out.println("Team: ");
        String team = scan.nextLine();
        
        try (Scanner fileReader = new Scanner(Paths.get(fileName))) {
            int games = 0;
            int wins = 0;
            int loses = 0;
            
            while (fileReader.hasNextLine()) {
                
                String data = fileReader.nextLine();
                String[] parts = data.split(",");
                String homeTeamName = parts[0];
                String awayTeamName = parts[1];
                
                int homeTeamScore = Integer.valueOf(parts[2]);
                int awayTeamScore = Integer.valueOf(parts[3]);
                
                if (homeTeamName.equals(team)) {
                    games++;
                    if (homeTeamScore > awayTeamScore) {
                        wins++;
                    } else if (homeTeamScore < awayTeamScore) {
                        loses++;
                    }
                } else if (awayTeamName.equals(team)) {
                    games++;
                    if (awayTeamScore > homeTeamScore) {
                        wins++;
                    } else if (awayTeamScore < homeTeamScore) {
                        loses++;
                    }
                }
                
               
            }
            
            System.out.println("Games: " + games);
            System.out.println("Wins: " + wins);
            System.out.println("Losses: " + loses);
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        
        
    }

}
