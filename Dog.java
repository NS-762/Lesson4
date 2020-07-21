public class Dog extends Animal { //задание 5
    protected int weight;

    public Dog(int weight) { //для задания 9
        this.weight = weight;
    }

    @Override
    public void run(int distance) {
        if (weight < 10) { //мелки собаки
            if (distance < 400)
                System.out.println("run: true");
            else
                System.out.println("run: false");
        } else {
            if (distance < 600) // большие собаки
                System.out.println("run: true");
            else
                System.out.println("run: false");
        }
    }

    public void swim(int distance) {
        if (distance < 10)
            System.out.println("run: true");
        else
            System.out.println("run: false");
    }

    public void jump(float height) {
        if (height < 0.5)
            System.out.println("run: true");
        else
            System.out.println("run: false");
    }
}
