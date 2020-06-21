public class Water extends Obstacle {
    private int lenght;

    public Water(int lenght) {
        this.lenght = lenght;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.swim(lenght);
    }
}
