package proxy;

public class ProxyPatternDemo {
    public static void main(String[] args) {
        Image image = new ProxyImage("static.jpg");
        image.display();
        System.out.println("");
        image.destroy();

        Image image2 = (Image) ProxyImageDynamic.factory(new RealImage("dynamic.png"));
        image2.display();
        System.out.println("");
        image2.destroy();
    }
}
