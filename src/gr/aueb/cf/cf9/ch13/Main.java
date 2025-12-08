package gr.aueb.cf.cf9.ch13;

public class Main {
    public static void main(String[] args) {
        HelloUtil.sayHello();


        Point p1 = Point.getRandomPoint();
        System.out.println("Random Point 1: " + p1);

        // 2. Create and show 5 random points using a loop
        System.out.println("Generating 5 random points:");
        for (int i = 1; i <= 5; i++) {
            Point randomP = Point.getRandomPoint();
            System.out.println("Point " + i + ": " + randomP);

        }

        OnlyOneCodingFactory onlyOneCodingFactory1 = OnlyOneCodingFactory.getInstance();
        OnlyOneCodingFactory onlyOneCodingFactory2 = OnlyOneCodingFactory.getInstance();

        OnlyOneCodingLazy onlyOneCodingLazy1 = OnlyOneCodingLazy.getInstance();
        OnlyOneCodingLazy onlyOneCodingLazy2 = OnlyOneCodingLazy.getInstance();
    }
}
