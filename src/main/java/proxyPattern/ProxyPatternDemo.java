package proxyPattern;

public class ProxyPatternDemo {
    public static void main(String[] args) {
        RealImage realImage = new RealImage("picture.png");
        realImage.display();
        ProxyImage proxyImage = new ProxyImage("picture.png");
        proxyImage.display();
    }
}
