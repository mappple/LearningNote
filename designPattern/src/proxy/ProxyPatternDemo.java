package proxy;

public class ProxyPatternDemo {
    public static void main(String[] args) {
//        Image image = new ProxyImage("test.jpg");
//        image.display();
//        System.out.println("");
//        image.display();

        Image image = (Image) ProxyImageDynamic.factory(new RealImage("test.png"));
        image.display();
        System.out.println("");
        image.display();
    }
}
