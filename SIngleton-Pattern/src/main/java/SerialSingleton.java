import java.io.Serializable;

public class SerialSingleton implements Serializable {
    private final static SerialSingleton instance = new SerialSingleton();
    private SerialSingleton() {}
    public static SerialSingleton getInstance() {
        return instance;
    }

    private Object readResolve(){
        return instance;
    }
}
