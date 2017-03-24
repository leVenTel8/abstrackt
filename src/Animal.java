public abstract class Animal {
    private int weight = 10;
    private int height = 4;

    abstract void go();

    abstract void jump();

    public long grow(long gr){
        long ret = gr+1;
        return ret;
    }
}
