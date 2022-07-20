public class Snake extends Obstacle{

    public Snake() {
        super(4, "Yılan", (Math.random() <= 0.5) ? 1 : 2*3, 12,0);
    }
}
