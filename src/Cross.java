public class Cross extends Obstacle {
    private int lenght;

    public Cross(int lenght) {
        this.lenght = lenght;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.run(lenght);
    }
}
