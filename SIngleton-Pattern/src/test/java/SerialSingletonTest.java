import java.io.*;

public class SerialSingletonTest {
    public static void main(String[] args){
        SerialSingleton s1 = null;
        SerialSingleton s2 = SerialSingleton.getInstance();

        FileOutputStream fos = null;

        try {
            fos = new FileOutputStream("SerialSingleton.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s2);
            oos.flush();
            oos.close();

            FileInputStream fis = new FileInputStream("SerialSingleton.obj");

            ObjectInputStream ois = new ObjectInputStream(fis);
            s1 = (SerialSingleton) ois.readObject();
            ois.close();
            System.out.println(s1);
            System.out.println(s2);
            System.out.println(s1 == s2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
