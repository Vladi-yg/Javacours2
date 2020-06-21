public class Course {
    private Obstacle[] obstacles = {new Wall(2), new Wall(1), new Cross(100), new Water(10)};
    public Course() {
    }
    public void startCompetition(Competitor[] competitors) {
        for (Competitor c : competitors) {
            for ( Obstacle o : obstacles) {
                o.doIt(c);
                if (!c.isOnDistance()) break;
            }
        }
        for (Competitor c : competitors) {
            c.info();
        }
    }
}
