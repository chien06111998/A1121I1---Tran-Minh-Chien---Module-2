package clean_code_and_refactoring.thuc_hanh.bai_tap.tennis_game;

public class TennisGame {
    public static String getScore(String player1Name, String player2Name, int firstPlayer, int secondPlayer) {
        String score = " ";
        int tempScore = 0;
        if (firstPlayer == secondPlayer) {
            switch (firstPlayer) {
                case 0:
                    score = "Love-All";
                    break;
                case 1:
                    score = "Fifteen-All";
                    break;
                case 2:
                    score = "Thirty-All";
                    break;
                case 3:
                    score = "Forty-All";
                    break;
                default:
                    score = "Deuce";
                    break;

            }
        } else if (firstPlayer >= 4 || secondPlayer >= 4) {
            score = getGameResult(firstPlayer, secondPlayer);
        } else {
            for (int i = 1; i < 3; i++) {
                if (i == 1)
                    tempScore = firstPlayer;
                else {
                    score += "-";
                    tempScore = secondPlayer;
                }
                switch (tempScore) {
                    case 0:
                        score += "Love";
                        break;
                    case 1:
                        score += "Fifteen";
                        break;
                    case 2:
                        score += "Thirty";
                        break;
                    case 3:
                        score += "Forty";
                        break;
                }
            }
        }
        return score;
    }

    private static String getGameResult(int firstPlayer, int secondPlayer) {
        String score;
        int gameResult = firstPlayer - secondPlayer;
        if (gameResult == 1) score = "Advantage player1";
        else if (gameResult == -1) score = "Advantage player2";
        else if (gameResult >= 2) score = "Win for player1";
        else score = "Win for player2";
        return score;
    }
}
