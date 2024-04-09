import java.io.FileNotFoundException;
import java.io.IOException;

class Animal {
    void sound() throws FileNotFoundException {
        System.out.println("Animal sounds");
    }
}
class Monkey extends Animal {
    void sound() throws FileNotFoundException {
        System.out.println("Monkey sounding..");
    }{}

    public static void main(String[] args) throws IOException {
        Animal a = new Monkey();
        a.sound();
    }
}
