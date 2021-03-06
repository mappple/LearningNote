package proxy;

public class ProxyImage implements Image{
    private Image realImage;
    private String fileName;
    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }
    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }

    @Override
    public void destroy() {
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.destroy();
    }
}
