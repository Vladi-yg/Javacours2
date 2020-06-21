public class Human implements Competitor{
    private String name;

    private int maxRunDistance;
    private int maxJumpHeight;
    private int maxSwimDistance;

    private boolean active;

    @Override
    public boolean isOnDistance() {
        return active;
    }
    public Human (String name) {
        this.name = name;
        this.maxRunDistance = 5000;
        this.maxJumpHeight = 30;
        this.maxSwimDistance = 200;
        this.active = true;
    }


    @Override
    public void run(int dist) {
        if (dist <= maxRunDistance) {
            System.out.println(name + " хорошо справился с кроссом");
        } else {
            System.out.println(name + " не справился с крссом");
            active = false;
        }
    }

    @Override
    public void swim(int dist) {
        if (maxSwimDistance == 0) {
            System.out.println(name + " не умеет плавать");
            active = false;
            return;
        }
        if (dist <= maxSwimDistance) {
            System.out.println(name + " отлично проплыл");
        } else {
            System.out.println(name + " не смог проплыть");
        }
    }

    @Override
    public void jump(int height) {
        if (height <= maxJumpHeight) {
            System.out.println(name + " удачно перепрыгнул через стену");
        } else {
            System.out.println(name + " не смог перепрыгнуть через стену");
        }
    }

    @Override
    public void info() {
        System.out.println(name + " - " + active);
    }

    @Override
    public void competitorInfo(Competitor[] competitors, String teamTitle) {
        System.out.println("Участник под именем " + name + " " + "команды " + teamTitle + " " + "участвует в забеге");
    }
}
