public class Cat extends Animal { //задание 5

    @Override
    public void run(int distance) {
        if (distance < 200)
            System.out.println("run: true");
        else
            System.out.println("run: false");
    }

    public void swim(int distance) {
            System.out.println("Коты не умеют плавать");
    }

    public void jump(float height) {
        if (height < 2)
            System.out.println("run: true");
        else
            System.out.println("run: false");
    }

}
