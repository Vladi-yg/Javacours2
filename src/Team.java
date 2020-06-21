public class Team {
    private Competitor[] competitors = {new Dog("Бобик"), new Cat("Барсик"), new Human("Павел"), new Human("Сергей")};
    private String teamTitle;
    public Team() {
        this.competitors = competitors;
        this.teamTitle = "Redbone";
    }
    public void teamInfo() {
        for (Competitor c : competitors) {
            c.competitorInfo(competitors, teamTitle);
        }
    }
}
