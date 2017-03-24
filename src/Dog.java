
public class Dog extends Animal {
    @Override
    void go() {
        System.out.println("Я собака и я хожу ");
    }

    @Override
    void jump() {
        System.out.println("Я собака и я прыгаю ");
    }
    public long grow(long gr){
        long ret = gr+2;
        return ret;
    }
}