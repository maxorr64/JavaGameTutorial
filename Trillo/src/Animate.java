
public class Animate implements Runnable {

    private BlockBreakerPanel blockBreaker;

    public Animate(BlockBreakerPanel bp) {
        this.blockBreaker = bp;
    }

    @Override
    public void run() {
        while (true) {
            blockBreaker.update();
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println(e);
            }

        }
    }

}
