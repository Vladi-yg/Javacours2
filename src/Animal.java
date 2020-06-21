public class Animal implements Competitor {
    protected  String type;
    protected String name;

    protected int maxRunDistance;
    protected int maxSwimDistance;
    protected int maxJumpHeight;

    protected boolean onDistance;

    @Override
    public boolean isOnDistance() {
        return onDistance;
    }

    public Animal (String type, String name, int maxJumpHeight, int maxRunDistance, int maxSwimDistance) {
        this.type = type;
        this.name = name;
        this.maxJumpHeight = maxJumpHeight;
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
        this.onDistance = true;
    }

    @Override
    public void run(int dist) {
        if (dist <= maxRunDistance) {
            System.out.println(type + " " + name + " хорошо справился с кроссом");
        } else {
            System.out.println(type + " " + name + " не справился с крссом");
            onDistance = false;
        }
    }

    @Override
    public void swim(int dist) {
        if (maxSwimDistance == 0) {
            System.out.println(type + " " + name + " не умеет плавать");
            onDistance = false;
            return;
        }
        if (dist <= maxSwimDistance) {
            System.out.println(type + " " + name + " отлично проплыл");
        } else {
            System.out.println(type + " " + name + " не смог проплыть");
        }
    }

    @Override
    public void jump(int height) {
        if (height <= maxJumpHeight) {
            System.out.println(type + " " + name + " удачно перепрыгнул через стену");
        } else {
            System.out.println(type + " " + name + " не смог перепрыгнуть через стену");
        }
    }

    @Override
    public void info() {
        System.out.println(type + " " + name + " - " + onDistance);
    }

    @Override
    public void competitorInfo(Competitor[] competitors, String teamTitle) {
        System.out.println(type + " под именем " + name + " " + "команды " + teamTitle + " " + "участвует в забеге");
    }
}
