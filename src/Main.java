public class Main {

    public static void main(String[] args) {
      init();
    }
    public static void init() {
        Course course = new Course();
        Team team = new Team();
        team.teamInfo();
        course.startCompetition(new Competitor[]{new Dog("Бобик"), new Cat("Барсик"), new Human("Павел"), new Human("Сергей")});
    }
}