public interface Competitor {
    void run(int dist);
    void swim(int dist);
    void jump(int height);
    boolean isOnDistance();
    void info();
    void competitorInfo(Competitor[] competitors, String teamTitle);
}
