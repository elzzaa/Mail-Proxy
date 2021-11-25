package proxyPattern;

public class ProxyImage implements Image{
    RealImage realImage;
    String fileName;
    ProxyImage(String fileName){
        this.fileName = fileName;
        realImage = new RealImage(fileName);
    }

    @Override
    public void display() {
        realImage.display();
    }

    public Object getRealImage() {
        return this.realImage;
    }
}
