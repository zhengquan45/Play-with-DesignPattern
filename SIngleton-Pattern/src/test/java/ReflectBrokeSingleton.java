import java.lang.reflect.Constructor;

public class ReflectBrokeSingleton {
    public static void main(String[] args) {
        try {
            Class<?> clazz = LazyInnerClassSingleton.class;
            Constructor<?> constructor = clazz.getDeclaredConstructor(null);
            constructor.setAccessible(true);
            Object c1 = constructor.newInstance();
            Object c2 = constructor.newInstance();
            System.out.println(c1);
            System.out.println(c2);
        }catch (Exception e){
            e.printStackTrace();
        }
    }


}
