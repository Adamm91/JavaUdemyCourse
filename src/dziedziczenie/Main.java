package dziedziczenie;

public class Main {
    public static void main(String[] args) {

        Zombie zombie = new Zombie(80, 50, 20);
        Zombie zombie1 = new Zombie(80, 50,20);
        Zombie zombie2 = new Zombie(80, 50,20);

        Skeleton skeleton = new Skeleton(50, 200,30);
        Skeleton skeleton1 = new Skeleton(50, 200,30);
        Skeleton skeleton2 = new Skeleton(50, 200,30);

        System.out.println(skeleton);

        System.out.println(zombie);



    }

}
