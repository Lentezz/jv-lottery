package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        Ball[] balls = {lottery.getRandomBall(), lottery.getRandomBall(), lottery.getRandomBall()};
        for (var ball : balls) {
            System.out.println(ball);
        }
    }
}
