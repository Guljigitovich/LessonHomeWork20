public class Parallelepiped {
private int height;
private int length;
private int width;

    public Parallelepiped(int height, int length, int width) {
        this.height = height;
        this.length = length;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Parallelepiped{" +
                "height=" + height +
                ", length=" + length +
                ", width=" + width +
                '}';
    } public void method1(int height,int length, int width){
        System.out.println(2*((height*length)+(length*width)+(height*width)));
    }public void method2 (int height, int length, int width){
        System.out.println((length*height*width));
    }
}
